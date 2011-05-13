package de.articmodding.TroubleTicket;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TicketReplyTableModel extends AbstractTableModel {
	
	private static final long serialVersionUID = -4407180532758175339L;
	
	private List<TicketReply> replies = new ArrayList<TicketReply>();
	private String[] columnNames = {"Betreff", "Datum"};

	public TicketReplyTableModel() {
	}
	
	public TicketReplyTableModel(Ticket ticket) {
		replies = ticket.getReplies();
	}	
	
	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}
	
	public Object getValueAt(int rowIndex, int columnIndex) {
		TicketReply rowReply = (TicketReply) replies.toArray()[replies.size() - (rowIndex+1)];
		if(columnIndex == 0) return rowReply.getBetreff();
		if(columnIndex == 1) return rowReply.getDateString();
		return null;
	}

	public int getRowCount() {
		return replies.size();
	}
	public int getColumnCount() {
		return columnNames.length;
	}
	
	public TicketReply getReply(int selectedRow) {
		return replies.get(replies.size() - (selectedRow+1));
	}
}
