import java.util.Locale;
import java.util.Scanner;

public class ideia2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		/*
		
		System.out.print("Enter your name: ");
		String name = sc.next();
		
		String[] vect = name.split(" ");
		String firstName = vect[0];
		String secondName = vect[1];
		String lastName = vect[2];
		
		*/
		System.out.print("Enter numbers: ");
		int numbers = sc.nextInt();
		
		String faixaEtaria = idade(numbers);
		showResult(faixaEtaria);
		

	}
	
	public static String idade(int numbers) {
		String faixa;
		if (numbers < 12) {
			faixa = "criança";
		}
		else if (numbers > 12 && numbers < 18) {
			faixa = "Adolescente";
		}
		else {
			faixa = "Adulto";
		}
		return faixa;
	}
	
	public static void showResult(String faixa) {
		System.out.println("You are is: "+ faixa);
	}

}













