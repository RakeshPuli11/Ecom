package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class login {

	JFrame frame;
	private JTextField U1;
	protected Object lframe;
	private JPasswordField P1;
	JLabel lb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lpframe = new JLabel("LOGIN PAGE");
		lpframe.setFont(new Font("Tahoma", Font.BOLD, 15));
		lpframe.setBounds(159, 24, 96, 25);
		frame.getContentPane().add(lpframe);
		
		JLabel lblNewLabel_1 = new JLabel("USER NAME");
		lblNewLabel_1.setBounds(59, 75, 86, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1.setBounds(59, 114, 86, 25);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		U1 = new JTextField();
		U1.setBounds(169, 77, 86, 20);
		frame.getContentPane().add(U1);
		U1.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un=U1.getText();
				String ps=P1.getText();
				
				if(un.equals("rakesh") && ps.equals("stoic"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "login done!");
						
					try {// connecting mysql
						
						
						
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/log","root","mrec");
						String q="Insert into login values('"+un+"','"+ps+"')";
						Statement sta=con.createStatement();
						sta.executeUpdate(q);
						con.close();
						
						
						// done
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "invalid credentials");

				}
				
			}
		});
		btnNewButton.setBounds(166, 174, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		P1 = new JPasswordField();
		P1.setBounds(169, 116, 86, 20);
		frame.getContentPane().add(P1);
		
		lb1 = new JLabel("");
		lb1.setBounds(169, 52, 86, 14);
		frame.getContentPane().add(lb1);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
