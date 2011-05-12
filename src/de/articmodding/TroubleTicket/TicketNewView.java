package de.articmodding.TroubleTicket;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class TicketNewView extends JFrame {

	private static final long serialVersionUID = 3921589053996089394L;
	
	private JPanel contentPane = null;
	private JLabel erstellerLabel = new JLabel("Ersteller");
	private JLabel erstellerEmailLabel = new JLabel("Ersteller E-Mail");
	private JLabel betreffLabel = new JLabel("Betreff");
	private JLabel textLabel = new JLabel("Text");
	private JTextField erstellerField = new JTextField();
	private JTextField erstellerEmailField = new JTextField();
	private JTextField betreffField = new JTextField();
	private JTextArea textArea = new JTextArea();
	private JButton okButton = new JButton("OK");
	private JButton exitButton = new JButton("Abbrechen");
	
	/*
	 * Constructor
	 */
	public TicketNewView() {
		super("Ticket");
		setBounds(300, 250, 600, 400);
		setContentPane(getJContentPane());
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	/*
	 * Getters and Setters
	 */
	
	public void setErsteller(String ersteller) {
		erstellerField.setText(ersteller);
	}
	public String getErsteller() {
		return erstellerField.getText();
	}
	
	public void setErstellerEmail(String email) {
		erstellerEmailField.setText(email);
	}
	public String getErstellerEmail() {
		return erstellerEmailField.getText();
	}
	
	public void setBetreff(String betreff) {
		betreffField.setText(betreff);
	}
	public String getBetreff() {
		return betreffField.getText();
	}
	
	public void setText(String text) {
		textArea.setText(text);
	}
	public String getText() {
		return textArea.getText();
	}
	
	/*
	 * other Methods and Functions
	 */
	private JPanel getJContentPane() {
		if (contentPane == null) {
			GridBagConstraints erstellerLabelContraints = new GridBagConstraints();
			erstellerLabelContraints.gridx = 0;
			erstellerLabelContraints.gridy = 0;
			erstellerLabelContraints.anchor = GridBagConstraints.WEST;
			erstellerLabelContraints.insets = new Insets(1, 1, 1, 1);
			GridBagConstraints erstellerEmailLabelContraints = new GridBagConstraints();
			erstellerEmailLabelContraints.gridx = 0;
			erstellerEmailLabelContraints.gridy = 1;
			erstellerEmailLabelContraints.anchor = GridBagConstraints.WEST;
			erstellerEmailLabelContraints.insets = new Insets(1, 1, 1, 1);
			GridBagConstraints betreffLabelContraints = new GridBagConstraints();
			betreffLabelContraints.gridx = 0;
			betreffLabelContraints.gridy = 2;
			betreffLabelContraints.anchor = GridBagConstraints.WEST;
			betreffLabelContraints.insets = new Insets(1, 1, 1, 1);
			GridBagConstraints textLabelContraints = new GridBagConstraints();
			textLabelContraints.gridx = 0;
			textLabelContraints.gridy = 3;
			textLabelContraints.anchor = GridBagConstraints.WEST;
			textLabelContraints.insets = new Insets(1, 1, 1, 1);

			GridBagConstraints erstellerTextContraints = new GridBagConstraints();
			erstellerTextContraints.fill = GridBagConstraints.HORIZONTAL;
			erstellerTextContraints.anchor = GridBagConstraints.WEST;
			erstellerTextContraints.gridx = 1;
			erstellerTextContraints.gridy = 0;
			erstellerTextContraints.weightx = 2.0;
			erstellerTextContraints.insets = new Insets(1, 1, 1, 1);
			GridBagConstraints erstellerEmailTextContraints = new GridBagConstraints();
			erstellerEmailTextContraints.fill = GridBagConstraints.HORIZONTAL;
			erstellerEmailTextContraints.anchor = GridBagConstraints.WEST;
			erstellerEmailTextContraints.gridx = 1;
			erstellerEmailTextContraints.gridy = 1;
			erstellerEmailTextContraints.weightx = 2.0;
			erstellerEmailTextContraints.insets = new Insets(1, 1, 1, 1);
			GridBagConstraints betreffTextContraints = new GridBagConstraints();
			betreffTextContraints.fill = GridBagConstraints.HORIZONTAL;
			betreffTextContraints.anchor = GridBagConstraints.WEST;
			betreffTextContraints.gridx = 1;
			betreffTextContraints.gridy = 2;
			betreffTextContraints.weightx = 2.0;
			betreffTextContraints.insets = new Insets(1, 1, 1, 1);
			
			GridBagConstraints textareaContraints = new GridBagConstraints();
			textareaContraints.fill = GridBagConstraints.BOTH;
			textareaContraints.gridx = 1;
			textareaContraints.gridy = 3;
			textareaContraints.weightx = 1.0;
			textareaContraints.weighty = 1.0;
			textareaContraints.insets = new Insets(1, 1, 1, 1);

			GridBagConstraints okButtonContraints = new GridBagConstraints();
			okButtonContraints.gridx = 0;
			okButtonContraints.gridy = 4;
			okButtonContraints.insets = new Insets(1, 1, 1, 1);
			okButtonContraints.anchor = GridBagConstraints.EAST;
			GridBagConstraints abbrechenButtonContraints = new GridBagConstraints();
			abbrechenButtonContraints.gridx = 1;
			abbrechenButtonContraints.gridy = 4;
			abbrechenButtonContraints.insets = new Insets(1, 1, 1, 1);
			abbrechenButtonContraints.anchor = GridBagConstraints.WEST;
			
			contentPane = new JPanel();
			contentPane.setLayout(new GridBagLayout());
			contentPane.add(erstellerLabel, erstellerLabelContraints);
			contentPane.add(erstellerEmailLabel, erstellerEmailLabelContraints);
			contentPane.add(betreffLabel, betreffLabelContraints);
			contentPane.add(textLabel, textLabelContraints);
			contentPane.add(erstellerField, erstellerTextContraints);
			contentPane.add(erstellerEmailField, erstellerEmailTextContraints);
			contentPane.add(betreffField, betreffTextContraints);
			contentPane.add(okButton, okButtonContraints);
			contentPane.add(exitButton, abbrechenButtonContraints);
			contentPane.add(textArea, textareaContraints);
		}
		return contentPane;
	}
	
	public void setOkButtonListener(ActionListener al) {
		okButton.addActionListener(al);
	}	
	public void setExitButtonListener(ActionListener al) {
		exitButton.addActionListener(al);
	}

	public void reset() {
		erstellerField.setText("");
		erstellerEmailField.setText("");
		betreffField.setText("");
		textArea.setText("");
	}
	
	/*
	 * Overrides
	 */
	public void dispose() {
		ActionEvent event = new ActionEvent(this, 0, "enable");
		exitButton.getActionListeners()[0].actionPerformed(event);
		super.dispose();	
	}
}

