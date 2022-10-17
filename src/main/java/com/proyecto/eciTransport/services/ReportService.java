package com.proyecto.eciTransport.services;

import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.repositories.ECITransportException;
import com.proyecto.eciTransport.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class ReportService {

    @Autowired
    ReportRepository reportRepository;

    public Optional<ReportModel> consultResport(long id) {
        return reportRepository.findById(id);
    }
}


    /**
     * Create new report
     * @param id id report
     * @param author name author
     * @param description description report
     * @param hourReport creation time
     *//*
    public void createReport(long id, String author, String description, Timestamp hourReport) {
        reportesRepository.crateReport(id,author,description,hourReport);
    }

    *//**
     * Get All Reports
     * @return ArrayList the reports
     *//*
    public ArrayList<ReportModel> getAllReports() {
        return reportesRepository.getAllReports();
    }
    */
    /**
     * consult a specific report
     * @param id of specific report
     * @return report
     **/
    /*
    public ReportModel consultReport(long id) {
        try {
            return reportesRepository.consultReport(id);
        } catch (ECITransportException e) {
            e.printStackTrace();
            return null;
        }
}
*/