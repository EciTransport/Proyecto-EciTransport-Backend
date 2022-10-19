package com.proyecto.eciTransport.services;

import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.repositories.ECITransportException;
import com.proyecto.eciTransport.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.sql.Date;

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
    public void createReport(long id, String author, String description, Timestamp hourReport, String sense, String location, long numberLikes) {
        reportesRepository.crateReport(id,author,description,hourReport,sense,location,numberLikes);
    }

    /**
     * Get All Reports
     * @return ArrayList the reports
     */
    public ArrayList<ReportModel> getAllReports() {
        try {
            return reportesRepository.getAllReports();
        } catch (ECITransportException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Get All Reports with specific location
     * @return ArrayList the reports
     */
    public ArrayList<ReportModel> getAllReportsLocation(String location) {
        try {
            return reportesRepository.getAllReportsLocation(location);
        } catch (ECITransportException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Get All Reports with specific location
     * @return ArrayList the reports
     */
    public ArrayList<ReportModel> getAllReportsSense(String sense) {
        try {
            return reportesRepository.getAllReportsSense(sense);
        } catch (ECITransportException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Get All Reports with specific Date
     * @return ArrayList the reports
     */
    public ArrayList<ReportModel> getAllReportsDate(Date date) {
        try {
            return reportesRepository.getAllReportsDate(date);
        } catch (ECITransportException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * consult a specific report
     * @param id of specific report
     * @return report
     */
    public ReportModel consultReport(long id) {
        try {
            return reportesRepository.consultReport(id);
        } catch (ECITransportException e) {
            e.printStackTrace();
            return null;
        }
    }
}
