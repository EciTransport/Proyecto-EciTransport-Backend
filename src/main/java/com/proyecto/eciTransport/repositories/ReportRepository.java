package com.proyecto.eciTransport.repositories;

import com.proyecto.eciTransport.models.ReportModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.ArrayList;

@Repository
public interface ReportRepository extends MongoRepository<ReportModel,Long> {


/**
     * Create new report
     * @param id id report
     * @param author name author
     * @param description description report
     * @param hourReport creation time
     *//*

    public void crateReport(long id, String author, String description, Timestamp hourReport);

    */
/**
     * Get All Reports
     * @return ArrayList the reports
     *//*

    public ArrayList<ReportModel> getAllReports();

    public ReportModel consultReport(long id) throws ECITransportException;
*/

}
