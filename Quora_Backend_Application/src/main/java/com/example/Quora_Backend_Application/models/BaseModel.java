package com.example.Quora_Backend_Application.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

// This is the BaseReview abstract class
@EntityListeners(AuditingEntityListener.class) // This enables JPA auditing
@MappedSuperclass // This specifies that this class is a base class for other entities
@Getter
@Setter
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // This specifies the inheritance strategy
public abstract class BaseModel {

    @Id // This specifies the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This specifies the primary key generation strategy
    protected Long id;

    @Column(nullable = false) // This specifies that the createdOn column cannot be null
    @Temporal(TemporalType.TIMESTAMP) // This specifies the type of the date/time
    @CreatedDate // This specifies that this field should be populated with the current date/time when the entity is created
    protected Date createdOn;

    @Column(nullable = false) // This specifies that the updatedOn column cannot be null
    @Temporal(TemporalType.TIMESTAMP) // This specifies the type of the date/time
    @LastModifiedDate // This specifies that this field should be populated with the current date/time when the entity is updated
    protected Date updatedOn;
}
