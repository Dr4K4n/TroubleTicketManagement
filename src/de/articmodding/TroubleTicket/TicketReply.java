package de.articmodding.TroubleTicket;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TicketReply implements Serializable  {

	private static final long serialVersionUID = 3678823875236822881L;

	private Integer id;
	private Date date;
	private String betreff = "";
	private String text = "";
	private Ticket ticket;
	
	public TicketReply() {
	}
	
	public TicketReply(String betreff, String text) {
		setDate(new Date());
		setBetreff(betreff);
		setText(text);
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDate() {
		return date;
	}

	public void setBetreff(String betreff) {
		this.betreff = betreff;
	}
	public String getBetreff() {
		return betreff;
	}

	public void setText(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}
	
	public void setTicket(Ticket parent) {
		this.ticket = parent;
	}
	public Ticket getTicket() {
		return ticket;
	}

	/**
	 * @return Date formatted as String "dd.MM.yy HH:mm:ss"
	 */
	public String getDateString() {
		DateFormat df = new SimpleDateFormat("dd.MM.yy HH:mm:ss");
		return df.format(date);
	}
	@Override
	public String toString() {
		return "<TicketReply " + betreff + ">";
	}
}
