package com.example.Quora_Backend_Application.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Like extends BaseClass{


    @OneToMany
    private Comment comment;

    @OneToMany
    private User user;



}
