import java.util.Locale;
import java.util.Scanner;

import compras.ComprasShop;

public class ideia4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Wellcome, my client ");
		System.out.println();
		
		System.out.print("Enter name product: ");
		String nameProduct = sc.nextLine();
		
		System.out.print("Enter price this product: ");
		double price = sc.nextDouble();
		
		ComprasShop buy = new ComprasShop(nameProduct, price);
		
		System.out.println("Product info: " + buy);

	}

}
