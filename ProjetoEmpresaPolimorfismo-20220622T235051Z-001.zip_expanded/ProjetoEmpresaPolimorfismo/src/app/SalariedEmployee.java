package app;

public class SalariedEmployee extends Employee {
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) 
	{
		super(firstName, lastName, socialSecurityNumber);
	
		if(weeklySalary < 0.0)
			throw new IllegalArgumentException(
					"Weekly salary must be positive!");

		this.weeklySalary = weeklySalary;
}
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	//calcular os rendimentos: 
	@Override
	public double earnings() {
		return getWeeklySalary();
	}
	@Override
	public String toString() {
		return String.format("Salaried employees: %s%n%s: $%,.2f",
				super.toString(), " weekly salary ", getWeeklySalary());
	}
	
	
}
