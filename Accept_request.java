package Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Accept_request implements ActionListener {

	
		static boolean k;
		JButton jb;
		Accept_request(){
		  JFrame f= new JFrame("Accept_Request");
		    f.setSize(1000,1000);
		    JButton jb = new JButton("ACCEPT");
		    jb.setBounds(160,170,100,30);
		    jb.addActionListener(this);
		    f.add(jb);
		 	
		
		   f.setLayout(null);
		    f.setVisible(true);
			  f.setLayout(new BorderLayout());
			    
			     
			    JLabel background=new JLabel(new ImageIcon("C:\\Users\\LENOVO\\Pictures\\foood.png"));
			    background.setSize(1000,1000);
			    f.add(background);
			    background.setLayout(new FlowLayout());
			 

		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			 new Add_Request();
			 JOptionPane.showMessageDialog(null,"ACCEPTED");
			
			
		}
		public static void main(String args[]) {
			new Accept_request();
		
		}
	
	}
  
