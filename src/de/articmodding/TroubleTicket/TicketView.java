package de.articmodding.TroubleTicket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicketView extends JFrame {

	private static final long serialVersionUID = 1961151363538365761L;
	
	private JPanel contentPane = null;
	private JTable table = new JTable();
	private JButton newButton = new JButton("Neues Ticket");
	private JButton editButton = new JButton("Bearbeiten");
	private JButton exitButton = new JButton("Beenden");
	
	/**
	 * This method initializes jFrame
	 */
	public TicketView() {
		super("Trouble Ticket Management");
		setContentPane(getJContentPane());
		setBounds(200, 150, 600, 400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public void dispose() {
		ActionEvent event = new ActionEvent(this, 0, "save");
		exitButton.getActionListeners()[0].actionPerformed(event);
		super.dispose();
	}
	/**
	 * This method initializes jContentPane	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPane() {
		if (contentPane == null) {
			contentPane = new JPanel();
			contentPane.setLayout(new GridBagLayout());
			
			GridBagConstraints button1Constraints = new GridBagConstraints();
			button1Constraints.fill = GridBagConstraints.NONE;
			button1Constraints.anchor = GridBagConstraints.NORTHWEST;
			button1Constraints.gridy = 0;
			button1Constraints.gridx = 0;
			
			GridBagConstraints button2Constraints = new GridBagConstraints();
			button2Constraints.fill = GridBagConstraints.NONE;
			button2Constraints.anchor = GridBagConstraints.NORTHWEST;
			button2Constraints.gridy = 0;
			button2Constraints.gridx = 1;
			
			GridBagConstraints button3Constraints = new GridBagConstraints();
			button3Constraints.fill = GridBagConstraints.NONE;
			button3Constraints.anchor = GridBagConstraints.NORTHEAST;
			button3Constraints.gridy = 0;
			button3Constraints.gridx = 2;
			button3Constraints.weightx = 2;
			
			GridBagConstraints tableContraints = new GridBagConstraints();
			tableContraints.fill = GridBagConstraints.BOTH;
			tableContraints.anchor = GridBagConstraints.NORTHWEST;
			tableContraints.gridy = 1;
			tableContraints.gridx = 0;
			tableContraints.gridwidth = 3;
			tableContraints.weighty = 2;

			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			
			contentPane.add(newButton, button1Constraints);
			contentPane.add(editButton, button2Constraints);
			contentPane.add(exitButton, button3Constraints);
			contentPane.add(new JScrollPane(table), tableContraints);
		}
		return contentPane;
	}
	
	public void setNeuActionListener(ActionListener al) {
		newButton.addActionListener(al);
	}
	
	public void setBearbeitenActionListener(ActionListener al) {
		editButton.addActionListener(al);
	}
	
	public void setBeendenActionListener(ActionListener al) {
		exitButton.addActionListener(al);
	}
	
	public int getSelectedTableRow() {
		return table.getSelectedRow();
	}
	
	public void refreshTable() {
		table.updateUI();
	}

	public void setTableModel(AbstractTableModel tableModel) {
		table.setModel(tableModel);
	}
}
