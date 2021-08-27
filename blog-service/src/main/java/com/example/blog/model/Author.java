package com.example.blog.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Author {

    private String id;
    private String name;
    private String bio;
}