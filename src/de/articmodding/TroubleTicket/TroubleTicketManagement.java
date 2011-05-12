package de.articmodding.TroubleTicket;

public class TroubleTicketManagement {
	
	private static TicketController controller;

	public static void main(String[] args) {
		controller = new TicketController();
		controller.showView();
	}
}
