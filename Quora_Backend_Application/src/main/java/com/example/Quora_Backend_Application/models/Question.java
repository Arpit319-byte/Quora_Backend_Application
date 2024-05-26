package com.example.Quora_Backend_Application.models;

import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Question extends BaseClass {

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String body;

    @Column(nullable = false)
    private List<UUID> topics;

    @OneToOne
    private User user;
}
