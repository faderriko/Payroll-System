public abstract class Employee
{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
		
		public Employee(String first,String last,String ssn)
		{
			firstName = first;
			lastName = last;
			socialSecurityNumber = ssn;
		}
		
		public void setFirstName(String first)
		{
			firstName = first;
		}
		
		public void setLastName(String last)
		{
			lastName = last;
		}
		
		public void setSocialSecurityNumber(String ssn)
		{
			
			socialSecurityNumber = ssn;
		}
		
		public String getFirstName()
		{
			return firstName;
		}
		
		public String getLastName()
		{
			return lastName;
		}
		
		public String getSocialSecurityNumber()
		{
			return socialSecurityNumber;
		}
		
		@Override
		public String toString()
		{
		       return String.format("%s %s\nSocialSecurityNumber %s",getFirstName(),getLastName(),getSocialSecurityNumber());
			
		} 
			
			public abstract double earnings();
}