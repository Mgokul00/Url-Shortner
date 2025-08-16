package com.example.shortener.controller;

import com.example.shortener.service.UrlService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UrlController {

    private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/shorten")
    public String shortenUrl(@RequestParam("longUrl") String longUrl, Model model) {
        String shortCode = urlService.shortenUrl(longUrl);
        model.addAttribute("shortUrl", "http://localhost:8080/short/" + shortCode);
        return "result";
    }

    @GetMapping("/short/{code}")
    public String redirect(@PathVariable String code) {
        String longUrl = urlService.getLongUrl(code);
        if (longUrl != null) {
            return "redirect:" + longUrl;
        }
        return "redirect:/";
    }
}
