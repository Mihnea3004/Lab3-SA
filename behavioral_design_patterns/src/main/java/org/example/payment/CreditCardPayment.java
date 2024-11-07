
package org.example.payment;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        // Mock logic for credit card payment processing
        if (amount > 0) {
            System.out.println("Payment of $" + amount + " processed with Credit Card.");
        } else {
            throw new IllegalArgumentException("Invalid payment amount: " + amount);
        }
    }
}