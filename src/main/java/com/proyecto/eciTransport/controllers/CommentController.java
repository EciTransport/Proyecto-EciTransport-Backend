package com.proyecto.eciTransport.controllers;

import com.google.gson.Gson;
import com.proyecto.eciTransport.models.CommentModel;
import com.proyecto.eciTransport.services.CommentService;
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

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> postComment(@RequestBody CommentModel comment) {
        CommentModel commentAdd = commentService.createComment(comment);
        return new ResponseEntity<>(commentAdd, HttpStatus.CREATED);
    }

    @RequestMapping(path = "idReport/{idReport}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getCommentsReport(@PathVariable String idReport) {
        List<CommentModel> comments = commentService.getCommentsReport(idReport);
        Gson gson = new Gson();
        return new ResponseEntity<>(gson.toJson(comments), HttpStatus.ACCEPTED);
    }

    @RequestMapping(path = "delete/{id}", method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteReport(@PathVariable String id) {
        commentService.deleteComment(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
