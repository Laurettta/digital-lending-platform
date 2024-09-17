package com.example.digital_lending_platform.service;

import com.example.digital_lending_platform.model.MobileWallet;
import com.example.digital_lending_platform.repository.MobileWalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MobileWalletService {

    private final MobileWalletRepository mobileWalletRepository;

    public String creditWallet(String mobileNumber, Long amount) {
        String status = amount == 5000 ? "failed" : "success";
        MobileWallet wallet = MobileWallet.builder()
                .mobileNumber(mobileNumber)
                .status(status)
                .build();
        mobileWalletRepository.save(wallet);
        return status;
    }
}
