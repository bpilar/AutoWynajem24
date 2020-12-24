package logic;


public class Client {
	public String name;
	public int loyalty;
	public Reservation reservation;
	public Client(String nm, int loy) {
		this.name = nm;
		this.loyalty = loy;
		reservation = null;
	}
}