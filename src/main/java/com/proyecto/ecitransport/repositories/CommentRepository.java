package com.proyecto.ecitransport.repositories;

import com.proyecto.ecitransport.models.CommentModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component("commentRepository")
public interface CommentRepository extends MongoRepository<CommentModel, ObjectId> {
}
