public class CommissionEmployee
{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String first, String last,String ssn,double sales,double rate)
	{
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		grossSales = sales;
		commissionRate = rate;
	} 
		
		public void setFirstName( String first)
		{
			firstName = first;
			
		}
		
		public String getFirstName()
		{
			return firstName;
		}
		
		public void setLastName(String last)
		{
			lastName = last;
		} 
		
		public String getLastName()
		{
			return lastName;
		} 
			
		public void setSocialSecurityNumber(String ssn)
		{
			socialSecurityNumber = ssn;
		}
		
		public String getSocialSecurityNumber()
		{
			return socialSecurityNumber; 
		}
		
		public void setGrossSales(double sales)
		{
			if (sales > 0.0)
				grossSales = sales;
				
			else
				throw new IllegalArgumentException("Gross sales should >0.0");
			
		} 
		
		public double getGrossSales()
		{
			return grossSales;
		}
		
		public void setCommissionRate(double rate)
		{
			if(rate > 0.0 && rate < 1.0)
				commissionRate = rate;
				else
					throw new IllegalArgumentException("Commision rate should be > 0.0 and <1.0");
		}
		
		public double getCommissionRate()
		{
			return commissionRate;
		}
		
		public double earnings()
		{  
			double x;
			
			x = commissionRate * grossSales;
			return x;
		}
		
		@Override
		public String toString()
		{
			return String.format("Commision Employee: %s-5 %s\n SocialSecurityNumber: %s-5\n GrossSales: %d-5\n CommissionRate: %d-5\n",
			firstName,lastName,socialSecurityNumber,commissionRate);
		}
		
		
}