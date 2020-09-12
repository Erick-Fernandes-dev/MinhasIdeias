package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		
		str.add("Erick");
		str.add("Gabriel");
		str.add("Joseane");
		str.add("André");
		str.add("Anderson");
		str.add("Gabriela");
		str.add("Antonio");
		str.add(3, "Juliana");
		
		System.out.println("Length List: " + str.size());
		
		System.out.println();
		
		for (String x : str) {
			System.out.println(x);
		}
		
		System.out.println();
		
		str.removeIf(x -> x.charAt(0) == 'G');
		
		for (String x : str) {
			System.out.println(x);
		}
		
		System.out.println();
		
		System.out.println("Indef of Erick: " + str.indexOf("Erick"));
		System.out.println("Index of Pedro: " + str.indexOf("Pedro"));
		
		System.out.println();
		
		List<String> result = str.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println("Names selected: " + x);
			
		}
		
		
		System.out.println();
		
		String name = str.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		

	}

}
