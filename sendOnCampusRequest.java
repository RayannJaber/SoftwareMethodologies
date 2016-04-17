import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;


public class sendOnCampusRequest implements ActionListener {
	private JComboBox ddMenu;
	private Container contentPane;
	private GridBagConstraints constraints;

	
	public sendOnCampusRequest(Container contentPane,GridBagConstraints constraints, JComboBox ddMenu) {
		this.contentPane = contentPane;
		this.ddMenu = ddMenu;
		this.constraints = constraints;
	}

	public void actionPerformed(ActionEvent arg0) {
		Object selectedItem = ddMenu.getSelectedItem();
		contentPane.removeAll();
		JLabel bye = new JLabel("Request has been confirmed!");
		bye.setFont(new Font("Verdana", Font.BOLD, 30));
		constraints.anchor = GridBagConstraints.NORTH;
		contentPane.add(bye, constraints);
		bye.setForeground(new Color(255,255,0));
		JButton cancelRequest= new JButton("Cancel Request");
		contentPane.add(cancelRequest, constraints);
		JButton mainMenu = new JButton("Main Menu");
		constraints.anchor = GridBagConstraints.BELOW_BASELINE;
		contentPane.add(mainMenu, constraints);
		mainMenu.addActionListener(new returnToMainMenu());
		contentPane.repaint();
		contentPane.validate();
	}

}
