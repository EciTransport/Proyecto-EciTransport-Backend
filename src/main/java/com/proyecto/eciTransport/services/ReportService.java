package com.proyecto.eciTransport.services;

import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@EnableMongoRepositories(basePackageClasses = ReportRepository.class)
@Service
public class ReportService {

    @Autowired
    ReportRepository reportRepository;




    public Optional<ReportModel> getReportById(long id) {

        System.out.println("Getting item by name: " + id);
        Optional<ReportModel> rm =reportRepository.findById(id);
        System.out.println(rm);
        return rm;
    }

    void createReportItems() {
        System.out.println("Data creation started...");
        reportRepository.save(new ReportModel(12345, "Carlos", "hola", new Date()));
        System.out.println("Data creation complete...");
    }

    public List<ReportModel> getReports() {
        return  reportRepository.findAll();
    }

    public void addReport(ReportModel report) {
        ReportModel newreport = new ReportModel(report.getId(), report.getAuthor(), report.getDescription(),report.getHourReport());
        reportRepository.save(newreport);
    }
}



