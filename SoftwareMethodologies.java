/*
 * Creates background JFrame platform for Marquette L.I.M.O. app. Includes title and jpg image. 
 * Date created: 2-25-16
 * 
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SoftwareMethodologies extends JFrame {
	public static void main(String[] args) throws IOException {
		SoftwareMethodologies window = new SoftwareMethodologies();
	}

	private Container contentPane;
	private JLabel titleLabel;
	private JLabel imageLabel;
	private JButton requestButton;

	public SoftwareMethodologies() throws IOException {

		setTitle("Marquette L.I.M.O");
		setSize(1000, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = getContentPane();
		contentPane.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.weightx = 0.5;
		constraints.weighty = 1.0;
		constraints.gridy = 3;
		constraints.gridx = 3;
		constraints.ipady = 20;
		constraints.ipadx = 10;
		constraints.gridwidth = 1;
		constraints.insets = new Insets(10,0,0,0);
		contentPane.setBackground(new Color(0,0,100)); // sets background to gray
		titleLabel = new JLabel("Marquette L.I.M.O."); // creates label
		titleLabel.setForeground(new Color(255,255,0)); // sets color of label to white

		titleLabel.setFont(new Font("Verdana", Font.BOLD, 30)); //sets font of title
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setVerticalAlignment(JLabel.TOP);
		constraints.anchor = GridBagConstraints.PAGE_START;
		contentPane.add(titleLabel, constraints);

		GridBagConstraints constraints2 = new GridBagConstraints();
		constraints2.fill = GridBagConstraints.NONE;
		constraints2.weightx = 0.5;
		constraints2.weighty = 1.0;
		constraints2.gridy = 3;
		constraints2.gridx = 3;
		constraints2.ipady = 20;
		constraints2.ipadx = 10;
		constraints2.gridwidth = 1;
		constraints2.insets = new Insets(10,0,0,0);

		constraints2.anchor= GridBagConstraints.PAGE_START;
		constraints2.anchor= GridBagConstraints.SOUTHWEST;
		constraints.anchor = GridBagConstraints.WEST;
		JTextField login = new JTextField("Login");
		login.setFont(new Font("Arial", Font.BOLD, 18));
		login.setEditable(true);
		contentPane.add(login, constraints);
		
		JTextField password = new JTextField("Password");
		password.setFont(new Font("Arial", Font.BOLD, 18));
		password.setEditable(true);
		contentPane.add(password, constraints2);
		
		 login.addMouseListener(new MouseAdapter(){
	            @Override
	            public void mouseClicked(MouseEvent e){
	            	login.setText("");
	            }
		 });
		 password.addMouseListener(new MouseAdapter(){
	            @Override
	            public void mouseClicked(MouseEvent e){
	            	password.setText("");
	            }
		 });
		 
			
			requestButton = new JButton("Request");
			requestButton.setSize(50, 100);
			requestButton.setBackground(Color.DARK_GRAY);
			requestButton.setFont(new Font("Verdana", Font.BOLD, 15));
			requestButton.setForeground(new Color(255,255,0));
			constraints.anchor = GridBagConstraints.EAST;
			contentPane.add(requestButton, constraints); // adds button to the frame
			requestButton.addActionListener(new requestLimoListener(contentPane, constraints));
			
			String path = "http://wiki.muscoop.com/lib/exe/fetch.php/nickname/165px-marquette_athletics_logo.png";
			URL url = new URL(path);
			BufferedImage image = ImageIO.read(url);
			imageLabel = new JLabel(new ImageIcon(image));
			imageLabel.setHorizontalAlignment(JLabel.LEFT);
			imageLabel.setVerticalAlignment(JLabel.BOTTOM);
			constraints.anchor = GridBagConstraints.LAST_LINE_END;
			contentPane.add(imageLabel, constraints);
		
		
		setVisible(true);
		contentPane.validate();
	}
}
