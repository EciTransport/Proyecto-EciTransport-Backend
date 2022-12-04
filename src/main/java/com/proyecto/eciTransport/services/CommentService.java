package com.proyecto.eciTransport.services;

import com.proyecto.eciTransport.models.CommentModel;
import com.proyecto.eciTransport.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@EnableMongoRepositories
@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    /**
     * Create new comment
     * @param comment Object Comment
     */
    public CommentModel createComment(CommentModel comment) {
        commentRepository.save(comment);
        comment.setIdString(comment.getId().toString());
        return comment;
    }

    /**
     * Get All Comments
     * @return ArrayList the comments
     */
    public List<CommentModel> getAllComments() {
        List<CommentModel> commentModels = commentRepository.findAll();
        for(CommentModel c: commentModels) {
            c.setIdString(c.getId().toString());
        }
        return commentModels;
    }

    /**
     * Delete Comment for Id
     * @param id Id comment
     */
    public void deleteComment(String id) {
        CommentModel comment = commentRepository.findAll().stream().filter(c -> c.getId().toString().equals(id)).collect(Collectors.toList()).get(0);
        commentRepository.delete(comment);
    }

}
