package com.example.Quora_Backend_Application.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.UUID;

@EntityListeners(AuditingEntityListener.class) // This enables JPA auditing
@MappedSuperclass // This specifies that this class is a base class for other entities
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED) // This specifies the inheritance strategy
public abstract class BaseClass {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected UUID id;

    @Column(nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    protected Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    protected Date updatedAt;

}
