import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.Icon;

public class editGUI extends JFrame{
	private JTextField username_Field;
	private JTextField password_Field;
	private JTextField limit_Field;
	private ArrayList<User> Users;
	
	public editGUI(User logginUser,ArrayList<User> allUsers ) {
		
		this.Users=allUsers;
		
		this.setVisible(true);
		this.setSize(540, 360);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(75, 75, 100));
		
		JLabel edit_Profile = new JLabel("Edit Profile");
		edit_Profile.setBounds(6, 6, 150, 16);
		edit_Profile.setForeground(new Color(230, 255, 255));
		getContentPane().add(edit_Profile);
		
		JLabel profile = new JLabel("Profile");
		profile.setBounds(16, 34, 61, 16);
		profile.setForeground(new Color(230, 255, 255));
		getContentPane().add(profile);
		
		JLabel user = new JLabel("User");
		user.setBounds(16, 130, 61, 16);
		user.setForeground(new Color(230, 255, 255));
		getContentPane().add(user);
		
		JLabel username = new JLabel("Name");
		username.setBounds(60, 62, 61, 16);
		username.setForeground(new Color(230, 255, 255));
		getContentPane().add(username);
		
		JLabel password = new JLabel("Password");
		password.setBounds(60, 97, 61, 16);
		password.setForeground(new Color(230, 255, 255));
		getContentPane().add(password);
		
		username_Field = new JTextField();
		username_Field.setEditable(false);
		username_Field.setBounds(160, 57, 130, 26);
		getContentPane().add(username_Field);
		username_Field.setColumns(10);
		username_Field.setText(logginUser.getUsername());
		
		password_Field = new JTextField();
		password_Field.setEditable(false);
		password_Field.setBounds(160, 92, 130, 26);
		getContentPane().add(password_Field);
		password_Field.setText(logginUser.getPassword());
		
		JButton save_Profile_Btn = new JButton("Save");
		save_Profile_Btn.setBackground(new Color(240, 110, 118));
		JButton edit_Profile_Btn = new JButton("Edit");
		edit_Profile_Btn.setBackground(new Color(240, 110, 118));
		save_Profile_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username_Field.setEditable(false);
				password_Field.setEditable(false);
				edit_Profile_Btn.setVisible(true);
				save_Profile_Btn.setVisible(false);
				logginUser.setUsername(username_Field.getText());
				logginUser.setPassword(password_Field.getText());
			
				
			}
		});
		save_Profile_Btn.setBounds(350, 74, 117, 29);
		getContentPane().add(save_Profile_Btn);
		save_Profile_Btn.setVisible(false);
		
		
		edit_Profile_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username_Field.setEditable(true);
				password_Field.setEditable(true);
				edit_Profile_Btn.setVisible(false);
				save_Profile_Btn.setVisible(true);
			}
		});
		edit_Profile_Btn.setBounds(350, 74, 117, 29);
		getContentPane().add(edit_Profile_Btn);
		
		JLabel vehicles = new JLabel("Vehicles");
		vehicles.setBounds(60, 163, 61, 16);
		vehicles.setForeground(new Color(230, 255, 255));
		getContentPane().add(vehicles);
		
		JLabel estates = new JLabel("Estates");
		estates.setBounds(60, 198, 61, 16);
		estates.setForeground(new Color(230, 255, 255));
		getContentPane().add(estates);
		
		JLabel limit = new JLabel("Expenses Limit");
		limit.setBounds(60, 233, 100, 16);
		limit.setForeground(new Color(230, 255, 255));
		getContentPane().add(limit);
		
		limit_Field = new JTextField();
		limit_Field.setBounds(160, 228, 130, 26);
		getContentPane().add(limit_Field);
		limit_Field.setColumns(10);
		limit_Field.setText(String.valueOf(logginUser.getLimit()));
		limit_Field.setEditable(false);
		
		String[] est = new String[logginUser.getEstates().size()];
		for(int i=0; i<logginUser.getEstates().size(); i++) {
			est[i] = logginUser.getEstates().get(i).getAddress();
		}
		JComboBox estates_comboBox = new JComboBox(est);
		estates_comboBox.setBounds(160, 193, 130, 27);
		estates_comboBox.setBackground(new Color(240, 110, 118));
		estates_comboBox.setSelectedIndex(-1);
		getContentPane().add(estates_comboBox);
		
		String[] veh = new String[logginUser.getVehicles().size()];
		for(int i=0; i<logginUser.getVehicles().size(); i++) {
			veh[i] = logginUser.getVehicles().get(i).getVeh_id();
		}
		JComboBox vehicles_comboBox = new JComboBox(veh);
		vehicles_comboBox.setBounds(160, 158, 130, 27);
		vehicles_comboBox.setBackground(new Color(240, 110, 118));
		vehicles_comboBox.setSelectedIndex(-1);
		getContentPane().add(vehicles_comboBox);
		
		JButton end_Btn = new JButton("Complete");
	end_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close_GUI();
				new MainGUI(logginUser,Users);
			}
		});
		end_Btn.setBounds(417, 303, 117, 29);
		end_Btn.setBackground(new Color(240, 110, 118));
		getContentPane().add(end_Btn);
		
		
		JButton save_User_Btn = new JButton("Save");
		save_User_Btn.setBackground(new Color(240, 110, 118));
		JButton edit_User_Btn = new JButton("Edit");
		edit_User_Btn.setBackground(new Color(240, 110, 118));
		save_User_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limit_Field.setEditable(false);
				edit_User_Btn.setVisible(true);
				save_User_Btn.setVisible(false);
			}
		});
		save_User_Btn.setBounds(350, 175, 117, 29);
		getContentPane().add(save_User_Btn);
		save_User_Btn.setVisible(false);
		
		
		edit_User_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limit_Field.setEditable(true);
				edit_User_Btn.setVisible(false);
				save_User_Btn.setVisible(true);
			}
		});
		edit_User_Btn.setBounds(350, 175, 117, 29);
		getContentPane().add(edit_User_Btn);
		
		ImageIcon add = new ImageIcon ("/Users/GeorgeVaranos/Money-Honey/add.png");
		
		JButton add_Veh_Btn = new JButton((Icon) null);
		add_Veh_Btn.setText("+");
		add_Veh_Btn.setBackground(new Color(240, 110, 118));
		add_Veh_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new add_VehicleGUI(logginUser);
			}
		});
		add_Veh_Btn.setBounds(295, 159, 38, 25);
		getContentPane().add(add_Veh_Btn);
		
		JButton add_Estate_Btn = new JButton((Icon) null);
		add_Estate_Btn.setText("+");
		add_Estate_Btn.setBackground(new Color(240, 110, 118));
		add_Estate_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new add_EstateGUI(logginUser);
			}
		});
		add_Estate_Btn.setBounds(295, 194, 38, 25);
		getContentPane().add(add_Estate_Btn);
		
	}

	protected void close_GUI() {
		this.dispose();
	}
}
