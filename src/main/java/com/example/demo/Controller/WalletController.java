package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WalletController {

    @PostMapping("/v1/wallets")
    public String wall(){
        return "";
    }

    @GetMapping("/v1/wallets/{WALLET_UUID")
    public String getWallet(@PathVariable String WALLET_UUID){
        return "";
    }

}
