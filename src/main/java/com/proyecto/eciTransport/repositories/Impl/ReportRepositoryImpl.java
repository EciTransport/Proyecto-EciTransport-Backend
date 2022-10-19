package com.proyecto.eciTransport.repositories.Impl;

import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.repositories.ECITransportException;
import com.proyecto.eciTransport.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;



public class ReportRepositoryImpl {

/*
    private ArrayList<ReportModel> reports = new ArrayList<>();

    public ReportRepositoryImpl() {
        //CreateReports
        ReportModel reportModel1 = new ReportModel(1, "Cesar", " Accidente calle 187", new Timestamp(0));
        ReportModel reportModel2 = new ReportModel(2, "Cesar", " Accidente calle 222", new Timestamp(0));
        ReportModel reportModel3 = new ReportModel(3, "Esteban", " Accidente calle 200", new Timestamp(0));
        reports.add(reportModel1);
        reports.add(reportModel2);
        reports.add(reportModel3);
    }

    @Override
    public void crateReport(long id, String author, String description, Timestamp hourReport) {
        ReportModel newReport = new ReportModel(id,author,description,hourReport);
        reports.add(newReport);
    }

    @Override
    public ArrayList<ReportModel> getAllReports() {
        return reports;
    }

    @Override
    public ReportModel consultReport(long id) throws ECITransportException {
        for (ReportModel report: reports) {
            if(report.getId() == id){
                return report;
            }else{
                throw new ECITransportException("the report doesn't exist");
            }
        }
        return null;
    }*/

}
