package com.example.digital_lending_platform.service;

import com.example.digital_lending_platform.model.Customer;
import com.example.digital_lending_platform.model.LoanOffer;
import com.example.digital_lending_platform.repository.CustomerRepository;
import com.example.digital_lending_platform.repository.LoanOfferRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LoanService {

    private final LoanOfferRepository loanOfferRepository;
    private final CustomerRepository customerRepository;

    public List<LoanOffer> getLoanOffers(Long customerId) {
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        Long maxQualification = (long) customer.getMaxQualification();
        return loanOfferRepository.findAll().stream()
                .filter(offer -> offer.getMaxAllowableLimit() <= maxQualification)
                .collect(Collectors.toList());
    }

}
