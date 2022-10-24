package com.proyecto.eciTransport.controllers;

import com.google.gson.Gson;
import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/reports/")
@CrossOrigin(origins = "http://localhost:3000")
public class ReportController {

    @Autowired
    ReportService reportService;

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> postReport(@RequestBody ReportModel report) {
        reportService.createReport(report);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @RequestMapping(path = "id/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getReport(@PathVariable long id) {
        Optional<ReportModel> report = reportService.consultReport(id);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(report), HttpStatus.ACCEPTED);
    }
    @GetMapping
    public ResponseEntity<?> getAllReports() {
        List<ReportModel> reportModel = reportService.getAllReports();
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

    @RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteReport(@PathVariable long id) {
        reportService.deleteReport(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
