package Project;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;


class About_restaurant{
	About_restaurant(){
		JFrame f = new JFrame();
			  	    
	  	    try {
    	    	Class.forName("com.mysql.cj.jdbc.Driver");  
    		     Connection conn=DriverManager.getConnection(  
    		     "jdbc:mysql://localhost:3306/dbms","root","admin@123");
    		     Statement st = conn.createStatement();
    		     ResultSet rs = st.executeQuery("select * from details");
    		     while(rs.next()) {
    		    	 System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getString(6));  
    		    	 }

    		     
    		     
    		     
    		     
	  	    }
	  	  catch(Exception e) {System.out.println(e);}
	  	   
	  		
	    		}
	  
	public static void main(String args[]) {
		new About_restaurant();
	}
	 
}
