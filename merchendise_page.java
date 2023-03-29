package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class merchendise {

	private JFrame frame;
	private JTextField lb;
	private JTextField txtMrp;
	private JTextField txtMrp_1;
	int i=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					merchendise window = new merchendise();
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
	public merchendise() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.setBackground(new Color(255, 128, 128));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 572, 529);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MERCH");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 25));
		lblNewLabel.setBounds(229, 25, 99, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\Saved Pictures\\one peice\\ab7883499fee1cf5c5e0dabda1d57dc7[1] (2).jpg"));
		lblNewLabel_3.setBounds(22, 67, 255, 286);
		frame.getContentPane().add(lblNewLabel_3);
		
		lb = new JTextField();
		lb.setText("CART :");
		lb.setBounds(410, 36, 86, 20);
		frame.getContentPane().add(lb);
		lb.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\Saved Pictures\\one peice\\R[2] (4).jpg"));
		lblNewLabel_1.setBounds(291, 67, 255, 286);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtMrp = new JTextField();
		txtMrp.setText("MRP : 999");
		txtMrp.setBounds(83, 364, 86, 20);
		frame.getContentPane().add(txtMrp);
		txtMrp.setColumns(10);
		
		txtMrp_1 = new JTextField();
		txtMrp_1.setText("MRP : 999");
		txtMrp_1.setBounds(376, 364, 86, 20);
		frame.getContentPane().add(txtMrp_1);
		txtMrp_1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"gf", "wifu", "senpai"}));
		c1.setBounds(93, 399, 64, 22);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"gf", "wifu", "senpai"}));
		c2.setBounds(386, 399, 64, 22);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("ADD TO CART");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("cart :"+i);
				String type=(String) c1.getSelectedItem();
				if(type=="gf")
				{
					JOptionPane.showMessageDialog(btnNewButton, "cost: 99 type:"+type);
				}
				else if(type=="wifu")
				{
					JOptionPane.showMessageDialog(btnNewButton, "cost: 999 type:"+type);
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "cost: 121 type:"+type);

				}
				
			}
		});
		btnNewButton.setBounds(80, 432, 112, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADD TO CART");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("cart :"+i);
				String type=(String) c2.getSelectedItem();
				if(type=="gf")
				{
					JOptionPane.showMessageDialog(btnNewButton, "cost: 99 type:"+type);
				}
				else if(type=="wifu")
				{
					JOptionPane.showMessageDialog(btnNewButton, "cost: 999 type:"+type);
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "cost: 121 type:"+type);

				}
			}
		});
		btnNewButton_1.setBounds(366, 432, 112, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
