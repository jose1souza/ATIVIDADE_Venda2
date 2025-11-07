package view;

import java.time.LocalDate;

import model.Sale;
import model.SaleItem;
import model.SalePresenter;

public class ConsoleSalePresenter implements SalePresenter{

	@Override
	public void show(Sale sale) {
		System.out.println("Nota de venda " + LocalDate.now());
		System.out.printf("%-15s %-10s %-10s %-10s\n","Produto",  "Preço",  "Quantidade",   "Total");
		for(SaleItem item : sale.getItems()) {
			System.out.printf("%-15s %-10.2f %-10d %-10.2f\n",
			item.getProduct().getDescription(),
			item.getProduct().getPrice(),
			item.getAmount(),
			item.getTotalAmount());
		}
		System.out.println("Total da compra: "+ sale.getTotalAmount());
	}
	
}
