public class CommissionEmployee2 extends Employee
{
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee2(String first,String last,String ssn,double sales,double rate)
	{
		super(first,last,ssn);
			grossSales = sales;
			commissionRate = rate;
	}
	
	public void setGrossSales(double sales)
	{
		if(sales >= 0.0)
		   grossSales = sales;
		   
		else 
			throw new IllegalArgumentException("Gross Sales should be >= 0.0");
	}
	
	public double getGrossSales()
	{
		return grossSales;
	}
	
	public void setCommissionRate(double rate)
	{
		if( rate >= 0.0 && rate <=1.0)
			commissionRate = rate;
			
		else
			throw new IllegalArgumentException("Commission Rate Should be >= 0.0 and <= 1.5");
	}
	
	public double getCommissionRate()
	{
		return commissionRate;
	}
	
	@Override
	public double earnings()
	{
		return getGrossSales() * getCommissionRate();
	}
	
	@Override
	public String toString()
	{
		return String.format("Commission Employee: %s Gross Sales: %s CommissionRate: %s", super.toString(),getGrossSales(),getCommissionRate());
	}
	
}