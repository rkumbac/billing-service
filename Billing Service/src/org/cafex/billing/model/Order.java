package org.cafex.billing.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private List<OrderItem> items;
	
	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public Order() {
		items = new ArrayList<OrderItem>();
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public boolean containsFoodItem() {
		return items
				.stream()
				.anyMatch(oi -> oi.getItem().isFoodItem());
	}

}
