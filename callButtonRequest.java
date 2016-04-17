import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//The radio buttons that user selects to determine if they are on campus or not and the text box and drop down menu that goes with it 
//Causes a request to be sent to cell phone or email and tells user LIMO Requested when callback is complete

public class callButtonRequest {

public static void main (String[] args){    
  JFrame frame = new JFrame("Limo Service");
  frame.setVisible(true);
  frame.setSize(500,200);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  
  JPanel panel = new JPanel();
  frame.add(panel);
  JButton button = new JButton("On campus");
  panel.add(button);
  button.addActionListener (new Action1());

  JButton button2 = new JButton("off campus");
  panel.add(button2);
  button2.addActionListener (new Action2());
}
static class Action1 implements ActionListener {        
  public void actionPerformed (ActionEvent e) {     
    JFrame frame2 = new JFrame("on-campus");
    frame2.setVisible(true);
    frame2.setSize(600,200);
    JLabel label = new JLabel("Type the address on the campus");
    JPanel panel = new JPanel();
    frame2.add(panel);
    panel.add(label);       
  }
}   
static class Action2 implements ActionListener {        
  public void actionPerformed (ActionEvent e) {     
    JFrame frame3 = new JFrame("off-campus");
    frame3.setVisible(true);
    frame3.setSize(600,200);
    frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel();
    JLabel label = new JLabel("type the address off the compus");
   
    frame3.add(panel);
    panel.add(label);
  }
}   
}
