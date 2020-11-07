package org.cafex.billing.service;

import org.cafex.billing.model.Order;

public class BillingService {

	public static Double getOrderTotal(Order order) {
		
		Double orderTotal = order
				.getItems()
				.stream()
				.mapToDouble(o -> o.getPrice())
				.reduce(0, (a, b) -> a + b);
		
		return order.containsFoodItem() ? orderTotal * 1.10 : orderTotal;
	}
	
}
