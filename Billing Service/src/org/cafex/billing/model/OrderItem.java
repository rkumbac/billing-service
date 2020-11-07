package org.cafex.billing.model;

public class OrderItem {
	
	private MenuItem item;
	private int qty;
	private double price;
	
	public OrderItem(MenuItem item, int qty) {
		this.item = item;
		this.qty = qty;
		this.price = calculatePrice();
	}
	
	private double calculatePrice() {
		return Menu.getUnitPrice(item.getItemId()) * qty;
	}

	public MenuItem getItem() {
		return item;
	}

	public void setItem(MenuItem menuItem) {
		this.item = menuItem;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
