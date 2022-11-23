package com.proyecto.eciTransport.controllers;

import com.google.gson.Gson;
import com.proyecto.eciTransport.models.CommentModel;
import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/reports/")
@CrossOrigin()
public class ReportController {

    @Autowired
    ReportService reportService;

    @GetMapping
    public ResponseEntity<?> getAllReports() {
        List<ReportModel> reportModel = reportService.getAllReports();
        Gson gson = new Gson();
        return new ResponseEntity<>(reportModel, HttpStatus.ACCEPTED);
    }
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> postReport(@RequestBody ReportModel report) {
        reportService.createReport(report);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @RequestMapping(path = "id/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getReport(@PathVariable String id) {
        ReportModel report = reportService.consultReport(id);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(report), HttpStatus.ACCEPTED);
    }
    @RequestMapping(path = "reportsUser/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getReportUser(@PathVariable long id) {
        List<ReportModel> reportModel = reportService.getReportUser(id);
        Gson gson = new Gson();
        return new ResponseEntity<>(reportModel, HttpStatus.ACCEPTED);
    }
    @RequestMapping(path = "reportsUserEmail/{email}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getReportUserEmail(@PathVariable String email) {
        List<ReportModel> reportModel = reportService.getReportUserEmail(email);
        Gson gson = new Gson();
        return new ResponseEntity<>(reportModel, HttpStatus.ACCEPTED);
    }
    @RequestMapping(path = "date/{date}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllReportsDate(@PathVariable Date date) {
        List<ReportModel> reportModel = reportService.getAllReportsDate(date);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(reportModel), HttpStatus.ACCEPTED);
    }
    @RequestMapping(path = "location/{location}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllReportsLocation(@PathVariable String location) {
        List<ReportModel> reportModel = reportService.getAllReportsLocation(location);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(reportModel), HttpStatus.ACCEPTED);
    }
    @RequestMapping(path = "sense/{sense}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllReportsSense(@PathVariable String sense) {
        List<ReportModel> reportModel = reportService.getAllReportsSense(sense);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(reportModel), HttpStatus.ACCEPTED);
    }
    @RequestMapping(path = "delete/{id}", method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteReport(@PathVariable String id) {
        reportService.deleteReport(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    @RequestMapping(path = "listLike/{idReport}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getListLikeReport(@PathVariable String idReport) {
        ArrayList<Long> list = reportService.getListLikeReport(idReport);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(list), HttpStatus.ACCEPTED);
    }
    @RequestMapping(path = "likeAdd/{idReport}/{idUser}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addUserListLike(@PathVariable String idReport, @PathVariable long idUser) {
        ArrayList<Long> list = reportService.addUserListLike(idReport, idUser);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(list), HttpStatus.ACCEPTED);
    }
    @RequestMapping(path = "likeDel/{idReport}/{idUser}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteUserListLike(@PathVariable String idReport, @PathVariable long idUser) {
        ArrayList<Long> list =  reportService.deleteUserListLike(idReport, idUser);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(list), HttpStatus.ACCEPTED);
    }

}
