package com.example.account.controllers;

import com.example.account.pojos.Account;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/auth")
public class AuthorisationController {

    @PostMapping("/signup")
    public ResponseEntity<Account> signUp(@Valid @RequestBody Account account) {
        return ResponseEntity.status(HttpStatus.OK).body(account);
    }
    
}
