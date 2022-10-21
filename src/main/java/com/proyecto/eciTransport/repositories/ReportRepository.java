package com.proyecto.eciTransport.repositories;

import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.models.UsuarioModel;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.sql.Date;

public interface ReportRepository {

    /**
     * Create new report
     * @param id id report
     * @param author name author
     * @param description description report
     * @param hourReport creation time
     */
    public void crateReport(long id, UsuarioModel author, String description, Timestamp hourReport, String sense,
                            String location, long numberLikes, ArrayList imagesReport);

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

    /**
     * Get All Reports with specific sense
     * @return ArrayList the reports
     */
    public ArrayList<ReportModel> getAllReportsSense(String sense) throws ECITransportException;


    /**
     * Get All Reports with specific Date
     * @return ArrayList the reports
     */
    public ArrayList<ReportModel> getAllReportsDate(Date date) throws ECITransportException;

    /**
     * consult a specific report
     * @param id of specific report
     * @return report
     */
    public ReportModel consultReport(long id) throws ECITransportException;

}
