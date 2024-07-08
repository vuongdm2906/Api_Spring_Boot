package com.example.demo.dto.request;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class userRequest {
    private Long id;

    private String email;

    private String username;

    private String passwork;

    private String created_at;

    private String updated_at;

}
