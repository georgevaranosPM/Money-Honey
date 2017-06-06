import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterGUI extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	User newUser;
	public RegisterGUI() {
		
		JPanel panel = new JPanel();
		this.setSize(540,400);
		panel.setBackground(new Color(75, 75, 100));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblRegister.setForeground(new Color(230, 255, 255));
		lblRegister.setBounds(6, 6, 79, 19);
		panel.add(lblRegister);
		
		JLabel profile_Label = new JLabel("Profile");
		profile_Label.setBounds(215, 8, 61, 16);
		profile_Label.setForeground(new Color(230, 255, 255));
		panel.add(profile_Label);
		
		JLabel username_Label = new JLabel("Username");
		username_Label.setBounds(94, 40, 99, 16);
		username_Label.setForeground(new Color(230, 255, 255));
		panel.add(username_Label);
		
		JLabel password_Label = new JLabel("Password");
		password_Label.setBounds(94, 68, 59, 16);
		password_Label.setForeground(new Color(230, 255, 255));
		panel.add(password_Label);
		
		textField = new JTextField();
		textField.setBounds(215, 35, 130, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(215, 63, 130, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel user_Label = new JLabel("User");
		user_Label.setBounds(212, 101, 61, 16);
		user_Label.setForeground(new Color(230, 255, 255));
		panel.add(user_Label);
		
		JLabel name_Label = new JLabel("Full Name");
		name_Label.setBounds(94, 134, 110, 16);
		name_Label.setForeground(new Color(230, 255, 255));
		panel.add(name_Label);
		
		JLabel date_Label = new JLabel("Birthday");
		date_Label.setBounds(94, 159, 85, 16);
		date_Label.setForeground(new Color(230, 255, 255));
		panel.add(date_Label);
		
		textField_3 = new JTextField();
		textField_3.setBounds(212, 129, 130, 26);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(212, 154, 130, 26);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel estates_Label = new JLabel("Estates");
		estates_Label.setBounds(94, 228, 56, 16);
		estates_Label.setForeground(new Color(230, 255, 255));
		panel.add(estates_Label);
		
		JLabel vehicles_Label = new JLabel("Vehicles");
		vehicles_Label.setBounds(94, 256, 62, 16);
		vehicles_Label.setForeground(new Color(230, 255, 255));
		panel.add(vehicles_Label);
		
		JButton add_Estate_Btn = new JButton("Add");
		add_Estate_Btn.setBackground(new Color(240, 110, 118));
		add_Estate_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new add_EstateGUI();
			}
		});
		add_Estate_Btn.setBounds(212, 222, 117, 29);
		panel.add(add_Estate_Btn);
		
		JButton add_Vehicle_Btn = new JButton("Add");
		add_Vehicle_Btn.setBackground(new Color(240, 110, 118));
		add_Vehicle_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new add_VehicleGUI();
			}
		});
		add_Vehicle_Btn.setBounds(212, 250, 117, 29);
		panel.add(add_Vehicle_Btn);
		
		JLabel limit_Label = new JLabel("Expenses Limit");
		limit_Label.setBounds(100, 312, 90, 16);
		limit_Label.setForeground(new Color(230, 255, 255));
		panel.add(limit_Label);
		
		textField_5 = new JTextField();
		textField_5.setBounds(212, 307, 130, 26);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JButton end_Btn = new JButton("Complete");
		end_Btn.setBackground(new Color(240, 110, 118));
		end_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		end_Btn.setBounds(417, 343, 117, 29);
		panel.add(end_Btn);
		
		JButton back_Button = new JButton("Back");
		back_Button.setBackground(new Color(240, 110, 118));
		back_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close_GUI();
				new LoginGUI();
			}
		});
		back_Button.setBounds(6, 343, 117, 29);
		panel.add(back_Button);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	protected void close_GUI() {
		this.dispose();
	}
}
