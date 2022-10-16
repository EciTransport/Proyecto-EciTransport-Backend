package com.proyecto.eciTransport.repositories;

import com.proyecto.eciTransport.models.ReportModel;

import java.sql.Timestamp;

public interface ReportRepository {

    /**
     * Create new report
     * @param id id report
     * @param author name author
     * @param description description report
     * @param hourReport creation time
     */
    public void crateReport(long id, String author, String description, Timestamp hourReport);
}
