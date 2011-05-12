package de.articmodding.TroubleTicket;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Ticket implements Serializable {

	private static final long serialVersionUID = -5711253742593767279L;
	
	private Integer id;
	private Date date;
	private Integer status = 0;
	private Integer prioritaet = 0;
	private String ersteller = "";
	private String erstellerEMail = "";
	private String betreff = "";
	private String text = "";
	private List<TicketReply> replies = new ArrayList<TicketReply>();
	
	public static String[] statusList = {"Neu", "Angenommen", "in Bearbeitung", "in Klärung", "Abgeschlossen"};
	
	public Ticket() {		
	}
	
	public Ticket(String ersteller, String erstellerEMail, String betreff, String text) {
		this.setDate(new Date());
		this.setErsteller(ersteller);
		this.setErstellerEMail(erstellerEMail);
		this.setBetreff(betreff);
		this.setText(text);
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
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getStatus() {
		return status;
	}
	
	public void setPrioritaet(Integer prioritaet) {
		this.prioritaet = prioritaet;
	}
	public Integer getPrioritaet() {
		return prioritaet;
	}

	public void setErsteller(String ersteller) {
		this.ersteller = ersteller;
	}
	public String getErsteller() {
		return ersteller;
	}

	public void setErstellerEMail(String erstellerEMail) {
		this.erstellerEMail = erstellerEMail;
	}
	public String getErstellerEMail() {
		return erstellerEMail;
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
	
	public void setReplies(List<TicketReply> list) {
		if(list.size() > replies.size()){
			this.replies.clear();
			for(TicketReply reply : list) {
				// es sind viele null-Values enthalten (Ids sind nicht fortlaufend)
				if(reply != null) { 
					replies.add(reply);
				}
			}
		}
	}
	public List<TicketReply> getReplies() {
		return (List<TicketReply>) replies;
	}
	
	public String getStatusString() {
		return statusList[status];
	}

	public void addReply(TicketReply ticketReply) {
		ticketReply.setTicket(this);
		replies.add(ticketReply);
	}
	public TicketReply getReply(Integer selectedRow) {
		return replies.get(selectedRow);
	}

	public String getDateString() {
		DateFormat df = new SimpleDateFormat("dd.MM.yy HH:mm:ss");
		return df.format(date);
	}

	@Override
	public String toString() {
		return "<Ticket: " + betreff + ">";
	}
}
