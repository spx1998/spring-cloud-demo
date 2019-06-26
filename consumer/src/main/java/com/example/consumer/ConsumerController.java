package com.example.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    Remote remote;
    @GetMapping("/hello")
    public String index(@RequestParam("name") String name) {
        return remote.hello(name);
//        return "hello";
    }
}
