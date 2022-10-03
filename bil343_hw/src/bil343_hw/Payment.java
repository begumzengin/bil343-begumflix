package bil343_hw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener{
	
	private int creditCardNumber;
	private String cardOwnersName;
	private String cardOwnersLastName;
	private int cardExpireDay;
	private int cardExpireMonth;
	private int securityNumber;
	private int creditCardNumberLength;
	private SubscriptionType subscriptionType;
	
	private JLabel please, cardNumberLabel, cardNameLabel, cardLastNameLabel, cardExpireDateLabel, cardSecurityLabel;
	private JTextField cardNumberField, cardNameField, cardLastNameField, cardExpireDayField, cardExpireMonthField, cardSecurityField;
	private JButton confirm;
	
	
	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getCardOwnersName() {
		return cardOwnersName;
	}

	public void setCardOwnersName(String cardOwnersName) {
		this.cardOwnersName = cardOwnersName;
	}

	public String getCardOwnersLastName() {
		return cardOwnersLastName;
	}

	public void setCardOwnersLastName(String cardOwnersLastName) {
		this.cardOwnersLastName = cardOwnersLastName;
	}

	public int getCardExpireDay() {
		return cardExpireDay;
	}

	public void setCardExpireDay(int cardExpireDay) {
		this.cardExpireDay = cardExpireDay;
	}

	public int getCardExpireMonth() {
		return cardExpireMonth;
	}

	public void setCardExpireMonth(int cardExpireMonth) {
		this.cardExpireMonth = cardExpireMonth;
	}

	public int getSecurityNumber() {
		return securityNumber;
	}

	public void setSecurityNumber(int securityNumber) {
		this.securityNumber = securityNumber;
	}

	public Payment(SubscriptionType subscriptionType) {
		please = new JLabel("Please enter your credit card information:");
		cardNumberLabel = new JLabel("Card number:");
		cardNumberField = new JTextField(16);
		cardNameLabel = new JLabel("Card owner's first name:");
		cardNameField = new JTextField(10);
		cardLastNameLabel = new JLabel("Card owner's last name:");
		cardLastNameField = new JTextField(10);
		cardExpireDateLabel = new JLabel("Card expires at:");
		cardExpireDayField = new JTextField(2);
		cardExpireMonthField = new JTextField(2);
		cardSecurityLabel = new JLabel("Security number:");
		cardSecurityField = new JTextField(3);
		confirm = new JButton("Confirm");
		this.subscriptionType = subscriptionType;
		
		Container payment_c = getContentPane();
		payment_c.setLayout(new FlowLayout());
		Color co = new Color(143, 208, 255);
		payment_c.setBackground(co);
		
		payment_c.add(please);
		payment_c.add(cardNumberLabel);
		payment_c.add(cardNumberField);
		payment_c.add(cardNameLabel);
		payment_c.add(cardNameField);
		payment_c.add(cardLastNameLabel);
		payment_c.add(cardLastNameField);
		payment_c.add(cardExpireDateLabel);
		payment_c.add(cardExpireDayField);
		payment_c.add(cardExpireMonthField);
		payment_c.add(cardSecurityLabel);
		payment_c.add(cardSecurityField);
		payment_c.add(confirm);
		
		confirm.addActionListener(this);
		
	}
	
	/*
	 //main method to be able to run the GUI on its own
	public static void main(String[] args) {
		
		Payment pay_gui = new Payment();
		
		pay_gui.setTitle("Begumflix - Payment");
		pay_gui.setSize(350, 400);
		pay_gui.setVisible(true);
		pay_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	*/
	
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == confirm) {
			//creditCardNumber = Integer.parseInt(cardNumberField.getText());
			creditCardNumberLength = cardNumberField.getText().length();
			//securityNumber = Integer.parseInt(cardSecurityField.getText());
			int securityNumberLength = cardSecurityField.getText().length();
			
			if(creditCardNumberLength < 16) {
				JOptionPane.showMessageDialog(null, "Invalid credit card number", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			else if(creditCardNumberLength == 16 && securityNumberLength == 3) {
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to subscribe?");
				//0 = yes, 1 = no, 2 = cancel
				if(result == 1 || result == 2) {
					this.dispose();
					
					AppGUI gui = new AppGUI();
					
					gui.setTitle("Begumflix");
					gui.setSize(400, 400);
					gui.setVisible(true);
					gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
				else if(result == 0) {
					this.dispose();
					Subscription newSub = new Subscription();
					Begumflix.addSubscription(newSub);
					new VideoGUI(subscriptionType);
				}
			}
			
		}
	}

}
