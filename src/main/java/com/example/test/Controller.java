package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class Controller {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World " + LocalDateTime.now();
    }

}
