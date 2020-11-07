package org.cafex.billing.model;

import java.util.HashMap;
import java.util.Map;

public class Menu {

	private static final Map<String, MenuItem> items = new HashMap<>();
	
	static {
		addMenuItem("Cola", "D", "Cola - Cold", 0.50);
		addMenuItem("Coffee", "D", "Coffee - Hot", 1.00);
		addMenuItem("CheeseSandwich", "F", "Cheese Sandwich", 2.00);
		addMenuItem("SteakSandwich", "F", "Steak Sandwich", 4.50);
	}
	
	public static Map<String, MenuItem> getItems() {
		return items;
	}
	
	public static MenuItem getMenuItem(String itemId) {
		return items.containsKey(itemId) ? items.get(itemId) : null;
	}
	
	public static Double getUnitPrice(String itemId) {
		return items.containsKey(itemId) ? items.get(itemId).getPrice() : null;
	}

	private static void addMenuItem(String itemId, String itemType, String description, double price) {
		items.put(itemId, new MenuItem(itemId, itemType, description, price));
	}
	
}
