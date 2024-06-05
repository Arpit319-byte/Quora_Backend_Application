package com.example.Quora_Backend_Application.controller;

import com.example.Quora_Backend_Application.models.Question;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/question")
public class QuestionController {

    //@GetMapping("/{questionId}")

    @PostMapping
    public ResponseEntity<String> creteQuestion(@RequestBody Question question){

    }
}
