package com.example.Quora_Backend_Application.services;

import com.example.Quora_Backend_Application.models.Topic;
import com.example.Quora_Backend_Application.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService{

    private final TopicRepository topicRepository;

    @Autowired
    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }


    public Topic createTopic(Topic topic) {
        topicRepository.save(topic);
        return topic;
    }
}
