package com.example.demo.enity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Paging<T> {
    int pageSize;
    int currentPage;
    long total;
    int offset;
    List<T> data;
}
