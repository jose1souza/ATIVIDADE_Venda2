package view;

import java.util.Scanner;

import controller.ControllerItem;
import controller.ControllerPedido;
import controller.ControllerSale;
import model.SalePresenter;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static int menu() {
		System.out.println("1- Pedir produto");
		System.out.println("2- Fazer a compra");
		System.out.println("3- Conferir nota");
		System.out.println("0- Sair");
		return scanner.nextInt();
	}

	public static void main(String[] args) {
	    int option = menu();
	    ControllerPedido pedido;
	    ControllerItem item = null;
	    ControllerSale sale = null;
	    
	    do {
	    	switch(option) {
	    	case 1: 
	    		System.out.println("Produto, preco e qtd");
	    	    String name = scanner.nextLine();
	    	    double price = scanner.nextDouble();
	    	    int qtd = scanner.nextInt();
	    	    pedido = new ControllerPedido(name, price);
	    	    item = new ControllerItem(pedido.getProduct(), qtd);
	    		break;
	    	case 2:
	    		if (item != null)
	    			sale = new ControllerSale(item);
	    		throw new IllegalArgumentException("Peça um produto primeiro");
			case 3:
				if (sale != null) {
					SalePresenter presenter = new ConsoleSalePresenter();
		    		presenter.show(sale.getSale());
				}
	    		throw new IllegalArgumentException("Faça uma compra primeiro");
	    	case 0:
	    		System.out.println("Saindo...");
	    		break;
	    	}
	    }while(option != 0);
		
	}

}
