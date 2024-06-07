package com.example.Quora_Backend_Application.services;

import com.example.Quora_Backend_Application.models.Answer;
import com.example.Quora_Backend_Application.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {

    private  AnswerRepository answerRepository;

    @Autowired
    public AnswerService(AnswerRepository answerRepository){
         this.answerRepository = answerRepository;
    }

    public List<Answer> getAllAnswers(Long questionId){
        return answerRepository.findAllAnswersByQuestionId(questionId);
    }

    public Answer createAnswer(Answer answer){
        answerRepository.save(answer);
        return answer;
    }


    public Answer updateAnswer(Long answerId, Answer answer) {
        Answer answer1 = answerRepository.findById(answerId).orElse(null);

        if(answer1!=null){
            answer1.setText(answer.getText());
            answer1.setUpdatedOn(answer.getUpdatedOn());
            return answerRepository.save(answer1);
        }else
            return null;

    }

    public Answer deleteAnswerById(Long answerId) {
        Answer answer= answerRepository.findById(answerId).orElse(null);

        if(answer!=null){
            answerRepository.deleteById(answerId);
            return answer;
        }else
            return null;

    }
}
