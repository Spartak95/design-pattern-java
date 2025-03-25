package com.xcoder.behavioral.strategy.refactoring.guru;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
