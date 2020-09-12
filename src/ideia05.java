import java.util.Locale;
import java.util.Scanner;

import person.Champion;

public class ideia05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter data of the your chammpion: ");
		
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter type warrior: ");
		String TypeWarrior = sc.nextLine();
		
		System.out.print("Enter your power: ");
		String power = sc.nextLine();
		
		System.out.print("Enter your stheght: ");
		double forca = sc.nextDouble();
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		Champion personage = new Champion(name, TypeWarrior, power, forca, age);
		
		
		System.out.println(personage);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
