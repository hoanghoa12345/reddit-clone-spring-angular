package com.example.springredditclone.controller;

import com.example.springredditclone.dto.CommentsDto;
import com.example.springredditclone.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/api/comments/")
@AllArgsConstructor
public class CommentsController {
    private final CommentService commentService;

    @PostMapping
    public ResponseEntity<Void> createComment(@RequestBody CommentsDto commentDto){
        commentService.save(commentDto);
        return new ResponseEntity<>(CREATED);
    }
/*
    @GetMapping
    public ResponseEntity<List<CommentsDto>> getAllCommentsForPost(@PathVariable Long postId){
        return status(OK)
                .body(commentService.getAllCommentsForPost(postId));
    }

    @GetMapping
    public void getAllCommentsForUser(@PathVariable String username){
        commentService.getAllCommentsForUser(username);
    }*/
}
