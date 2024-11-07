package org.example;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private String status;
    private double totalAmount;
    private boolean inStock;
    private boolean validPaymentDetails;

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public boolean isInStock() {
        return inStock;
    }

    public boolean hasValidPaymentDetails() {
        return validPaymentDetails;
    }

	public String getId() {
		return id.toString();
	}

	public String getStatus() {
		return status;
	}

	public String getCustomerName() {
		return customerName;
	}
}
