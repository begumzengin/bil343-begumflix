package bil343_hw;

import java.awt.Color;
import java.awt.Container;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class AppGUI extends JFrame {
	
	private JButton logIn, signUp, exit_sign;
	private JLabel welcome_sign, new_here,leave, imageLabel;
	
	private ImageIcon cityscape;
	
	public AppGUI(){
		logIn = new JButton("Log in");
		signUp = new JButton("Sign up");
		welcome_sign = new JLabel("Welcome");
		new_here = new JLabel("If you're new here:");
		leave = new JLabel("If you wish to leave :(");
		exit_sign = new JButton("Exit :(");
		
		cityscape = new ImageIcon(getClass().getResource("cityscape.gif"));
		imageLabel = new JLabel(cityscape);
		
		Container c = getContentPane();
		c.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		Color co = new Color(4, 147, 252);
		c.setBackground(co);
		
		welcome_sign.setAlignmentX(Component.CENTER_ALIGNMENT);
		new_here.setAlignmentX(Component.CENTER_ALIGNMENT);
		logIn.setAlignmentX(Component.CENTER_ALIGNMENT);
		signUp.setAlignmentX(Component.CENTER_ALIGNMENT);
		leave.setAlignmentX(Component.CENTER_ALIGNMENT);
		exit_sign.setAlignmentX(Component.CENTER_ALIGNMENT);
		imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		c.add(welcome_sign);
		c.add(logIn);
		c.add(new_here);
		c.add(signUp);
		c.add(leave);
		c.add(exit_sign);
		c.add(imageLabel);
		
		
		MyEventHandler myEvent = new MyEventHandler();
		logIn.addActionListener(myEvent);
		signUp.addActionListener(myEvent);
		exit_sign.addActionListener(
				new ActionListener() { //anonymous inner class 
					public void actionPerformed(ActionEvent ae) {
						System.exit(0); 
					}
				}
				);
		
	}
	
	public static void main(String[] args) {
		
		AppGUI gui = new AppGUI();
		
		gui.setTitle("Begumflix");
		gui.setSize(400, 400);
		gui.setVisible(true);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	//nested inner class
	public class MyEventHandler implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			
			if(ae.getSource() == logIn) {
				
				LogInPage login_obj = new LogInPage();
				
				login_obj.setTitle("Begumflix - Log in");
				login_obj.setSize(400, 400);
				login_obj.setVisible(true);
				login_obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
			else if(ae.getSource() == signUp) {
				
				SignUpPage signup_gui = new SignUpPage();
				
				signup_gui.setTitle("Begumflix - Sign Up");
				signup_gui.setSize(400, 400);
				signup_gui.setVisible(true);
				signup_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		}
	}
	
	
	
	

}
