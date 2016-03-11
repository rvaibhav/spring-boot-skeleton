package com.retailer.backend.mockservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by vaibhavr on 11/03/16.
 */
@Entity
public class User {

    @Id
    @Column(name = "id", nullable = false, updatable = false)
    @NotNull
    @Size(max = 64)
    private String id;

    @Column(name = "password", nullable = false)
    @NotNull
    @Size(max = 64)
    private String password;

    // getters

}
