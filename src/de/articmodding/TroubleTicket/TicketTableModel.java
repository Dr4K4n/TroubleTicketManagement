package de.articmodding.TroubleTicket;

import javax.swing.table.AbstractTableModel;

public class TicketTableModel extends AbstractTableModel {
	
	private static final long serialVersionUID = 7454856361527841899L;
	
	private TicketModel ticketModel;
	private String[] columnNames = {"Priorität", "Status", "Betreff", "Ersteller", "Datum"};
	
	public TicketTableModel(TicketModel model) {
		ticketModel = model;
	}
	
	@Override
	public String getColumnName(int col) {
		return columnNames[col].toString();
	}
	
	public Object getValueAt(int rowIndex, int columnIndex) {
		Ticket rowTicket = ticketModel.getTicket(rowIndex);
		if(columnIndex == 0) return rowTicket.getPrioritaet();
		if(columnIndex == 1) return rowTicket.getStatusString();
		if(columnIndex == 2) return rowTicket.getBetreff();
		if(columnIndex == 3) return rowTicket.getErsteller();
		if(columnIndex == 4) return rowTicket.getDateString();
		return null;
	}
	
	public int getRowCount() {
		return ticketModel.getTicketCount();
	}
	
	public int getColumnCount() {
		return columnNames.length;
	}
}
