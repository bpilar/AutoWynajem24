package logic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Reservation {
	public String category;
	public String client;
	public long beginDay;
	public long endDay;
	public long daysCount;
	public int seat;
	public int rack;
	public boolean processed;
	public float payed;
	public Car car;
	
	public Reservation(String cat, String cli, String begin, String end, int ifseat, int ifrack) {
		this.category = cat;
		this.client = cli;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String sDateNull = "01/01/1970";
		LocalDate dateNull = LocalDate.parse(sDateNull, dtf);
        LocalDate dateB = LocalDate.parse(begin, dtf);
		LocalDate dateE = LocalDate.parse(end, dtf);
		this.beginDay = ChronoUnit.DAYS.between(dateNull, dateB);
		this.endDay = ChronoUnit.DAYS.between(dateNull,dateE);
		this.daysCount = endDay-beginDay+1;
		this.seat = ifseat;
		this.rack = ifrack;
		this.processed = false;
		this.payed = 0;
		this.car = null;
	}
	
	public Reservation(String cli, String begin, String end, int ifseat, int ifrack) {
		this.category = "A";
		this.client = cli;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String sDateNull = "01/01/1970";
		LocalDate dateNull = LocalDate.parse(sDateNull, dtf);
        LocalDate dateB = LocalDate.parse(begin, dtf);
		LocalDate dateE = LocalDate.parse(end, dtf);
		this.beginDay = ChronoUnit.DAYS.between(dateNull, dateB);
		this.endDay = ChronoUnit.DAYS.between(dateNull,dateE);
		this.daysCount = endDay-beginDay+1;
		this.seat = ifseat;
		this.rack = ifrack;
		this.processed = false;
		this.payed = 0;
		this.car = null;
	}
	
	public String getCategory() {return category;}
	public String getClient() {return client;}
	
} 