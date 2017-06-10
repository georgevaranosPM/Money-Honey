import java.awt.Color;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class Diagrams_GUI extends JFrame{
	public Diagrams_GUI(int choice, User logginuser) {
		
		double wage_Sum = 0;
		double rent_Sum = 0;
		double sales_Sum = 0;
		double other_Sum = 0;
		
		double cons_Sum = 0;
		double bills_Sum = 0;
		double inc_Tax_Sum = 0;
		double est_Tax_Sum = 0;
		double veh_Tax_Sum = 0;
		
		double incomes_Sum = 0;
		double expenses_Sum = 0;
		
		DefaultCategoryDataset incomes_Dataset = new DefaultCategoryDataset();
		for(int i=0; i<logginuser.getIncomes().size(); i++) {
			incomes_Sum =+ logginuser.getIncomes().get(i).getIn_amount();
			if(logginuser.getIncomes().get(i).getIn_tag()=="Wage")
				wage_Sum =+ logginuser.getIncomes().get(i).getIn_amount();
			else if(logginuser.getIncomes().get(i).getIn_tag()=="Rent")
				rent_Sum =+ logginuser.getIncomes().get(i).getIn_amount();
			else if(logginuser.getIncomes().get(i).getIn_tag()=="Sales")
				sales_Sum =+ logginuser.getIncomes().get(i).getIn_amount();
			else if(logginuser.getIncomes().get(i).getIn_tag()=="Other")
				other_Sum =+ logginuser.getIncomes().get(i).getIn_amount();
		}
		incomes_Dataset.addValue(wage_Sum, "Euro", "Wage");
		incomes_Dataset.addValue(rent_Sum, "Euro", "Rent");
		incomes_Dataset.addValue(sales_Sum, "Euro", "Sales");
		incomes_Dataset.addValue(other_Sum, "Euro", "Other");
		
		DefaultCategoryDataset expenses_Dataset = new DefaultCategoryDataset();
		for(int i=0; i<logginuser.getExpenses().size(); i++) {
			expenses_Sum =+ logginuser.getExpenses().get(i).getEx_amount();
			if(logginuser.getExpenses().get(i).getEx_tag()=="Consumable")
				cons_Sum =+ logginuser.getExpenses().get(i).getEx_amount();
			else if(logginuser.getExpenses().get(i).getEx_tag()=="Bill")
				bills_Sum =+ logginuser.getExpenses().get(i).getEx_amount();
			else if(logginuser.getExpenses().get(i).getEx_tag()=="   Income Tax")
				inc_Tax_Sum =+ logginuser.getExpenses().get(i).getEx_amount();
			else if(logginuser.getExpenses().get(i).getEx_tag()=="   Vehicle Tax")
				veh_Tax_Sum =+ logginuser.getExpenses().get(i).getEx_amount();
			else if(logginuser.getExpenses().get(i).getEx_tag()=="   Estate Tax")
				est_Tax_Sum =+ logginuser.getExpenses().get(i).getEx_amount();
		}
		expenses_Dataset.addValue(cons_Sum, "Euro", "Consumables");
		expenses_Dataset.addValue(bills_Sum, "Euro", "Bills");
		expenses_Dataset.addValue(inc_Tax_Sum, "Euro", "Income Tax");
		expenses_Dataset.addValue(est_Tax_Sum, "Euro", "Estate Tax");
		expenses_Dataset.addValue(veh_Tax_Sum, "Euro", "Vehicle Tax");
		
		DefaultPieDataset pie_Dataset = new DefaultPieDataset( );
		pie_Dataset.setValue( "Incomes" , incomes_Sum);  
		pie_Dataset.setValue( "Expenses" , expenses_Sum);   
		
		JFreeChart incomes_Barchart = ChartFactory.createBarChart3D("Incomes Bar Chart of Last Month", "Type of Income", "Amount (euros)", incomes_Dataset, PlotOrientation.VERTICAL, false, true, false);
		JFreeChart expenses_Barchart = ChartFactory.createBarChart3D("Expenses Bar Chart of Last Month", "Type of Expense", "Amount (euros)", expenses_Dataset, PlotOrientation.VERTICAL, false, true, false);
		JFreeChart pie_Chart = ChartFactory.createPieChart("Incomes-Expense Pie Chart", pie_Dataset, false, true, false);
		
		ChartPanel incomes_BarchartPanel = new ChartPanel(incomes_Barchart);
		ChartPanel expenses_BarchartPanel = new ChartPanel(expenses_Barchart);
		ChartPanel inc_exp_PiechartPanel = new ChartPanel(pie_Chart);
		
		if(choice==1)
			setContentPane(incomes_BarchartPanel);
		else if(choice==2)
			setContentPane(expenses_BarchartPanel);
		else if(choice==3)
			setContentPane(inc_exp_PiechartPanel);
		
		this.setBackground(new Color(75, 75, 100));
		this.setVisible(true);
		this.setSize(540, 360);
	}

	protected void close_GUI() {
		this.dispose();
	}
}

