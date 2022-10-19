package com.proyecto.eciTransport.controllers;

import com.google.gson.Gson;
import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.models.UsuarioModel;
import com.proyecto.eciTransport.repositories.ECITransportException;
import com.proyecto.eciTransport.services.ReportService;
import com.proyecto.eciTransport.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("v1/reports")
public class ReportController {

    @Autowired
    ReportService reportService;

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> postReport(@RequestBody ReportModel report) {
        reportService.createReport(report);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getReport(@PathVariable long id) {
        ReportModel report = reportService.consultReport(id);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(report), HttpStatus.ACCEPTED);
    }
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllReports() {
        ArrayList<ReportModel> reportModel = reportService.getAllReports();
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(reportModel), HttpStatus.ACCEPTED);
    }
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllReportsDate(@PathVariable Date date) {
        ArrayList<ReportModel> reportModel = reportService.getAllReportsDate(date);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(reportModel), HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllReportsLocation(@PathVariable String location) {
        ArrayList<ReportModel> reportModel = reportService.getAllReportsLocation(location);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(reportModel), HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllReportsSense(@PathVariable String sense) {
        ArrayList<ReportModel> reportModel = reportService.getAllReportsSense(sense);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(reportModel), HttpStatus.ACCEPTED);
    }

}
