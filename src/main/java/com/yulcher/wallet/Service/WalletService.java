package com.yulchurin.wallet.Service;

import com.yulchurin.wallet.Repository.WalletRepository;
import com.yulchurin.wallet.Domain.Wallet;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
public class WalletService {
    private final WalletRepository walletRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    @Transactional
    public void deposit(UUID walletId, BigDecimal amount) {
        Wallet wallet = walletRepository.findByIdForUpdate(walletId).orElseThrow();
        wallet.setBalance(wallet.getBalance().add(amount));
    }
}
