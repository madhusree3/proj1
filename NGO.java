package Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NGO {

NGO(){
		JFrame f= new JFrame("NGO");
		 f.setSize(1000,1000);
		 JButton jb = new JButton("Accept");
		 JButton jb1 = new JButton("About_employ");
		 JButton jb2 = new JButton("About_restaurant");
		 jb.setBounds(150,140,200,50);
		 jb1.setBounds(150,220,200,50);
		 jb2.setBounds(150,290,200,50);
		 f.add(jb);
		 f.add(jb1);
		 f.add(jb2);
		 f.setLayout(null);
		 f.getContentPane().setBackground(Color.white);
		 f.setVisible(true);
	
		  f.setLayout(new BorderLayout());
		    
		     
		    JLabel background=new JLabel(new ImageIcon("C:\\Users\\LENOVO\\Pictures\\ngo.png"));
		    background.setSize(1000,1000);
		    f.add(background);
		    background.setLayout(new FlowLayout());
	
jb.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new Accept();
		
	}
	
});
jb1.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
	new About_employ();
	  

	}	
});
jb2.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
	new About_restaurant();
	  

	}	
});

}
public static void main(String args[]) {
	   new NGO();
}

	

}
