package org.cafex.billing.client;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.cafex.billing.model.Menu;
import org.cafex.billing.model.Order;
import org.cafex.billing.model.OrderItem;
import org.cafex.billing.service.BillingService;

public class PlayWithBillingService {
	
	public static void main(String args[]) {
		
		Map<String, Integer> sampleOrderMenu = new HashMap<>();
		sampleOrderMenu.put("Cola", 2);
		sampleOrderMenu.put("Coffee", 2);
		sampleOrderMenu.put("CheeseSandwich", 5);
		sampleOrderMenu.put("SteakSandwich", 2);
		sampleOrderMenu.put("SomethingNotExistInMenu", 2);
		
		Order o = new Order();
		o.setItems(sampleOrderMenu
						.keySet()
						.stream()
						.filter(s -> Menu.getItems().containsKey(s) && sampleOrderMenu.get(s) > 0)
						.map(s -> new OrderItem(Menu.getMenuItem(s), sampleOrderMenu.get(s)))
						.collect(Collectors.toList()));
		
		Double orderTotal = BillingService.getOrderTotal(o);
		System.out.println("Order Total = $" + new DecimalFormat("######.00").format(orderTotal)); 
	}

}
