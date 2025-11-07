package model;

public class SaleItem {
	private Product product;
	private int amount;
	
	public SaleItem(Product product, int amount) {
		if(product == null)
			throw new IllegalArgumentException("Produto Inválido");
		this.product = product;
		this.amount = amount;
	}

	public Product getProduct() {
		return product;
	}

	public int getAmount() {
		return amount;
	}
	
	public double getTotalAmount() {
		return amount * product.getPrice();
	}
}
