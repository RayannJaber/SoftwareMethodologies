import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class requestLimoListener implements ActionListener { 
	private Container contentPane;
	private GridBagConstraints constraints;
	public requestLimoListener(Container contentPane, GridBagConstraints constraints){
		this.contentPane = contentPane;
		this.constraints = constraints;
	}

	public void actionPerformed(ActionEvent e) {
			requestButtonCallback();
	}

	public void requestButtonCallback() throws MalformedURLException {

		constraints.gridx = 2;
		constraints.gridy = 2;
		constraints.ipadx = 350;
		constraints.ipady = 50;
		contentPane.removeAll();
		contentPane.repaint();
		JLabel location = new JLabel("ON OR OFF CAMPUS?");
		location.setForeground(new Color(255, 255, 0));;
		location.setFont(new Font("Verdana", Font.BOLD, 50));
		constraints.anchor = GridBagConstraints.NORTH;
		contentPane.add(location, constraints);
		constraints.anchor = GridBagConstraints.EAST;
		JButton onCampus = new JButton("On Campus");
		contentPane.add(onCampus, constraints);
		constraints.anchor = GridBagConstraints.WEST;
		JButton offCampus = new JButton("Off Campus");
		contentPane.add(offCampus, constraints);
		
		contentPane.repaint();
		contentPane.validate();
		onCampus.addActionListener(new onCampusActionListener(contentPane, constraints));
		offCampus.addActionListener(new offCampusActionListener(contentPane, constraints));
	}
}
