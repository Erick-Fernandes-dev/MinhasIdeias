import java.util.Locale;
import java.util.Scanner;

class ideia1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String name;
		int age;
		char gender;
		double height;
		
		name = sc.next();
		System.out.println("You enter your name: "+ name);
		
		age = sc.nextInt();
		System.out.println("Your age is "+ age);
		
		gender = sc.next().charAt(0);
		System.out.println("Your gender is "+ gender);
		
		height = sc.nextDouble();
		System.out.println("Your height is "+ height);
		
		
		
		
	}
}