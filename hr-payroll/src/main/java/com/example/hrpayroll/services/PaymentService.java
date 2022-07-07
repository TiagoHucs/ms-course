package com.example.hrpayroll.services;

import com.example.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, int days){
        return Payment.builder().name("Mock").dailyIncome(250.0).days(days).build();
    }
}
