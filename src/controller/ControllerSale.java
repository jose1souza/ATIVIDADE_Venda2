package controller;

import model.Sale;

public class ControllerSale {
	Sale sale;

	public ControllerSale(ControllerItem controller){
		sale = new Sale();
		sale.addSaleItem(controller.getItem());
	}

	public Sale getSale(){
	    return sale;
	}
}
