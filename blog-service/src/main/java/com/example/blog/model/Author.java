package com.example.blog.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Getter
@Setter
@ToString
@RedisHash("Author")
public class Author {

    @Id
    private String id;
    private String name;
    private String bio;
}