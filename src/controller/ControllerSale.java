package controller;

import java.util.List;

import model.Sale;

public class ControllerSale {
	private Sale sale;

	public ControllerSale(List<ControllerItem> itens) {
		sale = new Sale();
		for (ControllerItem item : itens) {
			sale.addSaleItem(item.getItem());
		}
	}

	public Sale getSale() {
		return sale;
	}
}
