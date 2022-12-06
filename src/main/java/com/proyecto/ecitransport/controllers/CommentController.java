package com.proyecto.ecitransport.controllers;

import com.proyecto.ecitransport.models.CommentModel;
import com.proyecto.ecitransport.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/comments/")
@CrossOrigin()
public class CommentController {

    @Autowired
    CommentService commentService;

    @RequestMapping(path = "All",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllComments() {
        List<CommentModel> commentModels = commentService.getAllComments();
        return new ResponseEntity<>(commentModels, HttpStatus.ACCEPTED);
    }

    @GetMapping
    public ResponseEntity<?> postComment(@RequestBody CommentModel comment) {
        CommentModel commentAdd = commentService.createComment(comment);
        return new ResponseEntity<>(commentAdd, HttpStatus.CREATED);
    }

    @RequestMapping(path = "delete/{id}", method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteReport(@PathVariable String id) {
        commentService.deleteComment(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
