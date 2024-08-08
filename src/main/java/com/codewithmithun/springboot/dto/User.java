package com.codewithmithun.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private String email;


}
