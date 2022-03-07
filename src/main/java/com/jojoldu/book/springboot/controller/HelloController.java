package com.jojoldu.book.springboot.controller;

import com.jojoldu.book.springboot.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    /*DTO를 통해서 넘겨주는 함수*/
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String _name, @RequestParam("amount") int _amount) {
        return new HelloResponseDto(_name, _amount);
    }
}
