package com.proyecto.eciTransport.repositories;

import com.proyecto.eciTransport.models.ReportModel;

import java.sql.Timestamp;
import java.util.ArrayList;

public interface ReportRepository {

    /**
     * Create new report
     * @param id id report
     * @param author name author
     * @param description description report
     * @param hourReport creation time
     */
    public void crateReport(long id, String author, String description, Timestamp hourReport, String sense, String location, long numberLikes);

    /**
     * Get All Reports
     * @return ArrayList the reports
     */
    public ArrayList<ReportModel> getAllReports() throws ECITransportException;


    /**
     * Get All Reports with specific location
     * @return ArrayList the reports
     */
    public ArrayList<ReportModel> getAllReportsLocation(String location) throws ECITransportException;


    public ReportModel consultReport(long id) throws ECITransportException;

}