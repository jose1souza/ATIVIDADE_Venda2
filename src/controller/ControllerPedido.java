package controller;

import model.Product;

public class ControllerPedido {
	Product product;
	
	public ControllerPedido(String description, double price){
		product = new Product(description, price);
	}
	
	public Product getProduct(){
	    return product;
	}
	
}
