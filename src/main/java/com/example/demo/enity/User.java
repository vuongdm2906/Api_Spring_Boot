package com.example.demo.enity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id ;

    private String email ;

    private String username ;

    private String password ;

    private String created_at ;

    private String updated_at ;

}
