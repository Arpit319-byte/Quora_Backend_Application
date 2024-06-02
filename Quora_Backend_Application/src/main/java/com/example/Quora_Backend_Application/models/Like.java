package com.example.Quora_Backend_Application.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "likes")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Like extends BaseModel{


    @ManyToOne
    private Comment comment;

    @ManyToOne
    private User user;



}
