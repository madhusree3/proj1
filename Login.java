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
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;  
public class Login {
      Login(){	     
      JFrame f= new JFrame("LOGIN");  
      f.setSize(1000,1000);
     JLabel l1=new JLabel("Username");
     JLabel l2=new JLabel("Password");
     JTextField name= new JTextField();
     l1.setForeground(Color.white);
     l2.setForeground(Color.white);
     JPasswordField psw = new JPasswordField();
     JButton jb = new JButton("SUBMIT");
     l1.setBounds(600,30,100,50);
    name.setBounds(700,40,150,30);
    l2.setBounds(600,90,100,50);
    psw.setBounds(700,100,150,30);
    jb.setBounds(660,170,100,50);
    f.add(l1);
    f.add(name);
    f.add(l2);
    f.add(psw);
    f.add(jb);
    f.setLayout(null);
    f.setVisible(true);
    f.setLayout(new BorderLayout());
    
     
    JLabel background=new JLabel(new ImageIcon("C:\\Users\\LENOVO\\Pictures\\helphands1.png"));
    background.setSize(1000,1000);
    f.add(background);
    background.setLayout(new FlowLayout());
  
 
   jb.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent a) {

    try {
    	
    	 Class.forName("com.mysql.cj.jdbc.Driver");  
	     Connection conn=DriverManager.getConnection(  
	     "jdbc:mysql://localhost:3306/dbms","root","admin@123");
	     String ins ="select username,password from  details where username=? and password=?";
	     PreparedStatement st = conn.prepareStatement(ins);
	     
         st.setString(1,name. getText());
         st.setString(2, psw.getText());
         ResultSet rs =st.executeQuery();
      
      if(rs.next()) {
       JOptionPane.showMessageDialog(jb,"Login successfull...!");
       new Add_Request();
      }
       else {
       JOptionPane.showMessageDialog(jb,"Invalid username or password");
       conn.close();
    }
    }
    catch(Exception e) {System.out.println(e);}
   
	}
   });
   }
   public static void main(String args[]) {
   new Login();
   }
}