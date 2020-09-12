package vect;

import java.util.Locale;
import java.util.Scanner;

public class vectExe {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		double[] media = new double[number];
		
		for(int i = 0; i < number; i++) {
			media[i] = sc.nextDouble();
		}
		
		double sumMedia = 0.0;
		
		for(int i = 0; i < number; i++) {
			sumMedia += media[i];
		}
		
		double finalMedia = sumMedia / number;
		
		if (finalMedia >= 7.0) {
			System.out.println("Voc� foi aprovado, aproveite o recesso.");
			
		}
		
		else if (finalMedia < 7.0 && finalMedia >= 5.0) {
			System.out.println("Voc� foi para a final, estude muito para sua avalia��o final.");
			System.out.printf("Voc� precisa de %.2f para poder passar", (21 - sumMedia));
			
		}
		
		else {
			System.out.println("Voc� foi reprovado, estude e se dedique mais no pr�ximo ano.");
		}
		
		
	}

}
