package com.example.springredditclone.service;

import com.example.springredditclone.dto.CommentsDto;
import com.example.springredditclone.repository.PostRepository;
import com.example.springredditclone.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CommentService {
    private final PostRepository postRepository;
    private final UserRepository userRepository;
    public void save(CommentsDto commentsDto) {

    }
}
