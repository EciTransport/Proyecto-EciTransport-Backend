package com.proyecto.eciTransport.services;

import com.proyecto.eciTransport.models.CommentModel;
import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.*;
import java.util.stream.Collectors;

@EnableMongoRepositories(basePackageClasses = ReportRepository.class)
@Service
public class ReportService {

    @Autowired
    ReportRepository reportRepository;

    /**
     * Create new report
     * @param report Object Report
     */
    public void createReport(ReportModel report) {
        reportRepository.save(report);
    }

    /**
     * Get All Reports
     * @return ArrayList the reports
     */
    public List<ReportModel> getAllReports() {
        return reportRepository.findAll();
    }


    /**
     * Get All Reports
     * @return ArrayList the reports
     */
    public List<ReportModel> getReportUser(long id) {
        return reportRepository.findAll().stream().filter(r -> r.getAuthor().getId() == (id)).collect(Collectors.toList());
    }

    public List<ReportModel> getReportUserEmail(String email) {
        return reportRepository.findAll().stream().filter(r -> Objects.equals(r.getAuthor().getEmail(), email)).collect(Collectors.toList());
    }


    /**
     * Get All Reports with specific location
     * @return ArrayList the reports
     */
    public List<ReportModel> getAllReportsLocation(String location) {
      return reportRepository.findAll().stream().filter(r -> r.getUbicacion().equals(location)).collect(Collectors.toList());
    }

    /**
     * Get All Reports with specific location
     * @return ArrayList the reports
     */
    public List<ReportModel> getAllReportsSense(String sense) {
            return reportRepository.findAll().stream().filter(r ->r.getSentido().equals(sense)).collect(Collectors.toList());
    }

    /**
     * Get All Reports with specific Date
     * @return ArrayList the reports
     */
    public List<ReportModel> getAllReportsDate(Date date) {
            return reportRepository.findAll().stream().filter(r -> r.getHourReport().equals(date)).collect(Collectors.toList());
    }

    /**
     * consult a specific report
     *
     * @param id of specific report
     * @return report
     */
    public Optional<ReportModel> consultReport(long id) {
        return reportRepository.findById(id);
    }

    /**
     * Delete Report
     * @param id Id report
     */
    public void deleteReport(long id) {
        reportRepository.deleteById(id);
    }

    /**
     * Add Comment Report
     * @param idReport id Report
     * @param commentModel New Comment
     */
    public void addComment(long idReport, CommentModel commentModel) {
        ReportModel reportModel = reportRepository.findAll().stream().filter(r -> Objects.equals(r.getId(), idReport)).collect(Collectors.toList()).get(0);
        reportModel.getComments().add(commentModel);
        createReport(reportModel);
    }

    /**
     * Add User List User Likes
     * @param idReport is Report
     * @param idUser idUser
     */
    public ArrayList<Long> addUserListLike(long idReport, long idUser) {
        ReportModel reportModel = reportRepository.findAll().stream().filter(r -> Objects.equals(r.getId(), idReport)).collect(Collectors.toList()).get(0);
        reportModel.getIdUserLikes().add(idUser);
        createReport(reportModel);
        return reportModel.getIdUserLikes();
    }

    /**
     * Delete User List User Likes
     * @param idReport is Report
     * @param idUser idUser
     */
    public ArrayList<Long> deleteUserListLike(long idReport, long idUser) {
        ReportModel reportModel = reportRepository.findAll().stream().filter(r -> Objects.equals(r.getId(), idReport)).collect(Collectors.toList()).get(0);
        reportModel.getIdUserLikes().remove(idUser);
        createReport(reportModel);
        return reportModel.getIdUserLikes();
    }

}
