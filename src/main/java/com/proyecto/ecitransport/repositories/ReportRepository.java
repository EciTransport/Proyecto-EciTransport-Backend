package com.proyecto.ecitransport.repositories;

import com.proyecto.ecitransport.models.ReportModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component("reportRepository")
public interface ReportRepository extends MongoRepository<ReportModel, ObjectId>{

}
