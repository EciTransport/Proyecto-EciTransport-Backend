package com.proyecto.eciTransport.controllers;

import com.proyecto.eciTransport.models.CommentModel;
import com.proyecto.eciTransport.models.dto.CommentModelDto;
import com.proyecto.eciTransport.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/comments/")
@CrossOrigin
public class CommentController {

    @Autowired
    CommentService commentService;

    @RequestMapping(path = "All",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllComments() {
        List<CommentModel> commentModels = commentService.getAllComments();
        return new ResponseEntity<>(commentModels, HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<?> postComment(@RequestBody CommentModelDto commentDto) {
        CommentModel comment = new CommentModel(commentDto.getIdReportDto(), commentDto.getUserDto(), commentDto.getHourDto(),commentDto.getCommentDto());
        CommentModel commentAdd = commentService.createComment(comment);
        return new ResponseEntity<>(commentAdd, HttpStatus.CREATED);
    }

    @RequestMapping(path = "delete/{id}", method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteReport(@PathVariable String id) {
        commentService.deleteComment(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
