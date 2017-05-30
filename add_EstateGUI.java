import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class add_EstateGUI extends JFrame{
	private JTextField address_Field;
	private JTextField sq_m_Field;
	public add_EstateGUI() {
		
		
		this.setVisible(true);
		this.setSize(540,  360);
		getContentPane().setLayout(null);
		
		JLabel title_Lbl = new JLabel("Προσθήκη Ακινήτου");
		title_Lbl.setBounds(6, 6, 140, 16);
		getContentPane().add(title_Lbl);
		
		JLabel address_Lbl = new JLabel("Οδός");
		address_Lbl.setBounds(111, 91, 35, 16);
		getContentPane().add(address_Lbl);
		
		JLabel sq_m_Lbl = new JLabel("Τετραγωνικά Μέτρα");
		sq_m_Lbl.setBounds(20, 166, 135, 16);
		getContentPane().add(sq_m_Lbl);
		
		address_Field = new JTextField();
		address_Field.setBounds(170, 86, 130, 26);
		getContentPane().add(address_Field);
		address_Field.setColumns(10);
		
		sq_m_Field = new JTextField();
		sq_m_Field.setBounds(170, 161, 130, 26);
		getContentPane().add(sq_m_Field);
		sq_m_Field.setColumns(10);
		
		JButton btnNewButton = new JButton("Ολοκλήρωση");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//aUser.estates.add();
				close_GUI();
			}
		});
		btnNewButton.setBounds(417, 303, 117, 29);
		getContentPane().add(btnNewButton);
		
		JButton button = new JButton("Πίσω");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close_GUI();
			}
		});
		button.setBounds(6, 303, 117, 29);
		getContentPane().add(button);
	}
	
	protected void close_GUI() {
		this.dispose();
	}
}
