package com.proyecto.eciTransport.repositories.Impl;

import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.repositories.ReportRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ReportRepositoryImpl implements ReportRepository {

    private ArrayList<ReportModel> reports = new ArrayList<>();

    public ReportRepositoryImpl() {
        //CreateReports
    }
}
