package app;

public class Program {

	public static void main(String[] args) {
		
		SalariedEmployee salary = 
				new SalariedEmployee("Vitor", "Marcio", "111.11.111", 800.00);

	
		
		System.out.println("Employee processed individually: ");
	
		System.out.printf("%n%s%n%s: $%,.2f%n%n",
				salary, "earned", salary.earnings());
	}

}
