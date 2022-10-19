package com.proyecto.eciTransport.controllers;

import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/report")
public class ReportController {

    @Autowired
    ReportService reportService;

    @GetMapping
    public List<ReportModel> consultReports(){
        return reportService.getReports();
    }

    @GetMapping("/{id}")
    public Optional<ReportModel> consultReport(@PathVariable long id){
        System.out.println("idddd"+id);
            return reportService.getReportById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<ReportModel> addReport(@RequestBody ReportModel report){
        reportService.addReport(report);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
