package logic;


public class Car {
	public String category;
	public String name;
	public boolean avaliable;
	
	public Car(String cat, String nm) {
		this.category = cat;
		this.name = nm;
		this.avaliable = true;
	}
	
	public String getCategory() {return category;}
}