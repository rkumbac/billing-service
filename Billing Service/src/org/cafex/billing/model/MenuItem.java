package org.cafex.billing.model;

public class MenuItem {

	private String itemId;
	private String itemType;
	private String description;
	private double price;
	
	public MenuItem(String itemId, String itemType, String description, double price) {
		this.itemId = itemId;
		this.itemType = itemType;
		this.description = description;
		this.price = price;
	}
	
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isDrinkItem() {
		return "D".equals(this.itemType);
	}

	public boolean isFoodItem() {
		return "F".equals(this.itemType);
	}
	
}
