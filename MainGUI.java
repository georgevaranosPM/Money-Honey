import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.*;

public class MainGUI extends JFrame{
	
<<<<<<< HEAD
	private Date from_Date;
	private Date to_Date;
	
	public MainGUI(User aUser) {
=======
	public MainGUI(ArrayList<User>Users,int pos) {
		User aUser=Users.get(pos);
>>>>>>> e8a45ab6f1c55579d65d64aa288bac4f2fd1195c
		getContentPane().setLayout(null);
		
		//////Main Panel//////
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(110, 58, 309, 241);
		getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		//////Lista esodwn///////
		JList<String> Inc_List = new JList<String>();
		Inc_List.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		Inc_List.setModel(new AbstractListModel() {
			String[] Inc_Values = new String[] {"Έσοδο 1", "Έσοδο 2"};
			public int getSize() {
				return Inc_Values.length;
			}
			public Object getElementAt(int index) {
				return Inc_Values[index];
			}
		});
		Inc_List.setBounds(6, 85, 144, 150);
		mainPanel.add(Inc_List);
		
		
		//////Lista e3odwn///////
		JList<String> Exp_List = new JList<String>();
		Exp_List.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		Exp_List.setModel(new AbstractListModel() {
			String[] Exp_Values = new String[] {"Έξοδο α", "Έξοδο β"};
			public int getSize() {
				return Exp_Values.length;
			}
			public Object getElementAt(int index) {
				return Exp_Values[index];
			}
		});
		Exp_List.setBounds(159, 85, 144, 150);
		mainPanel.add(Exp_List);
		
		JLabel show_Label = new JLabel("Εμφάνιση Καταχωρήσεων");
		show_Label.setBounds(64, 0, 179, 16);
		mainPanel.add(show_Label);
		
		JLabel from_Date__Label = new JLabel("Από");
		from_Date__Label.setBounds(6, 22, 61, 16);
		mainPanel.add(from_Date__Label);
		
		JLabel to_Date_Label = new JLabel("Μέχρι");
		to_Date_Label.setBounds(159, 22, 61, 16);
		mainPanel.add(to_Date_Label);
		
		JSpinner from_Date_Select = new JSpinner();
		SpinnerDateModel from_date_Select_Model = new SpinnerDateModel();
		from_Date_Select.setBounds(45, 17, 105, 26);
		from_date_Select_Model.setCalendarField(Calendar.DAY_OF_MONTH);
		from_Date_Select.setModel(from_date_Select_Model);
		from_Date_Select.setEditor(new JSpinner.DateEditor(from_Date_Select,"dd/MM/yyyy"));
		mainPanel.add(from_Date_Select);
		
		JSpinner to_Date_Select = new JSpinner();
		SpinnerDateModel to_date_Select_Model = new SpinnerDateModel();
		to_Date_Select.setBounds(198, 17, 105, 26);
		to_date_Select_Model.setCalendarField(Calendar.DAY_OF_MONTH);
		to_Date_Select.setModel(to_date_Select_Model);
		to_Date_Select.setEditor(new JSpinner.DateEditor(to_Date_Select,"dd/MM/yyyy"));
		mainPanel.add(to_Date_Select);
		
		JButton update_Btn = new JButton("Προβολή");
		update_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				from_Date = (Date) from_Date_Select.getValue();
				to_Date = (Date) to_Date_Select.getValue();
				if(from_Date.after(to_Date)) {
					JOptionPane.showMessageDialog(null, "Μη έγκυρη μορφή περιόδου");
				}
			}
		});
		update_Btn.setBounds(91, 50, 117, 29);
		mainPanel.add(update_Btn);
		
			
			///////Right Panel////////
			JPanel mainRightPanel = new JPanel();
			mainRightPanel.setBounds(419, 58, 121, 241);
			getContentPane().add(mainRightPanel);
			mainRightPanel.setLayout(null);
			
			
			JButton editBtn = new JButton("Επεξεργασία");
			editBtn.setBounds(4, 76, 115, 29);
			editBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!Exp_List.isSelectionEmpty()) {
						new Inc_Exp_GUI(aUser);
					}
				}
			});
			
			mainRightPanel.add(editBtn);
			
			JButton deleteBtn = new JButton("Διαγραφή");
			deleteBtn.setBounds(5, 120, 110, 29);
			deleteBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			
			mainRightPanel.add(deleteBtn);

		
		///////South Panel////////
		JPanel mainSouthPanel = new JPanel();
		mainSouthPanel.setBounds(0, 299, 540, 39);
		getContentPane().add(mainSouthPanel);
		mainSouthPanel.setLayout(null);
		
		JButton graphsBtn = new JButton("Εμφάνιση Γραφημάτων");
		graphsBtn.setSize(190, 29);
		graphsBtn.setLocation(168, 6);
		graphsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				////Gui Grafhmatwn
			}
		});
		mainSouthPanel.add(graphsBtn);
		
		
		//////North Panel//////
		JPanel mainNorthPanel = new JPanel();
		mainNorthPanel.setBounds(0, 0, 540, 58);
		getContentPane().add(mainNorthPanel);
		mainNorthPanel.setLayout(null);
		
		JLabel userLabel = new JLabel(aUser.getUsername());
		userLabel.setBounds(32, 14, 100, 16);
		mainNorthPanel.add(userLabel);
		
		JLabel dateLabel = new JLabel(DateTimeFormatter.ofPattern("dd/MM/yyy").format(LocalDate.now()));
		dateLabel.setBounds(218, 14, 78, 16);
		mainNorthPanel.add(dateLabel);
		
		JButton editProfBtn = new JButton("Ρυθμίσεις");
		editProfBtn.setBounds(427, 1, 107, 29);
		editProfBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new editGUI(Users,pos);
			}
		});
		mainNorthPanel.add(editProfBtn);
		
		JButton logOutBtn = new JButton("Αποσύνδεση");
		logOutBtn.setBounds(408, 30, 126, 29);
		logOutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				LoginGUI.SaveStatus(Users);
				new LoginGUI();
			}
		});
		mainNorthPanel.add(logOutBtn);
		
		
		///////Left Panel////////
		JPanel mainLeftPanel = new JPanel();
		mainLeftPanel.setBounds(0, 58, 110, 241);
		FlowLayout flowLayout = (FlowLayout) mainLeftPanel.getLayout();
		flowLayout.setVgap(90);
		flowLayout.setHgap(0);
		getContentPane().add(mainLeftPanel);
		
		JButton sbmtBtn = new JButton("Προσθήκη");
		sbmtBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Inc_Exp_GUI(null);
			}
		});
		mainLeftPanel.add(sbmtBtn);
		
		this.setVisible(true);
		this.setSize(540, 360);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
