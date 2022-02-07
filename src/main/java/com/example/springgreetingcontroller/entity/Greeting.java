package com.example.springgreetingcontroller.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Greeting {
    @Getter
    private String message;
    @Getter
    @Id
    private long id;

    public Greeting(long id, String message) {
        this.id = id;
        this.message= message;
    }

    public Greeting() {
        id = 0;
        message = "";
    }
}
