package com.example.springgreetingcontroller.entity;

import lombok.Getter;
import lombok.Setter;

// Data = Getter + Setter + tostring
@Getter
@Setter
public class User {
    private String firstName;
    private String lastName;

    public String toString() {
        String str = (firstName != null) ? firstName + "" : "";
        str += (lastName != null) ? lastName : "";
        return str.trim();
    }
}