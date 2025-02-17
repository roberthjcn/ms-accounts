package com.sofka.ms_accounts.repository;

import com.sofka.ms_accounts.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {
    List<Account> findByCustomerId(UUID customerId);
    boolean existsByAccountNumber(String accountNumber);
}
