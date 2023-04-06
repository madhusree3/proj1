package Project;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
public class Frame implements ActionListener{
public Frame(){
	JFrame f = new JFrame("FOOD MANAGEMENT SYSTEM");
	JButton b = new JButton("Login");
b.setBounds(30,30,40,20);
JButton b1 = new JButton("NGO");
b1.setBounds(30,30,40,20);
JButton b2 = new JButton("REGISTER");
b2.setBounds(30,30,40,20);
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();

	f.setVisible(true);
	 f.setLayout(new BorderLayout());
	    JLabel background=new JLabel(new ImageIcon("C:\\Users\\LENOVO\\Pictures\\handsframe1.png"));
	    background.setSize(980,820);
	    f.add(background);
	    background.setLayout(new FlowLayout());
		JTabbedPane tp = new JTabbedPane(JTabbedPane.TOP,JTabbedPane.WRAP_TAB_LAYOUT);
		tp.addTab("Home",p1);
		
		tp.addTab("Login",p2);
		p2.add(b);
		tp.addTab("REGISTER",p3);
		p3.add(b2);
		tp.addTab("NGO",p4);
		p4.add(b1);
		f.add(tp);
		f.setSize(1000,1000);
		tp.setBounds(0,0,1000,1000);
	  
	b.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new Login();
		}
		
	});



b1.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new NGO();
	}
});

b2.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new Register();
	}
});

}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame();

	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}


	
