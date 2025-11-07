package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.ControllerItem;
import controller.ControllerPedido;
import controller.ControllerSale;
import model.SalePresenter;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<ControllerItem> itens = new ArrayList<>();
		ControllerSale sale = null;

		while (true) {
			System.out.println("1- Adicionar produto");
			System.out.println("2- Finalizar compra");
			System.out.println("3- Conferir nota");
			System.out.println("0- Sair");
			System.out.print("Escolha: ");
			int option = Integer.parseInt(scanner.nextLine());

			if (option == 0)
				break;

			switch (option) {
			case 1:
				System.out.print("Produto: ");
				String name = scanner.nextLine();

				System.out.print("Preço: ");
				double price = Double.parseDouble(scanner.nextLine());

				System.out.print("Quantidade: ");
				int qtd = Integer.parseInt(scanner.nextLine());

				ControllerPedido pedido = new ControllerPedido(name, price);
				ControllerItem item = new ControllerItem(pedido.getProduct(), qtd);
				itens.add(item);
				System.out.println("Produto adicionado.");
				break;

			case 2:
				if (!itens.isEmpty()) {
					sale = new ControllerSale(itens);
					System.out.println("Compra realizada com sucesso.");
				} else {
					System.out.println("Nenhum produto adicionado.");
				}
				break;

			case 3:
				if (sale != null) {
					SalePresenter presenter = new ConsoleSalePresenter();
					presenter.show(sale.getSale());
				} else {
					System.out.println("Nenhuma compra realizada.");
				}
				break;

			default:
				System.out.println("⚠pção inválida.");
			}
		}

		System.out.println("Saindo...");
		scanner.close();
	}
}
