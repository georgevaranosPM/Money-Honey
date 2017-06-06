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

public class editGUI extends JFrame{
	private JTextField username_Field;
	private JTextField password_Field;
	private JTextField name_Field;
	private JTextField limit_Field;
	
	public editGUI(ArrayList<User> Users, int pos ) {
		
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
		username_Field.setBounds(150, 57, 130, 26);
		getContentPane().add(username_Field);
		username_Field.setColumns(10);
		username_Field.setText(Users.get(pos).getUsername());
		
		password_Field = new JTextField();
		password_Field.setEditable(false);
		password_Field.setBounds(150, 92, 130, 26);
		getContentPane().add(password_Field);
		
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
				Users.get(pos).setUsername(username_Field.getText());
				Users.get(pos).setPassword(password_Field.getText());
			
				
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
		
		JLabel name = new JLabel("Full Name");
		name.setBounds(60, 158, 70, 16);
		name.setForeground(new Color(230, 255, 255));
		getContentPane().add(name);
		
		JLabel vehicles = new JLabel("Vehicles");
		vehicles.setBounds(60, 193, 61, 16);
		vehicles.setForeground(new Color(230, 255, 255));
		getContentPane().add(vehicles);
		
		JLabel estates = new JLabel("Estates");
		estates.setBounds(60, 228, 61, 16);
		estates.setForeground(new Color(230, 255, 255));
		getContentPane().add(estates);
		
		JLabel limit = new JLabel("Expenses Limit");
		limit.setBounds(60, 263, 90, 16);
		limit.setForeground(new Color(230, 255, 255));
		getContentPane().add(limit);
		
		name_Field = new JTextField();
		name_Field.setBounds(150, 153, 130, 26);
		getContentPane().add(name_Field);
		name_Field.setColumns(10);
		name_Field.setEditable(false);
		
		limit_Field = new JTextField();
		limit_Field.setBounds(150, 258, 130, 26);
		getContentPane().add(limit_Field);
		limit_Field.setColumns(10);
		limit_Field.setEditable(false);
		
		JComboBox estates_Field = new JComboBox();
		estates_Field.setBackground(new Color(240, 110, 118));
		estates_Field.setModel(new DefaultComboBoxModel(new String[] {"spiti 1", "spiti 2"}));
		estates_Field.setSelectedIndex(-1);
		estates_Field.setBounds(150, 224, 130, 27);
		getContentPane().add(estates_Field);
		
		JComboBox vehicles_Field = new JComboBox();
		vehicles_Field.setBackground(new Color(240, 110, 118));
		vehicles_Field.setModel(new DefaultComboBoxModel(new String[] {"karo 1", "karo 2"}));
		vehicles_Field.setSelectedIndex(-1);
		vehicles_Field.setBounds(150, 189, 130, 27);
		getContentPane().add(vehicles_Field);
		
		JButton end_Btn = new JButton("Complete");
		end_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginGUI.SaveStatus(Users);
				close_GUI();
				new MainGUI(Users,pos);
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
				name_Field.setEditable(false);
				limit_Field.setEditable(false);
				edit_User_Btn.setVisible(true);
				save_User_Btn.setVisible(false);
			}
		});
		save_User_Btn.setBounds(350, 205, 117, 29);
		getContentPane().add(save_User_Btn);
		save_User_Btn.setVisible(false);
		
		
		edit_User_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name_Field.setEditable(true);
				limit_Field.setEditable(true);
				edit_User_Btn.setVisible(false);
				save_User_Btn.setVisible(true);
			}
		});
		edit_User_Btn.setBounds(350, 205, 117, 29);
		getContentPane().add(edit_User_Btn);
		
		ImageIcon add = new ImageIcon ("/Users/GeorgeVaranos/Money-Honey/add.png");
		
		JButton add_Veh_Btn = new JButton(new ImageIcon("/Users/GeorgeVaranos/Money-Honey/add.png"));
		add_Veh_Btn.setBackground(new Color(240, 110, 118));
		add_Veh_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new add_VehicleGUI();
			}
		});
		add_Veh_Btn.setBounds(285, 192, 25, 25);
		getContentPane().add(add_Veh_Btn);
		
		JButton add_Estate_Btn = new JButton(new ImageIcon("/Users/GeorgeVaranos/Money-Honey/add.png"));
		add_Estate_Btn.setBackground(new Color(240, 110, 118));
		add_Estate_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new add_EstateGUI();
			}
		});
		add_Estate_Btn.setBounds(285, 222, 25, 25);
		getContentPane().add(add_Estate_Btn);
		
	}

	protected void close_GUI() {
		this.dispose();
	}
}
