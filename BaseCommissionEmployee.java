public class BaseCommissionEmployee extends CommissionEmployee2
{
  private double baseSalary;
  
  public BaseCommissionEmployee(String first,String last,String ssn,double sales,double rate,double salary)
  {
  	super(first,last,ssn,sales,rate);
  		baseSalary = salary;
  }	
  	
  	public void setBaseSalary(double salary)
  	{
  		if(salary > 0.0)
  			baseSalary = salary;
  			else
  				throw new IllegalArgumentException("Salary Should be > 0.0");
  	}
  	
  	public double getBaseSalary()
  	{
  		return baseSalary;
  	}
  	
  	@Override
  	public double earnings()
  	{
  		return getBaseSalary() + super.earnings();
  	}
  	
  	@Override
  	public String toString()
  	{
  		return String.format("Base-salaried: %s\n Base salary: %s",super.toString(),getBaseSalary());
  	}
}
