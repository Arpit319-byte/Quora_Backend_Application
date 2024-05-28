package com.example.Quora_Backend_Application.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment extends BaseClass{

    @Column(nullable = false)
    private String text;

    @OneToOne
    private Answer answer;

    @OneToOne
    private User user;

    @ManyToOne
    private Like like;

}
