package com.example.blog.service.client;

import com.example.blog.model.Author;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("author-service")
public interface AuthorFeignClient {

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/author/{authorId}",
            consumes = "application/json")
    Author get(@PathVariable("authorId") String authorId);
}
