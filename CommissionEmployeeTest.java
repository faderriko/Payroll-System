import java.util.Scanner;
public class CommissionEmployeeTest
{
	public static void main(String []args)
		
	{
		CommissionEmployee employee = new CommissionEmployee("Derrick","Kipkemoi","D123F",0.5,0.8);
		
		System.out.printf("Employee Details\n Name: %s %s\n SocialSecurityNumber: %s\n GrossSales: %s\n CommissionRate: %s\n Earnings: %.2f",
		    employee.getFirstName(),employee.getLastName(),employee.getSocialSecurityNumber(),employee.getGrossSales(),
			employee.getCommissionRate(),employee.earnings());
			
		Scanner scanner = new Scanner(System.in);
			
	   System.out.println("\nEnter Your Employement Details Below");
	   String name1;
	   String name2;
	   String socialNumber;
	   double grossSale;
	   
	   System.out.println("Enter your Name:");
	   name1 = scanner.next();
	   name2 = scanner.next();
	   
	   employee.setFirstName(name1);
	   employee.setLastName(name2);
	   
	   System.out.println("Enter Your Social Security Number:");
	   socialNumber = scanner.next();
	   employee.setSocialSecurityNumber(socialNumber);
	   
	   System.out.println("Enter your gross Sales:");
	   grossSale = scanner.nextDouble();
	   employee.setGrossSales(grossSale);
	   employee.setCommissionRate(0.8);
	   
	   
	   	System.out.printf("Employee Details\n Name: %s %s\n SocialSecurityNumber: %s\n GrossSales: %s\n CommissionRate: %s\n Earnings: %.2f",
		    employee.getFirstName(),employee.getLastName(),employee.getSocialSecurityNumber(),employee.getGrossSales(),
			employee.getCommissionRate(),employee.earnings());
	   
	}
}