package com.example.demo.enity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id ;

    private String email ;

    private String username ;

    private String password ;

    private String createdAt ;

    private String updatedAt ;
}
