package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class regpg {

	private JFrame rframe;
	private JTextField UF;
	private JTextField textField_2;
	private JPasswordField PF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regpg window = new regpg();
					window.rframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public regpg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		rframe = new JFrame();
		rframe.getContentPane().setBackground(new Color(192, 192, 192));
		rframe.setBounds(100, 100, 450, 300);
		rframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION PAGE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(121, 11, 177, 33);
		rframe.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("USER NAME");
		lblName.setBounds(42, 62, 79, 21);
		rframe.getContentPane().add(lblName);
		
		JLabel lblEmail = new JLabel("PASSWORD");
		lblEmail.setBounds(42, 94, 79, 21);
		rframe.getContentPane().add(lblEmail);
		
		JLabel lblPhoneNo = new JLabel("PHONE NO.");
		lblPhoneNo.setBounds(42, 126, 63, 21);
		rframe.getContentPane().add(lblPhoneNo);
		
		UF = new JTextField();
		UF.setBounds(162, 62, 86, 20);
		rframe.getContentPane().add(UF);
		UF.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(162, 126, 86, 20);
		rframe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name =UF.getText();
				JOptionPane.showMessageDialog(btnNewButton, "Registration Done! "+name);
				String P =PF.getText();
				String name1 =UF.getText();
				login l=new login();
				l.frame.setVisible(true);
				l.lb1.setText(name1 +"  plz login!");
				rframe.dispose();
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 13));
		btnNewButton.setBounds(159, 175, 89, 23);
		rframe.getContentPane().add(btnNewButton);
		
		PF = new JPasswordField();
		PF.setBounds(162, 94, 86, 20);
		rframe.getContentPane().add(PF);
	}
}
