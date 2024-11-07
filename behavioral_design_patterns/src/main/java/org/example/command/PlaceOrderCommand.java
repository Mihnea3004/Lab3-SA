
package org.example.command;

import org.example.Order;

public class PlaceOrderCommand implements OrderCommand {
    private final Order order;

    public PlaceOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        if (order.getStatus().equals("NEW")) {
            order.updateStatus("PLACED");
            System.out.println("Order placed successfully: " + order.getId());
        } else {
            System.out.println("Order cannot be placed. Current status: " + order.getStatus());
        }
    }
}