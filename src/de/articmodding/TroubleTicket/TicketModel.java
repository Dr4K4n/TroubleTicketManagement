package de.articmodding.TroubleTicket;
import java.util.ArrayList;


public class TicketModel {	
	private ArrayList<Ticket> ticketListe = new ArrayList<Ticket>();	
	
	public TicketModel() {
	}
	
	public void setTicketList(ArrayList<Ticket> tickets) {
		ticketListe = tickets;
	}
	public ArrayList<Ticket> getTicketList() {
		return ticketListe;
	}

	public void setTicket(int rowIndex, Ticket rowTicket) {
		ticketListe.set(rowIndex, rowTicket);
	}
	public Ticket getTicket(int selectedTicket) {
		return ticketListe.get(selectedTicket);
	}

	public void addTicket(Ticket neuesTicket) {
		ticketListe.add(neuesTicket);
	}

	public int getTicketCount() {
		return ticketListe.size();
	}
}
