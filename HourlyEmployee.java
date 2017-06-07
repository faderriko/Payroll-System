public class HourlyEmployee extends Employee
{
	private double hourlyWage;
	private double hoursWorked;
	
	public HourlyEmployee(String first,String last,String ssn,double wage,double hours)
	{
		super(first,last,ssn);
			hourlyWage = wage;
			hoursWorked = hours;
	}
	
	public void setHourlyWage(double wage)
	{
		if (hourlyWage >= 0.0)
			hourlyWage = wage;
			
		else
			throw new IllegalArgumentException("Hourly Wage should > = 0.0");
	}
	
	public double getHourlyWage()
	{
		return hourlyWage;
	}
	
	public void setHoursworked(double hours)
	{
		if(hours >=0.0 && hours <=168)
			hoursWorked = hours;
			
	    else 
	    	throw new IllegalArgumentException("Hours should be >=0.0 and <=168 hours");
	}
	
	public double getHoursWorked()
	{
		return hoursWorked;
	}
	
	@Override
	public double earnings()
	{
		if(getHoursWorked()<=40)
			return getHourlyWage() * getHoursWorked();
			
		else
			return ((40 * getHourlyWage()) + (((getHoursWorked() - 40) * (1.5 *getHourlyWage()))));
	}
	
	@Override
	public String toString()
	{
		return String.format("HourlyEmployee: %s Wage: %s HoursWorked: %s ",super.toString(),getHourlyWage(),getHoursWorked());
	}
}