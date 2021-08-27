package com.example.author.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@Entity
public class Author {

    @Id
    private String id;
    private String name;
    private String bio;
}
