package bil343_hw;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VideoGUI extends JFrame implements ActionListener{
	
	private JButton watch;
	private JList genreList, qualityList;
	private JLabel label;
	private SubscriptionType subscriptionType;
	
	private DefaultListModel<String> generateGenresForSubscriptionType(SubscriptionType subscriptionType){
		
		final DefaultListModel<String> genres = new DefaultListModel<>();  
		//free subscribers can only watch comedy movies
		if(subscriptionType.FREE.equals(subscriptionType)) { 
	        genres.addElement("Comedy");   
		} 
		else if(subscriptionType.BASIC.equals(subscriptionType)) {
			//basic subscribers are able to choose movies from 2 different genres
	        genres.addElement("Romance");  
	        genres.addElement("Comedy");   
	    }
		else if(subscriptionType.STANDARD.equals(subscriptionType)) { 
			//standard subscribers are able to choose movies from 3 different genres
		        genres.addElement("Romance");  
		        genres.addElement("Comedy");  
		        genres.addElement("Horror"); 
		}
		else if(subscriptionType.PREMIUM.equals(subscriptionType)) {
			//premium subscribers are able to choose movies from 4 different genres
			genres.addElement("Drama");
			genres.addElement("Romance");  
	        genres.addElement("Comedy");  
	        genres.addElement("Horror"); 
		}
		return genres;
	}
	
	private DefaultListModel<String> generateQualityForSubscriptionType(SubscriptionType subscriptionType){
		final DefaultListModel<String> quality = new DefaultListModel<>(); 
		
		if(subscriptionType.FREE.equals(subscriptionType)) { 
			//free subscribers can watch movies in 360p quality
	        quality.addElement("360p");    
		} 
		else if(subscriptionType.BASIC.equals(subscriptionType)) {  
			//basic subscribers can choose from 2 different quality types
	        quality.addElement("480p");  
	        quality.addElement("360p"); 
	   }
		else if(subscriptionType.STANDARD.equals(subscriptionType)) { 
			//standard subscribers can choose from 2 different quality types
			    quality.addElement("720p60");  
		        quality.addElement("480p");  
		        quality.addElement("360p"); 
		}
		else if(subscriptionType.PREMIUM.equals(subscriptionType)) {
			//premium subscribers can choose from 2 different quality types
			quality.addElement("1080p60");  
	        quality.addElement("720p60");  
	        quality.addElement("480p");  
	        quality.addElement("360p");  
		}
       return quality;
	}
	
	
	public VideoGUI(SubscriptionType subscriptionType) {
		  	
			this.subscriptionType = subscriptionType;
	        JFrame f = new JFrame();  
	        final JLabel label = new JLabel();          
	        label.setSize(500,100);  
	        JButton watchButton =new JButton("Watch");  
	        watchButton.setBounds(200,150,80,30);  
	        
	    
	          final JList<String> genreList = new JList<>(generateGenresForSubscriptionType(subscriptionType));  
	          genreList.setBounds(100,100, 75,75);  
	            
	          final JList<String> qualityList = new JList<>(generateQualityForSubscriptionType(subscriptionType));  
	          qualityList.setBounds(100,200, 75,75); 
	          
	          f.add(genreList); 
	          f.add(qualityList); 
	          f.add(watchButton); 
	          f.add(label);  
	          
	          //Color co = new Color(143, 208, 255);
	          //f.setBackground(co);
	          f.setSize(450,450);  
	          f.setLayout(null);
	          f.setVisible(true);
	          
	          watchButton.addActionListener(new ActionListener() {  
				public void actionPerformed(ActionEvent e) {   
	                 String data = "";  
	                 if (genreList.getSelectedIndex() != -1) {         
	                    data = "You are now viewing " + genreList.getSelectedValue();   
	                    label.setText(data);  
	                    
	                 }  
	                 if(qualityList.getSelectedIndex() != -1){  
	                    data += " in ";  
	                    for(Object frame :qualityList.getSelectedValuesList()){  
	                       data += frame + " ";  
	                    }  
	                 }  
	                 label.setText(data);  
	              }  
	           });   
 		
	}
	
	public void actionPerformed(ActionEvent ae) {
		SignUpPage userData = new SignUpPage();
		
		if(ae.getSource() == watch) {
			//if the user is underage, they will not be allowed to watch some movies
			if(userData.getAge() < 18) {
				 String data = "";  
                 if (genreList.getSelectedIndex() != -1) {                       
                    data = "Genre Selected: " + genreList.getSelectedValue();   
                    label.setText(data);  
                 }  
                 if(qualityList.getSelectedIndex() != -1){  
                    data += ", FrameWork Selected: " + qualityList.getSelectedValue();    
                 }  
			}
		}
	}
	
}
