package com.example.JavaServer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticContent {

    @GetMapping("/")
    public String getIndex() {
        return "index.html";
    }

}
