package com.yulchurin.wallet.Repository;

import com.yulchurin.wallet.Domain.Wallet;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import java.util.Optional;
import java.util.UUID;

public interface WalletRepository extends JpaRepository<Wallet, UUID> {
    @Lock(LockModeType.OPTIMISTIC)
    Optional<Wallet> findByIdForUpdate(UUID id);
}
