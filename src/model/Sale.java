package model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
	private List<SaleItem> items; 
	
	public Sale() {
		items = new ArrayList<>();
	}
	
	public boolean addSaleItem(SaleItem item) {
		if(item == null) {
			throw new IllegalArgumentException("Item de venda inválido");
		}
		return items.add(item);
	}
	
	public double getTotalAmount() {
		double totalAmount = 0;
		for (SaleItem saleItem : items) {
			totalAmount += saleItem.getTotalAmount();
		}
		return totalAmount;
	}
	
	public List<SaleItem> getItems(){
		return items;
	}
}
