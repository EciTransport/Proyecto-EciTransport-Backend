package com.proyecto.eciTransport.controllers;

import com.google.gson.Gson;
import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/reports/")
@CrossOrigin()
public class ReportController {

    @Autowired
    ReportService reportService;

    @GetMapping
    public ResponseEntity<?> getAllReports() {
        List<ReportModel> reportModel = reportService.getAllReports();
        return new ResponseEntity<>(reportModel, HttpStatus.ACCEPTED);
    }
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> postReport(@RequestBody ReportModel report) {
        ReportModel reportModel = reportService.createReport(report);
        return new ResponseEntity<>(reportModel, HttpStatus.CREATED);
    }
    @RequestMapping(path = "id/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getReport(@PathVariable String id) {
        ReportModel report = reportService.consultReport(id);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(report), HttpStatus.ACCEPTED);
    }
    @RequestMapping(path = "reportsUserEmail/{email}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getReportUserEmail(@PathVariable String email) {
        List<ReportModel> reportModel = reportService.getReportUserEmail(email);
        return new ResponseEntity<>(reportModel, HttpStatus.ACCEPTED);
    }
    @RequestMapping(path = "delete/{id}", method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteReport(@PathVariable String id) {
        reportService.deleteReport(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    @RequestMapping(path = "likeAdd/{idReport}/{idUser}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addUserListLike(@PathVariable String idReport, @PathVariable long idUser) {
        ReportModel report = reportService.addUserListLike(idReport, idUser);
        return new ResponseEntity<>(report, HttpStatus.ACCEPTED);
    }
    @RequestMapping(path = "likeDel/{idReport}/{idUser}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteUserListLike(@PathVariable String idReport, @PathVariable long idUser) {
        ArrayList<Long> list =  reportService.deleteUserListLike(idReport, idUser);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(list), HttpStatus.ACCEPTED);
    }

}
