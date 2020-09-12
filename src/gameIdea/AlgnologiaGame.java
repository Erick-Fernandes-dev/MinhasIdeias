package gameIdea;

public class AlgnologiaGame {
	public String namePlayer;
	public int age;
	public double height;
	public double power;
	public String hability;
	public double agility;
	public char genre;
	
	public void steps() {
		if (agility >= 80.99) {
			int stepsForwards = 0;
			
			while (stepsForwards <= 10) {
				stepsForwards++;
				if (stepsForwards == 3) {
					System.out.println("jump platform;");
					
				}
				else if (stepsForwards == 9) {
					System.out.println("dodge the platform;");
					
				}
				else {
					System.out.println("Stop run;");
				}
			}
			
		}
	
	}
	
	public String toString() {
		return namePlayer;
	}
	
	

}
