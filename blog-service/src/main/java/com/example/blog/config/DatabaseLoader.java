package com.example.blog.config;

import com.example.blog.model.Blog;
import com.example.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private BlogRepository blogRepository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        Blog blog = new Blog();
        blog.setId("b1");
        blog.setAuthorId("007");
        blog.setContent("content1");
        blogRepository.save(blog);

        blog = new Blog();
        blog.setId("b2");
        blog.setAuthorId("jason");
        blog.setContent("cccc");
        blogRepository.save(blog);
    }
}
