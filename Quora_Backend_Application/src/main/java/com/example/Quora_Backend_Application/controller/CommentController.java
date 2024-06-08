package com.example.Quora_Backend_Application.controller;

import com.example.Quora_Backend_Application.models.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    private CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }

    @PostMapping("/answers/{answerId}/comments")
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment){
        commentService.createCommentForAnswer(comment);
        return new ResponseEntity<>(comment, HttpStatus.CREATED);
    }

    @PostMapping("/comments/{commentId}/comments")
    public ResponseEntity<Comment> createCommentForComment(@RequestBody Comment comment){
        commentService.createCommentForComment(comment);
        return new ResponseEntity<>(comment, HttpStatus.CREATED);
    }
}
