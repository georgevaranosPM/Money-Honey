import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class add_VehicleGUI extends JFrame{
	private JTextField car_Id_Field;
	private JTextField cc_Field;
	public add_VehicleGUI() {
		
		
		this.setVisible(true);
		this.setSize(540,  360);
		getContentPane().setLayout(null);
		
		JLabel title_Lbl = new JLabel("Προσθήκη Οχήματος");
		title_Lbl.setBounds(6, 6, 140, 16);
		getContentPane().add(title_Lbl);
		
		JLabel car_Id_Lbl = new JLabel("Πινακίδα");
		car_Id_Lbl.setBounds(85, 75, 61, 16);
		getContentPane().add(car_Id_Lbl);
		
		JLabel year_Lbl = new JLabel("Ημ. Κυκλοφορίας");
		year_Lbl.setBounds(31, 145, 115, 16);
		getContentPane().add(year_Lbl);
		
		JLabel cc_Lbl = new JLabel("Κυβικά");
		cc_Lbl.setBounds(96, 215, 50, 16);
		getContentPane().add(cc_Lbl);
		
		car_Id_Field = new JTextField();
		car_Id_Field.setBounds(170, 70, 130, 26);
		getContentPane().add(car_Id_Field);
		car_Id_Field.setColumns(10);
		
		JSpinner car_Year_Select = new JSpinner();
		SpinnerDateModel car_Year_Select_Model = new SpinnerDateModel();
		car_Year_Select.setBounds(178, 140, 105, 26);
		car_Year_Select_Model.setCalendarField(Calendar.DAY_OF_MONTH);
		car_Year_Select.setModel(car_Year_Select_Model);
		car_Year_Select.setEditor(new JSpinner.DateEditor(car_Year_Select,"dd/MM/yyyy"));
		getContentPane().add(car_Year_Select);
		
		cc_Field = new JTextField();
		cc_Field.setBounds(170, 210, 130, 26);
		getContentPane().add(cc_Field);
		cc_Field.setColumns(10);
		
		JButton btnNewButton = new JButton("Ολοκλήρωση");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//aUser.vehicles.add();
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
