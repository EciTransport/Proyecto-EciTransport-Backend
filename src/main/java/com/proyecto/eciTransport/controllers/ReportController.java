package com.proyecto.eciTransport.controllers;

import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.repositories.ReportRepository;
import com.proyecto.eciTransport.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("v1/reportes")
public class ReportController {

    @Autowired
    ReportService reportService;

    @GetMapping("/report/{id}")
    public Optional<ReportModel> consultReport(@PathVariable long id){
            return reportService.consultResport(id);
    }
}
