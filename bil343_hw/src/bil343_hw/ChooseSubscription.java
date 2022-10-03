package bil343_hw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChooseSubscription extends JFrame implements ActionListener{
	
	private JButton basicSub, standardSub, premiumSub, free_account;
	private JLabel choose_subs;
	
	public ChooseSubscription() {
		
		basicSub = new JButton("Basic Subscription");
		standardSub = new JButton("Standard Subscription");
		premiumSub = new JButton("Premium Subscription");
		free_account = new JButton("Free trial");
		choose_subs = new JLabel("Please pick a subscription type:");
		
		Container subscription_c = getContentPane();
		subscription_c.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		Color co = new Color(143, 208, 255);
		subscription_c.setBackground(co);
		
		
		subscription_c.add(choose_subs);
		subscription_c.add(basicSub);
		subscription_c.add(standardSub);
		subscription_c.add(premiumSub);
		subscription_c.add(free_account);
		
		choose_subs.setAlignmentX(Component.CENTER_ALIGNMENT);
		basicSub.setAlignmentX(Component.RIGHT_ALIGNMENT);
		standardSub.setAlignmentX(Component.LEFT_ALIGNMENT);
		premiumSub.setAlignmentX(Component.RIGHT_ALIGNMENT);
		free_account.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		basicSub.addActionListener(this);
		standardSub.addActionListener(this);
		premiumSub.addActionListener(this);
		free_account.addActionListener(this);
	}
	
	public static void main(String[] args) {
		
		ChooseSubscription subs_gui = new ChooseSubscription();
		
		subs_gui.setTitle("Begumflix - Choose Subscription");
		subs_gui.setSize(400, 400);
		subs_gui.setVisible(true);
		subs_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		//the information page for basic subscription is called if the user presses the basic subscription button
		if(ae.getSource() == basicSub) {
			this.dispose();
			
			BasicSub basic_gui = new BasicSub();
			
			basic_gui.setTitle("Begumflix - Basic Subscription");
			basic_gui.setSize(400, 400);
			basic_gui.setVisible(true);
			basic_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
		}
		//the information page for standard subscription is called if the user presses the standard subscription button
		else if(ae.getSource() == standardSub) {
			this.dispose();
			
			StandardSub standard_gui = new StandardSub();
			
			standard_gui.setTitle("Begumflix - Standard Subscription");
			standard_gui.setSize(400, 400);
			standard_gui.setVisible(true);
			standard_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		//the information page for premium subscription is called if the user presses the premium subscription button
		else if(ae.getSource() == premiumSub) {
			this.dispose();
			
			PremiumSub premium_gui = new PremiumSub();
			
			premium_gui.setTitle("Begumflix - Premium Subscription");
			premium_gui.setSize(400, 400);
			premium_gui.setVisible(true);
			premium_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else {
			this.dispose();
			
			//the user is able to proceed directly to the viewing screen if they press the free trial button
			FreeSub free_sub = new FreeSub();
			
			free_sub.setTitle("Begumflix - Free Subscription");
			free_sub.setSize(400, 400);
			free_sub.setVisible(true);
			free_sub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
		
	
}
