package com.example.blog.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
public class Blog {

    @Id
    private String id;
    private String authorId;
    private String content;

    @Transient
    private String authorName;
    @Transient
    private String authorBio;
}
