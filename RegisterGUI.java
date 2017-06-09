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
	private JTextField usernameField;
	private JTextField passwordField;
	private JTextField fullnameField;
	private JTextField limitField;
	User newUser;
	public RegisterGUI() {
		
		JPanel panel = new JPanel();
		this.setSize(540,360);
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
		
		usernameField = new JTextField();
		usernameField.setBounds(215, 35, 130, 26);
		panel.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JTextField();
		passwordField.setBounds(215, 63, 130, 26);
		panel.add(passwordField);
		passwordField.setColumns(10);
		
		JLabel user_Label = new JLabel("User");
		user_Label.setBounds(212, 126, 61, 16);
		user_Label.setForeground(new Color(230, 255, 255));
		panel.add(user_Label);
		
		JLabel name_Label = new JLabel("Full Name");
		name_Label.setBounds(94, 159, 110, 16);
		name_Label.setForeground(new Color(230, 255, 255));
		panel.add(name_Label);
		
		fullnameField = new JTextField();
		fullnameField.setBounds(212, 154, 130, 26);
		panel.add(fullnameField);
		fullnameField.setColumns(10);
		
		JLabel limit_Label = new JLabel("Expenses Limit");
		limit_Label.setBounds(94, 214, 100, 16);
		limit_Label.setForeground(new Color(230, 255, 255));
		panel.add(limit_Label);
		
		limitField = new JTextField();
		limitField.setBounds(212, 209, 130, 26);
		panel.add(limitField);
		limitField.setColumns(10);
		
		JButton end_Btn = new JButton("Complete");
		end_Btn.setBackground(new Color(240, 110, 118));
		end_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double limit = Double.parseDouble(limitField.getText());
			User user = new User(usernameField.getText(),passwordField.getText(),limit);
			new MainGUI(user);
			dispose();
			}
		});
		end_Btn.setBounds(397, 282, 117, 29);
		panel.add(end_Btn);
		
		JButton back_Button = new JButton("Back");
		back_Button.setBackground(new Color(240, 110, 118));
		back_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close_GUI();
				new LoginGUI();
			}
		});
		back_Button.setBounds(6, 282, 117, 29);
		panel.add(back_Button);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	protected void close_GUI() {
		this.dispose();
	}
}
