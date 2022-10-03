package bil343_hw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUpPage extends JFrame implements ActionListener{
	
	private String name;
	private String surname;
	private String emailAddress;
	private char[] password;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
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
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	private JTextField ageField, nameField, surnameField, emailField;
	private JLabel ageLabel, nameLabel, surnameLabel, emailLabel, passwordLabel, info;
	private JButton continueToSubscription;
	private JPasswordField passwordField;
	
	public SignUpPage() {
		ageField = new JTextField(2);
		ageLabel = new JLabel("Age:");
		nameField = new JTextField(20);
		nameLabel = new JLabel("Name:");
		surnameField = new JTextField(20);
		surnameLabel = new JLabel("Surname:");
		emailField = new JTextField(25);
		emailLabel = new JLabel("Email:");
		passwordField = new JPasswordField(20);
		passwordLabel = new JLabel("Password:");
		info = new JLabel("Please fill the blanks required below");
		continueToSubscription = new JButton("Continue");
		
		Container signup_c = getContentPane();
		signup_c.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		Color co = new Color(143, 208, 255);
		signup_c.setBackground(co);
		
		signup_c.add(info);
		signup_c.add(nameLabel);
		signup_c.add(nameField);
		signup_c.add(surnameLabel);
		signup_c.add(surnameField);
		signup_c.add(ageLabel);
		signup_c.add(ageField);
		signup_c.add(emailLabel);
		signup_c.add(emailField);
		signup_c.add(passwordLabel);
		signup_c.add(passwordField);
		signup_c.add(continueToSubscription);
		
		info.setAlignmentX(Component.CENTER_ALIGNMENT);
		nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		nameField.setAlignmentX(Component.CENTER_ALIGNMENT);
		surnameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		surnameField.setAlignmentX(Component.CENTER_ALIGNMENT);
		ageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		ageField.setAlignmentX(Component.CENTER_ALIGNMENT);
		emailLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		emailField.setAlignmentX(Component.CENTER_ALIGNMENT);
		passwordLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		passwordField.setAlignmentX(Component.CENTER_ALIGNMENT);
		continueToSubscription.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		continueToSubscription.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		
		SignUpPage signup_gui = new SignUpPage();
		
		signup_gui.setTitle("Begumflix - Sign Up");
		signup_gui.setSize(400, 400);
		signup_gui.setVisible(true);
		signup_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == continueToSubscription) {
			
			
			name = nameField.getText();
			surname = surnameField.getText();
			age = Integer.parseInt(ageField.getText());
			emailAddress = emailField.getText();
			password = passwordField.getPassword();
			
			
			//if the email address isn't valid, an error is generated
			if(emailAddress.contains("@") == false)
				JOptionPane.showMessageDialog(null, "Please enter a valid e-mail address");
			else if(emailAddress.contains("@") == true)
				password = passwordField.getPassword();
				if(new String(password).matches(".*\\d.*")) {
					this.dispose();
					
					ChooseSubscription subs_gui = new ChooseSubscription();
					
					subs_gui.setTitle("Begumflix - Choose Subscription");
					subs_gui.setSize(400, 400);
					subs_gui.setVisible(true);
					subs_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
				}
				else {
					JOptionPane.showMessageDialog(null, "The password should contain at least 1 letter and 1 number");
				}	
		}	
	}
}
