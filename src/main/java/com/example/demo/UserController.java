package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/v1/wallets/")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/v1/wallet")
    public String echo(@RequestBody String message) {
        return "Hello, " + message;
    }
}
