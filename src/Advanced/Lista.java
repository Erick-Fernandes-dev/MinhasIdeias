package Advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Erick");
		list.add("Joao");
		list.add("Maria");
		list.add("Andre");
		list.add(1, "Marcus");
		list.add(2, "Tesla");
		list.add("Amanda");
		list.add("Arthur");
		
	
		System.out.println("===== " + list.size() + " =====");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("=================================");
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("===== " + list.size() + " =====");
		System.out.println();
		
		System.out.println("=================================");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("==================================");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		
		
		System.out.println("=-=-=-= THE END =-=-=-=");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
