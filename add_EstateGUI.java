import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class add_EstateGUI extends JFrame{
	private JTextField address_Field;
	private JTextField sq_m_Field;
	public add_EstateGUI() {
		
		
		this.setVisible(true);
		this.setSize(540,  360);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(75, 75, 100));
		
		JLabel title_Lbl = new JLabel("Add Estate");
		title_Lbl.setBounds(6, 6, 140, 16);
		title_Lbl.setForeground(new Color(230, 255, 255));
		getContentPane().add(title_Lbl);
		
		JLabel address_Lbl = new JLabel("Address");
		address_Lbl.setForeground(new Color(230, 255, 255));
		address_Lbl.setBounds(56, 91, 55, 16);
		getContentPane().add(address_Lbl);
		
		JLabel sq_m_Lbl = new JLabel("Square Meters");
		sq_m_Lbl.setForeground(new Color(230, 255, 255));
		sq_m_Lbl.setBounds(56, 166, 90, 16);
		getContentPane().add(sq_m_Lbl);
		
		address_Field = new JTextField();
		address_Field.setBounds(170, 86, 130, 26);
		getContentPane().add(address_Field);
		address_Field.setColumns(10);
		
		sq_m_Field = new JTextField();
		sq_m_Field.setBounds(170, 161, 130, 26);
		getContentPane().add(sq_m_Field);
		sq_m_Field.setColumns(10);
		
		JButton end_Btn = new JButton("Complete");
		end_Btn.setBackground(new Color(240, 110, 118));
		end_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//aUser.estates.add();
				close_GUI();
			}
		});
		end_Btn.setBounds(417, 303, 117, 29);
		getContentPane().add(end_Btn);
		
		JButton back_Button = new JButton("Back");
		back_Button.setBackground(new Color(240, 110, 118));
		back_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close_GUI();
			}
		});
		back_Button.setBounds(6, 303, 117, 29);
		getContentPane().add(back_Button);
	}
	
	protected void close_GUI() {
		this.dispose();
	}
}
