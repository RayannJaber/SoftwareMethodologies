//login confirmation page 
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

public class RequestConf extends JFrame {		//request confirm
	public static void main(String[] args){
		new RequestConf().setVisible(true);
	}
	private RequestConf(){
		super("Request Confirmed"); //page name
		setSize(1000, 500);			//page size
		setResizable(false);		//not resizable
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JLabel pageName= new JLabel("Request has been confirmed!");	//text of page
		pageName.setForeground(Color.WHITE); //sets color of label to white
		pageName.setFont(new Font("Verdana", Font.BOLD,20));//sets font of label
		Container contentPane = getContentPane();
		contentPane.add(pageName);					//Text is displayed on screen
		contentPane.setBackground(Color.GRAY);		// background is set to gray
		
		JButton contButton= new JButton("Main Menu");	//button to return to home screen
		add(contButton);
	}
}
