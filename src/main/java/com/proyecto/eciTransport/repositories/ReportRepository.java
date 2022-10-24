package com.proyecto.eciTransport.repositories;

import com.proyecto.eciTransport.models.ReportModel;
import com.proyecto.eciTransport.models.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.sql.Date;

@Repository
@Component("reportRepository")
public interface ReportRepository extends MongoRepository<ReportModel, Long>{

}
