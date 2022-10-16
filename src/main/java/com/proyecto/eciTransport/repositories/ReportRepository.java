package com.proyecto.eciTransport.repositories;

import com.proyecto.eciTransport.models.ReportModel;

public interface ReportRepository {

    public ReportModel consultReport(long id) throws ECITransportException;

}
