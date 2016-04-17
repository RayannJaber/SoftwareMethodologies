import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class onCampusActionListener implements ActionListener {
	private Container contentPane;
	private GridBagConstraints constraints;
	
	public onCampusActionListener(Container contentPane, GridBagConstraints constraints){
		this.contentPane = contentPane;
		this.constraints = constraints;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//JFrame frame2 = new JFrame("On-Campus");
		//frame2.setVisible(true);
		//frame2.setSize(600, 200);
		constraints.gridx =20;
		constraints.gridy = 20;
		contentPane.removeAll();
		JLabel label = new JLabel("Select on campus location.");
		JPanel panel = new JPanel();
		contentPane.add(panel, constraints);
		panel.add(label);
		/*JButton Cudahy = new JButton("Cudahy Hall");
		JButton Olin = new JButton("Olin Engineering");
		JButton Library = new JButton("Raynor Library");
		JButton AMU = new JButton("Alumni Memorial Union");
		JButton Opus = new JButton("Opus Engineering Hall");
		JButton Straz = new JButton("Straz (Dorm)");
		JButton Cobeen = new JButton("Cobeen");
		JButton Carpenter = new JButton("Carpenter Tower");
		JButton Schroeder = new JButton("Schroeder (Dorm)");
		panel.add(Schroeder, constraints);
		panel.add(Carpenter, constraints);
		panel.add(Cobeen, constraints);
		panel.add(Straz, constraints);
		panel.add(Opus, constraints);
		panel.add(Opus, constraints);
		panel.add(AMU, constraints);
		panel.add(Library, constraints);
		panel.add(Olin, constraints);
		panel.add(Cudahy, constraints);*/
		JButton backButton = new JButton("BACK");
		panel.add(backButton, constraints);
		String[] locations = { "Select Location", "Cudahy", "AMU", "Engineering Hall",
			      "Olin Engineering", "Johnston", "Raynor", "Mashuda", "Straz (DORM)", "Carpenter", "Schroeder" };
		 JComboBox ddMenu = new JComboBox(locations);
		 ddMenu.addActionListener(new sendOnCampusRequest(contentPane, constraints, ddMenu));
		 panel.add(ddMenu, constraints);
		contentPane.validate();
		contentPane.repaint();
		backButton.addActionListener(new requestLimoListener(contentPane, constraints));
	}

}
