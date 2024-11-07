
package org.example.handler;

import org.example.Order;
import org.springframework.stereotype.Component;

@Component
public class InventoryCheckHandler {
    public void validate(Order order) {
        if (!order.isInStock()) {
            throw new IllegalStateException("Inventory check failed for order ID: " + order.getId());
        }
    }
}