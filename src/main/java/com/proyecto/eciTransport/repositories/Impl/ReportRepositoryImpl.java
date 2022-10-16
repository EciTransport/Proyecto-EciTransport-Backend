package com.proyecto.eciTransport.repositories.Impl;

import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.repositories.ECITransportException;
import com.proyecto.eciTransport.repositories.ReportRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ReportRepositoryImpl implements ReportRepository {

    private ArrayList<ReportModel> reports = new ArrayList<>();

    public ReportRepositoryImpl() {
        //CreateReports
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
