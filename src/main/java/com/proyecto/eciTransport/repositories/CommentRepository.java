package com.proyecto.eciTransport.repositories;

import com.proyecto.eciTransport.models.CommentModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component("commentRepository")
public interface CommentRepository extends MongoRepository<CommentModel, ObjectId> {
}
