package com.proyecto.eciTransport.repositories.Impl;

import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.repositories.ECITransportException;
import com.proyecto.eciTransport.repositories.ReportRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.sql.Date;
import java.util.Objects;

@Repository
public class ReportRepositoryImpl implements ReportRepository {

    private final ArrayList<ReportModel> reports = new ArrayList<>();

    public ReportRepositoryImpl() {
        //CreateReports
        ReportModel reportModel1 = new ReportModel(1, "Cesar", " Accidente Bicitaxi", new Timestamp(0), "Sur-Norte", "Calle 187",0);
        ReportModel reportModel2 = new ReportModel(2, "Cesar", " Accidente Tractomula", new Timestamp(0), "Sur-Norte", "Calle 200",0);
        ReportModel reportModel3 = new ReportModel(3, "Esteban", " Accidente Motocicleta", new Timestamp(0), "Sur-Norte", "Calle 72",0);
        reports.add(reportModel1);
        reports.add(reportModel2);
        reports.add(reportModel3);
    }

    @Override
    public void crateReport(long id, String author, String description, Timestamp hourReport, String sense, String location, long numberLikes) {
        ReportModel newReport = new ReportModel(id,author,description,hourReport,sense,location,numberLikes);
        reports.add(newReport);
    }

    @Override
    public ArrayList<ReportModel> getAllReports() {
        return reports;
    }

    @Override
    public ArrayList<ReportModel> getAllReportsLocation(String location) {
        ArrayList<ReportModel> reportsLocation = new ArrayList<>();
        for (ReportModel r: reports) {
            if (Objects.equals(r.getUbicacion(), location)) reportsLocation.add(r);
        }
        return reportsLocation;
    }

    @Override
    public ArrayList<ReportModel> getAllReportsSense(String sense) {
        ArrayList<ReportModel> reportsSense = new ArrayList<>();
        for (ReportModel r: reports) {
            if (Objects.equals(r.getUbicacion(), sense)) reportsSense.add(r);
        }
        return reportsSense;
    }

    @Override
    public ArrayList<ReportModel> getAllReportsDate(Date date) {
        ArrayList<ReportModel> reportsDate = new ArrayList<>();
        for (ReportModel r: reports) {
            java.sql.Date dateReport = new java.sql.Date(r.getHourReport().getTime());
            if (dateReport == date) reportsDate.add(r);
        }
        return reportsDate;
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
    }

}
