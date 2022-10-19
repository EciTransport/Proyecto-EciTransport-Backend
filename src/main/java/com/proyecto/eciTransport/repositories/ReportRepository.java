package com.proyecto.eciTransport.repositories;

import com.proyecto.eciTransport.models.ReportModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Component("reportRepository")
public interface ReportRepository extends MongoRepository<ReportModel,Long> {

}
