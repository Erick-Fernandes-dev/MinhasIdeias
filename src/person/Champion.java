package person;

public class Champion {
	private String name;
	private String TypeWarrior;
	private String power;
	private double forca;
	private int age;
	
	public Champion(){
		
	}
	
	
	public Champion(String name, String TypeWarrior, String power, double forca, int age){
		this.name = name;
		this.TypeWarrior = TypeWarrior;
		this.power = power;
		this.forca = forca;
		this.age = age;
	}
	
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
		
	}
	
	public String getTypeWarrior(){
		return TypeWarrior;
	}


	@Override
	public String toString() {
		return "\nChampion:\n\nname = " + name + "\nTypeWarrior = " + TypeWarrior + "\npower = " + power + "\nforca = " + forca
				+ "\nage = " + age;
	}
	
	

	
	

}
