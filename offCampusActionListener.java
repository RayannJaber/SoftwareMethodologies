import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class offCampusActionListener implements ActionListener {
	private Container contentPane;
	private GridBagConstraints constraints;
	
	public offCampusActionListener(Container contentPane, GridBagConstraints constraints){
		this.contentPane = contentPane;
		this.constraints = constraints;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		contentPane.removeAll();
		//JFrame frame3 = new JFrame("Off-Campus");
		//frame3.setVisible(true);
		//frame3.setSize(600, 200);
		//frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Type your current address.");

		contentPane.add(panel);
		panel.add(label);
		JTextField typeAddress = new JTextField();
		typeAddress.setText("Type Address Here");
		typeAddress.setEditable(true);
		panel.add(typeAddress, constraints);
		JButton enterButton = new JButton("Request LIMO");
		JButton backButton = new JButton("BACK");
		panel.add(enterButton, constraints);
		panel.add(backButton, constraints);
		contentPane.validate();
		contentPane.repaint();
		 typeAddress.addMouseListener(new MouseAdapter(){
	            @Override
	            public void mouseClicked(MouseEvent e){
	            	typeAddress.setText("");
	            }
		 });
		enterButton.addActionListener(new sendOffCampusRequest(contentPane, constraints, typeAddress));
		backButton.addActionListener(new requestLimoListener(contentPane, constraints));
	}

}
