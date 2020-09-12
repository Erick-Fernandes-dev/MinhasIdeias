package compras;

public class ComprasShop {
	public String nameProduct;
	public double price;
	public static final double PR = 0.5;
	
	public ComprasShop(String nameProduct, double price) {
		this.nameProduct = nameProduct;
		this.price = price;
	}
	
	public double descInProduct(double price) {
		return this.price - price * PR ;
		 
	}
	
	public String toString() {
		return nameProduct
			+ " , "
			+ String.format("%.2f", price)
			+ ", price reduce for $ "
			+ String.format("%.2f", descInProduct(price));
	}

}
