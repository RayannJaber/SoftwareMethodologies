//login confirmation page 
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;


public class requestConfirmation extends JFrame  {		//request confirm
	public static void main(String[] args) throws InterruptedException{
		new requestConfirmation().setVisible(true);
	}
	private JPanel background= new JPanel();
	private requestConfirmation() throws InterruptedException{
		
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
		
		JButton contButton= new JButton("Main Menu"); //button to return to home screen
		contButton.setFont(new Font("Verdana", Font.BOLD, 20));
		add(contButton);
		
		
		
		
		
		JLabel timerLabel= new JLabel("Estimated time: ");
		timerLabel.setForeground(Color.BLACK);
		timerLabel.setFont(new Font ("Verdana", Font.BOLD,20));
		
		JTextField timer= new JTextField("15:00");
		timer.setForeground(Color.BLACK);
		timer.setFont(new Font("Arial", Font.BOLD, 18));
		
		JLabel unitLabel= new JLabel ("minutes");
		unitLabel.setForeground(Color.BLACK);
		unitLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		

		
	
		contentPane.add(timerLabel);
		contentPane.add(timer);
		contentPane.add(unitLabel);

		
			}
}
