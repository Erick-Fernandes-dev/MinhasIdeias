package Roupas;

import java.util.Locale;
import java.util.Scanner;

import ListaDeRoupas.Loja;

public class infoRoupas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Loja blusaRegata, blusaPolo,blusaBasica, calca, bermuda;
		
		blusaBasica = new Loja();
		blusaRegata = new Loja();
		blusaPolo = new Loja();
		calca = new Loja();
		bermuda = new Loja();
		
		
		String roupas = "blusaBasica blusaRegata blusaPolo calca bermuda";
		
		String[] vect = roupas.split(" ");
		String roupa1, roupa2, roupa3, roupa4, roupa5;
		
		roupa1 = vect[0];
		roupa2 = vect[1];
		roupa3 = vect[2];
		roupa4 = vect[3];
		roupa5 = vect[4];
		
		System.out.println("Opção 1: "+ roupa1);
		System.out.println("Opção 2: "+ roupa2);
		System.out.println("Opção 3: "+ roupa3);
		System.out.println("Opção 4: "+ roupa4);
		System.out.println("Opção 5: "+ roupa5);
		
		System.out.print("Informe um dessas opções: ");
		int opcao = sc.nextInt();
		System.out.println("");
		
		if (opcao == 1) {
			blusaBasica.tamanho2 = 'P';
			blusaBasica.cor = "Preto";
			blusaBasica.marca = "RTD";
			blusaBasica.genero = 'M';
			blusaBasica.preco = 40.99;
			blusaBasica.tipo = "Blusa Básica";
			blusaBasica.quantidade = 4;
			
			System.out.println("Tipo: "+ blusaBasica.tipo);
			System.out.println("Tamanho: "+ blusaBasica.tamanho2);
			System.out.println("Cor: "+ blusaBasica.cor);
			System.out.println("Marca: "+ blusaBasica.marca);
			System.out.println("Genero: "+ blusaBasica.genero);
			System.out.println("Preço: R$"+ blusaBasica.preco);
			System.out.println("Quantidade: "+ blusaBasica.quantidade);
		}
		else if (opcao == 2) {
			blusaRegata.tamanho2 = 'M';
			blusaRegata.cor = "Azul";
			blusaRegata.marca = "tribus de guerra";
			blusaRegata.genero = 'F';
			blusaRegata.preco = 30.00;
			blusaRegata.tipo = "Camiseta";
			blusaRegata.quantidade = 5;
			
			System.out.println("Tipo: "+ blusaRegata.tipo);
			System.out.println("Tamanho: "+ blusaRegata.tamanho2);
			System.out.println("Cor: "+ blusaRegata.cor);
			System.out.println("Marca: "+ blusaRegata.marca);
			System.out.println("Genero: "+ blusaRegata.genero);
			System.out.println("Preço: R$"+ blusaRegata.preco);
			System.out.println("Quantidade: "+ blusaRegata.quantidade);
			
			
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
