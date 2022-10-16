package com.proyecto.eciTransport.services;

import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;

@Service
public class ReportService {

    @Autowired
    ReportRepository reportesRepository;

    /**
     * Create new report
     * @param id id report
     * @param author name author
     * @param description description report
     * @param hourReport creation time
     */
    public void createReport(long id, String author, String description, Timestamp hourReport) {
        reportesRepository.crateReport(id,author,description,hourReport);
    }

    /**
     * Get All Reports
     * @return ArrayList the reports
     */
    public ArrayList<ReportModel> getAllReports() {
        return reportesRepository.getAllReports();
    }

}
