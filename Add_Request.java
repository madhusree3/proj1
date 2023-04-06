package Project;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.cj.protocol.Resultset;

public class Add_Request implements ActionListener  {
	JButton jb;
	JLabel l1,l2;
	 private  JTextField tf1,name3,x;
	 boolean l;
	Add_Request(){
		 boolean k;
	  JFrame f= new JFrame("Add_Request");
	    f.setSize(1000,1000);
	    JLabel l1=new JLabel("Food name");
	    l1.setForeground(Color.white);
	    JLabel l2=new JLabel("Food quantity");
	    l2.setForeground(Color.white);
	    JLabel l3=new JLabel("Restaurant name");
	    l3.setForeground(Color.white);
	    l1.setBounds(60,30,100,60);
	    l2.setBounds(60,90,100,60);
	    l3.setBounds(60,150,100,60);
	    tf1= new JTextField();
	    name3= new JTextField();
	    x=new JTextField();
	    tf1.setBounds(160,40,150,30);
	    name3.setBounds(160,100,150,30);
	    x.setBounds(160,160,150,30);
	    JButton jb = new JButton("Done");
	    jb.setBounds(160,220,100,30);
	    jb.addActionListener(new ActionListener() {

	    
	  
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
	    	Class.forName("com.mysql.cj.jdbc.Driver");  
		     Connection conn=DriverManager.getConnection(  
		     "jdbc:mysql://localhost:3306/dbms","root","admin@123");
	//if(Objects.isNull(tf1)) System.out.println("error");
			
			int str1 =Integer.parseInt(name3.getText());
			PreparedStatement st = conn.prepareStatement("insert into add_request values(?,?,?)");
			st.setString(1, tf1.getText());
			st.setInt(2, str1);
			st.setString(3,x.getText());
		     int i =st.executeUpdate();
			if(i==1)
			System.out.println("succesfully added");
			
						new Accept();
						Object[] name= {x.getText()};
						 JOptionPane.showMessageDialog(null,name,"food available",JOptionPane.DEFAULT_OPTION);
					}
			 
			 
					
				
		
			catch(Exception e1) {
				System.out.println(e1);
			}
			}
		
		});
			  f.add(l1);
			    f.add(tf1);
			    f.add(l2);
			    f.add(name3);
			    f.add(l3);
			    f.add(x);
			    f.add(jb);
			    f.setLayout(null);
			    f.setVisible(true);
			    f.setLayout(new BorderLayout());
			    
			     
			    JLabel background=new JLabel(new ImageIcon("C:\\Users\\LENOVO\\Pictures\\foood.png"));
			    background.setSize(1000,1000);
			    f.add(background);
			    background.setLayout(new FlowLayout());
			}
		
		    
		 

		public static void main(String[] args) {
			new Add_Request();	   
			}




		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}





	}

	