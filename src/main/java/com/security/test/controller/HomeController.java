package com.security.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/normal")
    @PreAuthorize("hasRole('NORMAL')")
    public ResponseEntity<String> normalUser(){
        return  ResponseEntity.ok("Yes i am normal user");
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> adminUser(){
        return  ResponseEntity.ok("Yes i am admin user");
    }

    @GetMapping("/public")
    public ResponseEntity<String> publicUser(){
        return  ResponseEntity.ok("Yes i am public user");
    }
}
