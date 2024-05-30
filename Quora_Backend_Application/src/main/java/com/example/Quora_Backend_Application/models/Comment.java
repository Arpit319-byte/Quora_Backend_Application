package com.example.Quora_Backend_Application.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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

    @OneToMany(mappedBy = "comment")
    private List<Like> likes;

}
