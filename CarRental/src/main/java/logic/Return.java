package logic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Return {
	public Reservation reservation;
	public int kms;
	public long day;
	public long delay;
	public int documents;
	public int hubcap;
	public boolean processed;
	public float payed;
	
	public Return(Reservation res, int km, String ret, int doc, int hub) {
		this.reservation = res;
		this.kms = km;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String sDateNull = "01/01/1970";
		LocalDate dateNull = LocalDate.parse(sDateNull, dtf);
		LocalDate dateR = LocalDate.parse(ret, dtf);
		this.day = ChronoUnit.DAYS.between(dateNull, dateR);
		this.delay = Math.max(0, day-res.endDay);
		this.documents = doc;
		this.hubcap = hub;
		this.processed = false;
		this.payed = 0;
	}
	
	public Reservation getReservation() {return reservation;}
	//public void setReservation(Reservation res) {this.reservation = res;}
} 