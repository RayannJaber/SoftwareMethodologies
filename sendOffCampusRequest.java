import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class sendOffCampusRequest implements ActionListener {
	private Container contentPane;
	private GridBagConstraints constraints;
	private JTextField text;
	
	public sendOffCampusRequest(Container contentPane, GridBagConstraints constraints, JTextField text){
		this.contentPane = contentPane;
		this.constraints = constraints;
		this.text = text;
	}
	public void actionPerformed(ActionEvent e) {
		contentPane.removeAll();
		JLabel bye = new JLabel("Request has been confirmed!");
		bye.setFont(new Font("Verdana", Font.BOLD, 30));
		constraints.anchor = GridBagConstraints.NORTH;
		contentPane.add(bye, constraints);
		bye.setForeground(new Color(255,255,0));
		JButton mainMenu = new JButton("Main Menu");
		constraints.anchor = GridBagConstraints.CENTER;
		JButton cancelRequest= new JButton("Cancel Request");
		contentPane.add(cancelRequest, constraints);
		contentPane.add(mainMenu, constraints);
		mainMenu.addActionListener(new returnToMainMenu());
		contentPane.repaint();
		contentPane.validate();

	}

}
