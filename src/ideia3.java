import java.util.Locale;
import java.util.Scanner;

import gameIdea.AlgnologiaGame;

public class ideia3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Gameplay: ");
		String enter = sc.nextLine();
		
		AlgnologiaGame player = new AlgnologiaGame();
		
		System.out.print("Enter your name champion: ");
		player.namePlayer = sc.nextLine();
		
		System.out.print("Enter age of the chammpion: ");
		player.age = sc.nextInt();
		
		System.out.print("Enter your height: ");
		player.height = sc.nextDouble();
		
		System.out.print("Enter your hability: ");
		player.hability = sc.nextLine();
		
		System.out.print("Enter agility: ");
		player.agility = sc.nextDouble();
		
		
		
		System.out.println(player);
		if (enter == "enter" || enter == "Enter") {
		}
		else {
			System.out.println("The end gamePlay");
		}

	}

}
