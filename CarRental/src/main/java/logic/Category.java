package logic;


public class Category {
	public String name;
	public int price1;
	public int price2;
	public int priceAdd;
	public Category(String cat, int pri1, int pri2, int add) {
		this.name = cat;
		this.price1 = pri1;
		this.price2 = pri2;
		this.priceAdd = add;
	}
}