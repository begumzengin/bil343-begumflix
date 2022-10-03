package bil343_hw;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BasicSub extends JFrame implements ActionListener{
	private JLabel title, line1, line2, line3;
	private JButton buyBasic;
	
	public BasicSub() {
		title = new JLabel("Basic Subscription");
		title.setFont(new Font("Verdana", Font.PLAIN, 18));
		line1 = new JLabel("■ Basic subscription is 19.99$ a month");
		line2 = new JLabel("■ HD (720p60) or Ultra HD (1080p) view");
		line3 = new JLabel("is not supported with Basic Subscription");
		buyBasic = new JButton("Buy Basic Subscription");
		
		Container basic_c = getContentPane();
		basic_c.setLayout(new FlowLayout());
		Color co = new Color(143, 208, 255);
		basic_c.setBackground(co);
		
		basic_c.add(title);
		basic_c.add(line1);
		basic_c.add(line2);
		basic_c.add(line3);
		basic_c.add(buyBasic);
		
		buyBasic.addActionListener(this);
		
	}
	
	/*
	 * //main method to be able to run the GUI on its own
	public static void main(String[] args) {
		
		BasicSub basic_gui = new BasicSub();
		
		basic_gui.setTitle("Begumflix - Basic Subscription");
		basic_gui.setSize(400, 400);
		basic_gui.setVisible(true);
		basic_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	*/
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == buyBasic) {
			this.dispose();
			
			Payment pay_gui = new Payment(SubscriptionType.BASIC);
			
			pay_gui.setTitle("Begumflix - Payment");
			pay_gui.setSize(350, 400);
			pay_gui.setVisible(true);
			pay_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
		}
	}
}
