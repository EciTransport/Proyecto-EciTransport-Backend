package com.proyecto.eciTransport.repositories;

import com.proyecto.eciTransport.models.ReportModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component("reportRepository")
public interface ReportRepository extends MongoRepository<ReportModel, ObjectId>{

}
