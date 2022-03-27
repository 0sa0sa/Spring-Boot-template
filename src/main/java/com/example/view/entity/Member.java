package com.example.view.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {
    private Integer id;
    private String name;

//    public Member(Integer id, String name) {
//        this.id = id;
//        this.name = name;
//    }
}
