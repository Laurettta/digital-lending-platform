package com.example.digital_lending_platform.repository;

import com.example.digital_lending_platform.model.MobileWallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileWalletRepository extends JpaRepository<MobileWallet, Long> {
}
