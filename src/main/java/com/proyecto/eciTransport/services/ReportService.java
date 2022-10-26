package com.proyecto.eciTransport.services;

import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
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
        reportRepository.save(new ReportModel(report.getId(),report.getAuthor(),report.getDescription(),report.getHourReport(),report.getSentido(),report.getUbicacion(),report.getNumberlikes(),report.getImagesReport()));
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


}
