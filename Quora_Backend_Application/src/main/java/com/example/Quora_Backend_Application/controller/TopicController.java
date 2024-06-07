package com.example.Quora_Backend_Application.controller;

import com.example.Quora_Backend_Application.models.Topic;
import com.example.Quora_Backend_Application.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicController {

    private final TopicService topicService;

    @Autowired
    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping
    public ResponseEntity<List<Topic>>getAllTopics(){
        return ResponseEntity.ok(topicService.getAllTopics());
    }

    @PostMapping
    public ResponseEntity<Topic> createTopic(@RequestBody  Topic topic){
        Topic topic1 = topicService.createTopic(topic);
        return new ResponseEntity<>(topic, HttpStatus.CREATED);
    }

}
