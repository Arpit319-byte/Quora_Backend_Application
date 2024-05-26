package com.example.Quora_Backend_Application.models;

import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Answer extends BaseClass{

    @Column(nullable = false)
    private String text;

    @OneToOne
    private Question question;

    @OneToOne
    private User user;

}
