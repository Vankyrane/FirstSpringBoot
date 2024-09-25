package com.prasad.FirstSpringBoot.controller;

import com.prasad.FirstSpringBoot.service.HelloResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public HelloResponse hello(){
        return new HelloResponse("Hello Prasad");
    }

    @GetMapping("/hello/{name}")
    public HelloResponse helloPathParam(@PathVariable String name){
        return new HelloResponse("Hello Prasad" +  " " + "and" + " " + name);
    }


    @PostMapping("/hello")
    public HelloResponse postHello(@RequestBody String name){
        return new HelloResponse("Hello" +" " + name + " " + "you are Welcome");
    }
}
