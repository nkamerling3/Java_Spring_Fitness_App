package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/api/test/{resourceID}")
    public String getString(@PathVariable String resourceID) {
        return "here is the string: " + resourceID;
    }

}
