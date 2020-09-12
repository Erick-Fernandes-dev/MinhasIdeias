package infoVeiculos;

import java.util.Locale;
import java.util.Scanner;

import automovel.Carro;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Carro fusca, camaru, ferrari;
		fusca = new Carro();
		camaru = new Carro();
		ferrari = new Carro();
		
		String listaDeCarros = "Fusca Camaru Ferrari";
		
		String[] vect = listaDeCarros.split(" ");
		String carro1, carro2, carro3;
		
		carro1 = vect[0];//0 para fusca;
		carro2 = vect[1];//1 para Camaru;
		carro3 = vect[2];//2 para Ferrari;
		
		System.out.println("Digite 0: "+ carro1);
		System.out.println("Digite 1: "+ carro2);
		System.out.println("Digite 2: "+ carro3);
		int opcao = sc.nextInt();
		
		if (opcao == 0) {
			fusca.cor = "Preto";
			fusca.ano = 1990;
			fusca.litrosGasolina = 45.89;
			fusca.quantPneu = 4;
			fusca.velocidade = 130.69;
			fusca.nome = "Fusca";
			
			
			System.out.println("Nome: "+ fusca.nome);
			System.out.println("Cor: "+ fusca.cor);
			System.out.println("Ano: "+ fusca.ano);
			System.out.println("Pneu: "+ fusca.quantPneu);
			System.out.println("Velocidade: "+ fusca.velocidade);
			System.out.println("Tanque: "+ fusca.litrosGasolina);
		}
		else if (opcao == 1) {
			camaru.cor = "Amarelo";
			camaru.ano = 2013;
			camaru.quantPneu = 4;
			camaru.litrosGasolina = 50.05;
			camaru.velocidade = 250;
			camaru.nome = "Camaru";
			
			
			System.out.println("Nome: "+ camaru.nome);
			System.out.println("Cor: "+ camaru.cor);
			System.out.println("Ano: "+ camaru.ano);
			System.out.println("pneu: "+ camaru.quantPneu);
			System.out.println("Velocidade: "+ camaru.velocidade);
			System.out.println("Tanque: "+ camaru.litrosGasolina);
			
		}
		else {
			ferrari.cor = "Vermelho";
			ferrari.ano = 1990;
			ferrari.quantPneu = 4;
			ferrari.litrosGasolina = 60.14;
			ferrari.velocidade = 280.90;
			ferrari.nome = "Ferrari";
			
			
			System.out.println("Nome: "+ ferrari.nome);
			System.out.println("Cor: "+ ferrari.cor);
			System.out.println("Ano: "+ ferrari.ano);
			System.out.println("pneu: "+ ferrari.quantPneu);
			System.out.println("Velocidade: "+ ferrari.velocidade);
			System.out.println("Tanque: "+ ferrari.litrosGasolina);
		}
	}

}












