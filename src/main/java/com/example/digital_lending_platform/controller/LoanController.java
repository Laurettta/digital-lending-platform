package com.example.digital_lending_platform.controller;

import com.example.digital_lending_platform.model.LoanOffer;
import com.example.digital_lending_platform.service.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/loans")
@RequiredArgsConstructor
public class LoanController {

    private final LoanService loanService;

    @GetMapping("/offers/{customerId}")
    public List<LoanOffer> getLoanOffers(@PathVariable Long customerId) {
        return loanService.getLoanOffers(customerId);
    }

}
