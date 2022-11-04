package app;

public class Program {

	public static void main(String[] args) {
		
		SalariedEmployee salary = 
				new SalariedEmployee("Vitor", "Marcio", "111.11.111", 800.00);

		HourlyEmployee hourly =
				new HourlyEmployee("Jorge", "Jonas", "222.22.22", 16.75, 40);
	
	
		CommissionEmployee commission =
				new CommissionEmployee("Gustavo", "Marcelo", "333.33.333", 10000, .06);
	
		BasePlusCommissionEmployee base =
				new BasePlusCommissionEmployee("Bob Marley", "Paul Macartney", "444-44-444", 500, .04, 300);
	
		
		System.out.println("Employee processed individually: ");
	
		System.out.printf("%n%s%n%s: $%,.2f%n%n",
				salary, "earned", salary.earnings());
	}

}
