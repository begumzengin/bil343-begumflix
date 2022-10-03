package bil343_hw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FreeSub extends JFrame implements ActionListener{
	
	private JLabel title, line1, line2, line3, line4, line5;
	private JButton buyFree;
	private SubscriptionType subscriptionType;
	
	public FreeSub() {
		title = new JLabel("Free Trial");
		title.setFont(new Font("Verdana", Font.PLAIN, 20));
		line1 = new JLabel("Free trial provides access to:");
		line2 = new JLabel("■ limited genre of movies and TV shows");
		line3 = new JLabel("■  is available for 30 days");
		line4 = new JLabel("■ HD (720p60) or Ultra HD (1080p) view");
		line5 = new JLabel("is not supported");
		buyFree = new JButton("Start Free Trial");
		
		Container free_c = getContentPane();
		free_c.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		Color co = new Color(143, 208, 255);
		free_c.setBackground(co);
		
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		line1.setAlignmentX(Component.CENTER_ALIGNMENT);
		line2.setAlignmentX(Component.CENTER_ALIGNMENT);
		line3.setAlignmentX(Component.CENTER_ALIGNMENT);
		line4.setAlignmentX(Component.CENTER_ALIGNMENT);
		line5.setAlignmentX(Component.CENTER_ALIGNMENT);
		buyFree.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		free_c.add(title);
		free_c.add(line1);
		free_c.add(line2);
		free_c.add(line3);
		free_c.add(line4);
		free_c.add(line5);
		free_c.add(buyFree);
		
		buyFree.addActionListener(this);
		
	}
	
	/*
	 * //main method to be able to run the GUI on its own
	public static void main(String[] args) {
		
		FreeSub free_sub = new FreeSub();
		
		free_sub.setTitle("Begumflix - Free Subscription");
		free_sub.setSize(400, 400);
		free_sub.setVisible(true);
		free_sub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	*/
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == buyFree) {
			this.dispose();
			
			//video GUI for free subscription is called
			new VideoGUI(SubscriptionType.FREE);
			
			
		}
	}

}
