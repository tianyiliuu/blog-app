package com.example.author.config;

import com.example.author.model.Author;
import com.example.author.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private AuthorRepository authorRepository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        Author author = new Author();
        author.setId("007");
        author.setName("007name");
        author.setBio("007bio");
        authorRepository.save(author);

        author = new Author();
        author.setId("jason");
        author.setName("jason-name");
        author.setBio("jason-bio");
        authorRepository.save(author);
    }
}
