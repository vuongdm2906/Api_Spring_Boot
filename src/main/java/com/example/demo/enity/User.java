package com.example.demo.enity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @UuidGenerator
    @Column(name = "id")
    private String id ;

    @Column(name = "username")
    private String username ;

    @Column(name = "fullname")
    private String firstName ;

    @Column(name = "password")
    private String password ;

    @Column(name = "dob")
    private String  dob ;



}
