package com.example.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="spring-cloud-producer")
public interface Remote {
    @GetMapping(value = "hello")
    public String hello(@RequestParam("name")String name);
}
