
package org.example.handler;

import org.example.Order;
import org.springframework.stereotype.Component;

@Component
public class PaymentValidationHandler {
    public void validate(Order order) {
        if (!order.hasValidPaymentDetails()) {
            throw new IllegalStateException("Payment validation failed for order ID: " + order.getId());
        }
    }
}