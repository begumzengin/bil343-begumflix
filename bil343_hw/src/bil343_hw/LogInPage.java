package bil343_hw;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LogInPage extends JFrame implements ActionListener{
	
	private String emailAddress;
	private char[] password;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}



	private JButton enter;
	private JTextField emailField;
	private JLabel email_label, password_label;
	private JPasswordField passwordField;
	
	
	public LogInPage() {
		enter = new JButton("Enter");
		emailField = new JTextField(25);
		passwordField = new JPasswordField(25);
		email_label = new JLabel("Email: ");
		password_label = new JLabel("Password: ");
		
		
		
		Container login_c = getContentPane();
		login_c.setLayout(new FlowLayout());
		Color co = new Color(143, 208, 255);
		login_c.setBackground(co);
		
		login_c.add(email_label);
		login_c.add(emailField);
		login_c.add(password_label);
		login_c.add(passwordField);
		login_c.add(enter);
		
		enter.addActionListener(this);
		
		
	}
	
	public static void main(String[] args) {
		
		LogInPage login_gui = new LogInPage();
		
		login_gui.setTitle("Begumflix - Log in");
		login_gui.setSize(400, 400);
		login_gui.setVisible(true);
		login_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == enter) {
			emailAddress = emailField.getText();
			if(emailAddress.contains("@") == false)
				JOptionPane.showMessageDialog(null, "Please enter a valid e-mail address", "ERROR", JOptionPane.ERROR_MESSAGE);
			else if(emailAddress.contains("@") == true)
				password = passwordField.getPassword();
				if(new String(password).matches(".*\\d.*"))
					JOptionPane.showMessageDialog(null, "You have successfully logged in");
				else {
					JOptionPane.showMessageDialog(null, "The password should contain at least 1 letter and 1 number", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	
}
	
	


