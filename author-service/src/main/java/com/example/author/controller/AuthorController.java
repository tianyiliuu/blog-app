package com.example.author.controller;

import com.example.author.model.Author;
import com.example.author.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author/{authorId}")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping
    public Author get(@PathVariable String authorId) {
        return authorRepository.findById(authorId).orElse(null);
    }

    @GetMapping("/test")
    public String foo() {
        return "hi!";
    }
}
