package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog/{blogId}")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping
    public Blog get(@PathVariable String blogId) {
        return blogService.get(blogId);
    }
}
