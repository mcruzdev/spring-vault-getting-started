package com.mcruzdev.vault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SecretController
 */
@RestController
@RequestMapping("/secrets")
public class SecretController {

    @Value("${vault.secret}")
    private String secret;

    @GetMapping
    public ResponseEntity<String> env() {
        return ResponseEntity.ok(secret);
    }
}