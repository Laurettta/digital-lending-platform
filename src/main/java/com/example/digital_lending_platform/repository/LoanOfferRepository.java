package com.example.digital_lending_platform.repository;

import com.example.digital_lending_platform.model.LoanOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanOfferRepository extends JpaRepository<LoanOffer, Long> {
}
