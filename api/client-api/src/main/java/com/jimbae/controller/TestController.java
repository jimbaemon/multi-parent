package com.jimbae.controller;

import com.jimbae.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public ResponseEntity<String> get(){
        Client client = new Client();
        return ResponseEntity.ok().body(client.call());
    }

}
