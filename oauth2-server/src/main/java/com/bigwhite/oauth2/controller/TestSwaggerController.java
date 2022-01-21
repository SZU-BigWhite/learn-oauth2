package com.bigwhite.oauth2.controller;

import com.bigwhite.oauth2.controller.arg.Test;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestSwaggerController {

    @ApiResponse(description = "hello",responseCode = "200")
    @GetMapping("/hello/swagger")
    public ResponseEntity helloSwagger(Test test){
        return new ResponseEntity("hello,swagger!", HttpStatus.OK);
    }
}
