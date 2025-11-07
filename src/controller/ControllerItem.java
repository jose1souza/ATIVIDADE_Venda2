package controller;

import model.Product;
import model.SaleItem;

public class ControllerItem {
	SaleItem item;

	public ControllerItem(Product product, int amount) {
		item = new SaleItem(product, amount);
	}

	public SaleItem getItem() {
		return item;
	}
}
