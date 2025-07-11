package com.yulchurin.wallet.Controller;

import com.yulchurin.wallet.Service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/wallets")
public class WalletController {

    private final WalletService service;

    public WalletController(WalletService service) {
        this.service = service;
    }

    @PostMapping("/{walletId}/deposit")
    public ResponseEntity<Void> deposit(UUID walletId, BigDecimal amount) {
        service.deposit(walletId, amount);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/v1/wallets/{WALLET_UUID")
    public String getWallet(@PathVariable String WALLET_UUID){
        return "";
    }

}
