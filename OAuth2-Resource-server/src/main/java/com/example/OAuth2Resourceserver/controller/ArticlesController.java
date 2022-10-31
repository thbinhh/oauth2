package com.example.OAuth2Resourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticlesController {
    @GetMapping("/articles1")
    public String[] getArticles() {
        return new String[] { "Article 1", "Article 2", "Article 3" };
    }
    @GetMapping("/articles2")
    public String[] getArticles2() {
        return new String[] { "Article 1", "Article 2", "Article 3" };
    }
}
