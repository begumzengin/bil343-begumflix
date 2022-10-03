package bil343_hw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PremiumSub extends JFrame implements ActionListener {
	
	private JLabel title, line1, line2;
	private JButton buyPremium;
	
	public PremiumSub() {
		title = new JLabel("Premium Subscription");
		title.setFont(new Font("Verdana", Font.PLAIN, 18));
		line1 = new JLabel("■ Premium subscription is 39.99$ a month");
		line2 = new JLabel("■ Ultra HD (1080p) view is supported");
		buyPremium = new JButton("Buy Premium Subscription");
		
		Container premium_c = getContentPane();
		premium_c.setLayout(new FlowLayout());
		Color co = new Color(143, 208, 255);
		premium_c.setBackground(co);
		
		premium_c.add(title);
		premium_c.add(line1);
		premium_c.add(line2);
		premium_c.add(buyPremium);
		
		buyPremium.addActionListener(this);

	}
	/*
	 * //main method to be able to run the GUI on its own
	public static void main(String[] args) {
		
		PremiumSub premium_gui = new PremiumSub();
		
		premium_gui.setTitle("Begumflix - Premium Subscription");
		premium_gui.setSize(400, 400);
		premium_gui.setVisible(true);
		premium_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	*/
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == buyPremium) {
			
			//this line closes the window that was opened before
			this.dispose();
			
			//payment GUI for premium subscription is called
			Payment pay_gui = new Payment(SubscriptionType.PREMIUM);
			
			pay_gui.setTitle("Begumflix - Payment");
			pay_gui.setSize(350, 400);
			pay_gui.setVisible(true);
			pay_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
		}
	}
}
