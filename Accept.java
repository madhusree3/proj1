package Project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Accept implements ActionListener {
    Accept(){
    	  JFrame f= new JFrame("Accept");
		    f.setSize(500,500);
		    f.setLayout(null);
		    JButton jb = new JButton("ok");
		    jb.setBounds(160,170,100,30);
		    jb.addActionListener(this);
		    f.add(jb);
		    f.getContentPane().setBackground(Color.white);
		    f.setVisible(true);
		    try {
		    	Class.forName("com.mysql.cj.jdbc.Driver");  
			     Connection conn=DriverManager.getConnection(  
			     "jdbc:mysql://localhost:3306/dbms","root","admin@123");
			     Statement st = conn.createStatement();
			     ResultSet rs = st.executeQuery("select * from add_request");
			     while(rs.next()) {
			    	 System.out.println(rs.getString(1)+"  "+rs.getInt(2)+" "+rs.getString(3));  
			    	 }

			     
			     
			     
			     
	  	    }
	  	  catch(Exception e) {System.out.println(e);}
	  	   
	  		
	    		}
	  
	@Override
	public void actionPerformed(ActionEvent e) {
		
		 new Accept_request();
	
		
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 new Accept();
	}

}
