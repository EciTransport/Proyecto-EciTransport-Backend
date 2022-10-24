package com.proyecto.eciTransport.repositories.Impl;

import com.proyecto.eciTransport.models.ImagesReportModel;
import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.models.UserModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class ReportRepositoryImpl  {

    private final ArrayList<ReportModel> reports = new ArrayList<>();

    public ReportRepositoryImpl() {
        //ImagesReport
        ArrayList<ImagesReportModel> imagesReport1 = new ArrayList<>();
        ImagesReportModel image1 = new ImagesReportModel("https://cloudfront-us-east-1.images.arcpublishing.com/infobae/JJKSV7KZLBDNRNJPMEIQNAU2KM.jpg");
        imagesReport1.add(image1);
        ArrayList<ImagesReportModel> imagesReport2 = new ArrayList<>();
        ImagesReportModel image2 = new ImagesReportModel("https://www.eltiempo.com/files/image_950_534/uploads/2021/07/02/60df1785d590f.jpeg");
        imagesReport2.add(image2);
        ArrayList<ImagesReportModel> imagesReport3 = new ArrayList<>();
        //Image Profile
        String imageProfile1 = "https://i.pinimg.com/736x/91/b6/50/91b6505aaac2759622421993ad1de8f5.jpg";
        String imageProfile2 = "https://i.pinimg.com/originals/f3/4b/64/f34b64bccb514d7a3a9b3449444d6b38.jpg";
        String imageProfile3 = "https://i.pinimg.com/736x/98/4b/a4/984ba4eafd168286f4e840de24f2976b.jpg";
        //CreateUser
        UserModel user1 = new UserModel(1, "Carlos Orduz", "carlos.orduz@escuelaing.co", "12345", imageProfile1);
        UserModel user2 = new UserModel(2, "Valentina Alvarado", "valentina.alvarado@escuelaing.co", "12345", imageProfile2);
        UserModel user3 = new UserModel(3, "Yesid Mora", "yesid.mora@escuelaing.co", "12345", imageProfile3);
        //CreateReports
        ReportModel reportModel1 = new ReportModel(1, user1, " Accidente Bicitaxi", new Date(), "Sur-Norte", "Calle 187",2, imagesReport1);
        ReportModel reportModel2 = new ReportModel(2, user2, " Accidente Tractomula", new Date(), "Sur-Norte", "Calle 200",3, imagesReport2);
        ReportModel reportModel3 = new ReportModel(3, user3, " Accidente Motocicleta", new Date(), "Sur-Norte", "Calle 72",6, imagesReport3);
        reports.add(reportModel1);
        reports.add(reportModel2);
        reports.add(reportModel3);
    }

    public void crateReport(long id, UserModel author, String description, Date hourReport, String sense, String location, long numberLikes, ArrayList imagesReport) {
        ReportModel newReport = new ReportModel(id,author,description,hourReport,sense,location,numberLikes,imagesReport);
        reports.add(newReport);
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
