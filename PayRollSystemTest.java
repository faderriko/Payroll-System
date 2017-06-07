public class PayRollSystemTest
{
	public static void main(String args[])
		
		
	{
		
		SalariedEmployee salariedEmployee = new SalariedEmployee("Edmond","Too","WEB234Q\n",3450.98);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Derrick","Kipkemoi","QTRY5431\n",4531.8,67);
		CommissionEmployee2 commissionEmployee2 = new CommissionEmployee2("Faith","Chepkorir","FRT34S\n",200.0,0.89);
		BaseCommissionEmployee baseCommissionEmployee = new BaseCommissionEmployee("Titus","Kibor","TYR45DR\n",453.98,0.98,4366);
		
		Employee[] employee = new Employee[4];
		
		employee[0] = salariedEmployee;
		employee[1] = hourlyEmployee;
		employee[2] = commissionEmployee2;
		employee[3] = baseCommissionEmployee;
		
		for(Employee currentEmployee : employee)
		{
			System.out.println(currentEmployee);
		}
	}
}