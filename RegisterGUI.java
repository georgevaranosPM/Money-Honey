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
		this.setSize(450,500);
		panel.setBackground(Color.GRAY);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblRegister = new JLabel("Εγγραφή");
		lblRegister.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblRegister.setForeground(Color.YELLOW);
		lblRegister.setBounds(6, 6, 79, 19);
		panel.add(lblRegister);
		
		JLabel label = new JLabel("Προφίλ");
		label.setBounds(215, 8, 61, 16);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Όνομα Χρήστη");
		label_1.setBounds(94, 40, 99, 16);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Κωδικός");
		label_2.setBounds(135, 68, 59, 16);
		panel.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(215, 35, 130, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(215, 63, 130, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_3 = new JLabel("Χρήστης");
		label_3.setBounds(212, 101, 61, 16);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Ονοματεπώνυμο");
		label_4.setBounds(80, 134, 120, 16);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Ημ.Γέννησης");
		label_5.setBounds(105, 159, 85, 16);
		panel.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(212, 129, 130, 26);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(212, 154, 130, 26);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_6 = new JLabel("Ακίνητα");
		label_6.setBounds(134, 227, 56, 16);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Οχήματα");
		label_7.setBounds(128, 255, 62, 16);
		panel.add(label_7);
		
		JButton add_Estate_Btn = new JButton("Προσθήκη");
		add_Estate_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new add_EstateGUI();
			}
		});
		add_Estate_Btn.setBounds(212, 222, 117, 29);
		panel.add(add_Estate_Btn);
		
		JButton add_Vehicle_Btn = new JButton("Προσθήκη");
		add_Vehicle_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new add_VehicleGUI();
			}
		});
		add_Vehicle_Btn.setBounds(212, 250, 117, 29);
		panel.add(add_Vehicle_Btn);
		
		JLabel label_8 = new JLabel("Όριο Εξόδων");
		label_8.setBounds(100, 312, 90, 16);
		panel.add(label_8);
		
		textField_5 = new JTextField();
		textField_5.setBounds(212, 307, 130, 26);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JButton end_Btn = new JButton("Ολοκλήρωση");
		end_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		end_Btn.setBounds(417, 343, 117, 29);
		panel.add(end_Btn);
		
		JButton button = new JButton("Πίσω");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close_GUI();
			}
		});
		button.setBounds(6, 343, 117, 29);
		panel.add(button);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	protected void close_GUI() {
		this.dispose();
	}
}
