package com.example.demo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter

public class userRequest {

    private String username ;

    private String password ;

    private String firstName ;

    private String dob ;

}
