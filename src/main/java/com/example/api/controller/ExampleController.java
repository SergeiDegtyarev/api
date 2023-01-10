package com.example.api.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
@Slf4j
public class ExampleController {

    @ApiResponse(code = 200,message = "Успешно")
    @GetMapping
    public ResponseEntity <String> getText (){
        log.info("33");
        return  new ResponseEntity<>("33", HttpStatus.OK);
    }

}
