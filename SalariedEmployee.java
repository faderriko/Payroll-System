public class SalariedEmployee extends Employee
{
	private double weeklySalary;
	
	public SalariedEmployee(String first,String last,String ssn,double weekly)
	{
		super(first,last,ssn);
		weeklySalary = weekly;
	}
	
	public void setWeeklySalary(double weekly)
	{
		if(weekly >= 0.0)
			weeklySalary = weekly;
			
		else
			throw new IllegalArgumentException("Weekly Salary should be > 0.0");
	}
	
	public double getWeeklySalary()
	{
		return weeklySalary;
	}
	
	@Override
	public double earnings()
	{
		return getWeeklySalary();
	}
	
	@Override
	public String toString()
	{
	return String.format("Salaried Employee: %s Weekly Salary:%s",super.toString(),getWeeklySalary());
		
	}
		 
}