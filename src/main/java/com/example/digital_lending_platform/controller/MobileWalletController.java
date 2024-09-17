package com.example.digital_lending_platform.controller;

import com.example.digital_lending_platform.service.MobileWalletService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wallet")
@RequiredArgsConstructor
public class MobileWalletController {

    private final MobileWalletService mobileWalletService;

    @PostMapping("/credit")
    public String creditWallet(@RequestParam String mobileNumber, @RequestParam Long amount) {
        return mobileWalletService.creditWallet(mobileNumber, amount);
    }


}
