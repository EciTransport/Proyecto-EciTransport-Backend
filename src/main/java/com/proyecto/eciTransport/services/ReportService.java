package com.proyecto.eciTransport.services;

import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.repositories.ECITransportException;
import com.proyecto.eciTransport.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    @Autowired
    ReportRepository reportesRepository;


    /**
     * consult a specific report
     * @param id of specific report
     * @return report
     */
    public ReportModel consultReport(long id) {
        try{
            return reportesRepository.consultReport(id);
        }catch (ECITransportException e){
            e.printStackTrace();
            return null;
        }
    }

}
