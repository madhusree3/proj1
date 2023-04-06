package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class About_employ {
	
	
	About_employ(){
	    try {
	    	Class.forName("com.mysql.cj.jdbc.Driver");  
		     Connection conn=DriverManager.getConnection(  
		     "jdbc:mysql://localhost:3306/dbms","root","admin@123");
		     Statement st = conn.createStatement();
		     ResultSet rs = st.executeQuery("select * from employ");
		     while(rs.next()) {
		    	 System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));  
		    	 }

		     
		     
		     
		     
  	    }
  	  catch(Exception e) {System.out.println(e);}
  	   
  		
    		}
  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new About_employ();
		 
		    
	}

}
