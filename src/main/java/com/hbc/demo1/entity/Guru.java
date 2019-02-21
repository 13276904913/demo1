package com.hbc.demo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guru {
    private Integer id;
    private String dharma;
    private String headPic;
    private Integer status;
}
