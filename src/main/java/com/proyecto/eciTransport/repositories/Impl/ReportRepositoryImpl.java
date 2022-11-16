package com.proyecto.eciTransport.repositories.Impl;

import com.proyecto.eciTransport.models.CommentModel;
import com.proyecto.eciTransport.models.ImagesReportModel;
import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.models.UserModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class ReportRepositoryImpl  {

    private final ArrayList<ReportModel> reports = new ArrayList<>();

    public ReportRepositoryImpl() {
        //Image Profile
        String imageProfile1 = "https://i.pinimg.com/736x/91/b6/50/91b6505aaac2759622421993ad1de8f5.jpg";
        String imageProfile2 = "https://i.pinimg.com/originals/f3/4b/64/f34b64bccb514d7a3a9b3449444d6b38.jpg";
        String imageProfile3 = "https://i.pinimg.com/736x/98/4b/a4/984ba4eafd168286f4e840de24f2976b.jpg";

    }

    public ArrayList<ReportModel> getAllReports() {
        return reports;
    }


    public ArrayList<ReportModel> getAllReportsLocation(String location) {
        ArrayList<ReportModel> reportsLocation = new ArrayList<>();
        for (ReportModel r: reports) {
            if (Objects.equals(r.getUbicacion(), location)) reportsLocation.add(r);
        }
        return reportsLocation;
    }


    public ArrayList<ReportModel> getAllReportsSense(String sense) {
        ArrayList<ReportModel> reportsSense = new ArrayList<>();
        for (ReportModel r: reports) {
            if (Objects.equals(r.getUbicacion(), sense)) reportsSense.add(r);
        }
        return reportsSense;
    }


    public ArrayList<ReportModel> getAllReportsDate(Date date) {
        ArrayList<ReportModel> reportsDate = new ArrayList<>();
        for (ReportModel r: reports) {
            java.sql.Date dateReport = new java.sql.Date(r.getHourReport().getTime());
            if (dateReport == date) reportsDate.add(r);
        }
        return reportsDate;
    }


    public ReportModel consultReport(long id) {
        for (ReportModel report: reports) {
            if(report.getId() == id){
                return report;
            }
        }
        return null;
    }


    public void deleteReport(long id){
        ReportModel reportDel = consultReport(id);
        reports.remove(reportDel);
    }

}
