package Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import javax.swing.*;
public class Register{
	
	Connection conn;
	String k;
	Register(){
	JFrame f=new JFrame("Register");
	  f.setSize(1000,1000);
	  JLabel l1=new JLabel("Restaurant_Name");
	  JLabel l2=new JLabel("Location");
	  JLabel l3=new JLabel("Email");
	  JLabel l4=new JLabel("phone");
	  JLabel l5=new JLabel("Username");
      JLabel l6=new JLabel("Password");
      JTextField t1= new JTextField();
      Object[] loc= {"Vizag","Madhurawada","Anakapalli","Vizianagaram"};
      JComboBox c1=new JComboBox(loc);
      JTextField t2=new JTextField();
      JTextField t3= new JTextField();
      JTextField t4= new JTextField();
      JPasswordField psw=new JPasswordField();
      JButton jb = new JButton("SUBMIT");
      l1.setBounds(420,30,150,60);
      l1.setForeground(Color.black);
      t1.setBounds(550,40,150,30);
      l2.setBounds(420,90,100,60);
      l2.setForeground(Color.black);
      c1.setBounds(550,100,150,30);
      c1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
    	k=c1.getSelectedItem().toString();  
      }
      });
      l3.setBounds(420,150,100,60);
      l3.setForeground(Color.black);
      t2.setBounds(550,160,150,30);
      l4.setBounds(420,210,100,60);
      l4.setForeground(Color.black);
      t3.setBounds(550,220,150,30);
      l5.setBounds(420,260,100,60);
      l5.setForeground(Color.black);
      t4.setBounds(550,280,150,30);
      l6.setBounds(420,320,100,60);
      l6.setForeground(Color.black);
      psw.setBounds(550,340,150,30);
      jb.setBounds(600,370,100,50);
 	   
     f.add(l1);
     f.add(t1);
     f.add(l2);
     f.add(c1);
     f.add(l3);
     f.add(t2);
     f.add(l4);
     f.add(t3);
     f.add(l5);
     f.add(t4);
     f.add(l6);
     f.add(psw);
     f.add(jb);
     f.setLayout(null);
     f.setVisible(true);
	  
	   
	    

	  
      f.setLayout(new BorderLayout());
      
      
      JLabel background=new JLabel(new ImageIcon("C:\\Users\\LENOVO\\Pictures\\handshelp.png"));
      background.setSize(1500,1500);
      f.add(background);
      background.setLayout(new FlowLayout());
   
      jb.addActionListener(new ActionListener() {

    	    @Override
    	    public void actionPerformed(ActionEvent a) {

    	    try {
    	    	Class.forName("com.mysql.cj.jdbc.Driver");  
    		     Connection conn=DriverManager.getConnection(  
    		     "jdbc:mysql://localhost:3306/dbms","root","admin@123");
    		     String ins ="insert into details values(?,?,?,?,?,?)";
    		     PreparedStatement st = conn.prepareStatement(ins);
    		     
    	       st.setString(1,t1.getText());
    	       st.setString(2, k);
    	       st.setString(3, t2.getText());
    	       st.setString(4, t3.getText());
    	       st.setString(5, t4.getText());
    	       st.setString(6, psw.getText());
    	      
    	    int i=   st.executeUpdate();
    	 if(i==1) {
    		 System.out.println("Successfull...!");
    		 
    	 }
    	 else {
    		 System.out.println("not successfull!");
    	 }
    	       conn.close();
    	    }
    	   
    	    
    	    catch(Exception e) {System.out.println(e);}
    	   
    		}
    
  
    	   });
  

	
}
    
	
	public static void main(String[] args) {
		new Register();
	}
}
