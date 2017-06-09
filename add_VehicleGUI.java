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

public class add_VehicleGUI extends JFrame{
	private JTextField car_Id_Field;
	private JTextField cc_Field;
	
	public add_VehicleGUI(User logginUser) {
		
		this.setVisible(true);
		this.setSize(540,  360);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(75, 75, 100));
		
		JLabel title_Lbl = new JLabel("Add Vehicle");
		title_Lbl.setForeground(new Color(230, 255, 255));
		title_Lbl.setBounds(6, 6, 140, 16);
		getContentPane().add(title_Lbl);
		
		JLabel car_Id_Lbl = new JLabel("ID");
		car_Id_Lbl.setForeground(new Color(230, 255, 255));
		car_Id_Lbl.setBounds(68, 75, 20, 16);
		getContentPane().add(car_Id_Lbl);
		
		JLabel year_Lbl = new JLabel("First Date");
		year_Lbl.setForeground(new Color(230, 255, 255));
		year_Lbl.setBounds(68, 145, 80, 16);
		getContentPane().add(year_Lbl);
		
		JLabel cc_Lbl = new JLabel("CC");
		cc_Lbl.setForeground(new Color(230, 255, 255));
		cc_Lbl.setBounds(68, 215, 50, 16);
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
		
		JButton end_Btn = new JButton("Complete");
		end_Btn.setBackground(new Color(240, 110, 118));
		end_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vehicle vehicle = new Vehicle(car_Id_Field.getText(),Integer.parseInt(cc_Field.getText()));
				logginUser.add_Vehicle(vehicle);
				
				close_GUI();
			}
		});
		end_Btn.setBounds(407, 282, 117, 29);
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
