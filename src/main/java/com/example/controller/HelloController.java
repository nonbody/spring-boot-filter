package com.example.controller;

import com.example.model.HelloRequest;
import com.example.model.HelloResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @PostMapping("hello")
    public HelloResponse hello(@RequestBody HelloRequest helloRequest) {
        log.info("controller {}", helloRequest);
        return new HelloResponse(helloRequest.getEmail() + " " + helloRequest.getName());
    }

}
