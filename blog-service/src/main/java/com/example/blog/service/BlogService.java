package com.example.blog.service;

import com.example.blog.model.Author;
import com.example.blog.model.Blog;
import com.example.blog.repository.BlogRepository;
import com.example.blog.service.client.AuthorFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private AuthorFeignClient authorFeignClient;

    public Blog get(String blogId) {
        Blog blog = blogRepository.findById(blogId).orElse(null);
        if (blog != null) {
            Author author = authorFeignClient.get(blog.getAuthorId());
            blog.setAuthorName(author.getName());
            blog.setAuthorBio(author.getBio());
        }
        return blog;
    }
}
