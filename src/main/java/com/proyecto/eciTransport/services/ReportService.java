package com.proyecto.eciTransport.services;

import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;
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
    public ReportModel createReport(ReportModel report) {
        reportRepository.save(report);
        report.setIdString(report.getId().toString());
        return report;
    }

    /**
     * Get All Reports
     * @return ArrayList the reports
     */
    public List<ReportModel> getAllReports() {
        List<ReportModel> reportsAll = reportRepository.findAll();
        for(ReportModel r: reportsAll) {
            r.setIdString(r.getId().toString());
        }
        return reportsAll;
    }

    /**
     * Get reports User
     * @param email email User
     * @return List Reports
     */
    public List<ReportModel> getReportUserEmail(String email) {
        List<ReportModel> reports = reportRepository.findAll().stream().filter(r -> Objects.equals(r.getAuthor().getEmail(), email)).collect(Collectors.toList());
        for(ReportModel r: reports) {
            r.setIdString(r.getId().toString());
        }
        return reports;
    }

    /**
     * consult a specific report
     * @param id of specific report
     * @return report
     */
    public ReportModel consultReport(String id) {
        ReportModel report = reportRepository.findAll().stream().filter(r -> r.getId().toString().equals(id)).collect(Collectors.toList()).get(0);
        report.setIdString(report.getId().toString());
        return report;
    }

    /**
     * Delete Report
     * @param id Id report
     */
    public void deleteReport(String id) {
        ReportModel report = reportRepository.findAll().stream().filter(r -> r.getId().toString().equals(id)).collect(Collectors.toList()).get(0);
        reportRepository.delete(report);
    }

    /**
     * Add User List User Likes
     * @param idReport is Report
     * @param idUser idUser
     */
    public ReportModel addUserListLike(String idReport, long idUser) {
        ReportModel reportModel = reportRepository.findAll().stream().filter(r -> r.getId().toString().equals(idReport)).collect(Collectors.toList()).get(0);
        if (!reportModel.getIdUserLikes().contains(idUser)) {
            reportModel.getIdUserLikes().add(idUser);
        }
        createReport(reportModel);
        return reportModel;
    }

    /**
     * Delete User List User Likes
     * @param idReport is Report
     * @param idUser idUser
     */
    public ArrayList<Long> deleteUserListLike(String idReport, long idUser) {
        ReportModel reportModel = reportRepository.findAll().stream().filter(r -> r.getId().toString().equals(idReport)).collect(Collectors.toList()).get(0);
        reportModel.getIdUserLikes().remove(idUser);
        createReport(reportModel);
        return reportModel.getIdUserLikes();
    }

}
