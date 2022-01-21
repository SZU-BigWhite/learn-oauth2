package com.bigwhite.oauth2.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/admin")
    @PreAuthorize("hasAuthority('admin')")
    public String helloAdmin(){
        return "hello,admin";
    }

    @GetMapping("/hello")
    @PreAuthorize("hasRole('admin')")
    public String hello(){
        return "hello,boy";
    }
}
