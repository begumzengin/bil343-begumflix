package bil343_hw;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StandardSub extends JFrame implements ActionListener{
	
	private JLabel title, line1, line2;
	private JButton buyStandard;
	
	public StandardSub() {
		title = new JLabel("Standard Subscription");
		title.setFont(new Font("Verdana", Font.PLAIN, 18));
		line1 = new JLabel("■ Standard subscription is 29.99$ a month");
		line2 = new JLabel("■ HD (720p60) view is supported with Standard Subscription");
		buyStandard = new JButton("Buy Standard Subscription");
		
		Container standard_c = getContentPane();
		standard_c.setLayout(new FlowLayout());
		Color co = new Color(143, 208, 255);
		standard_c.setBackground(co);
		
		standard_c.add(title);
		standard_c.add(line1);
		standard_c.add(line2);
		standard_c.add(buyStandard);
		
		buyStandard.addActionListener(this);

	}
	
	/*
	 * //main method to be able to run the GUI on its own
	public static void main(String[] args) {
		
		StandardSub standard_gui = new StandardSub();
		
		standard_gui.setTitle("Begumflix - Standard Subscription");
		standard_gui.setSize(400, 400);
		standard_gui.setVisible(true);
		standard_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	*/
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == buyStandard) {
			
			this.dispose();
			
			//payment GUI for standard subscription is called
			Payment pay_gui = new Payment(SubscriptionType.STANDARD);
			
			pay_gui.setTitle("Begumflix - Payment");
			pay_gui.setSize(350, 400);
			pay_gui.setVisible(true);
			pay_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
		}
	}
}


