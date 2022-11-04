package app;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;//salario de base por semana

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		
		if(baseSalary <= 0.0) //validando as horas trabalhadas
			throw new IllegalArgumentException(
					"Base Salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if(baseSalary <= 0.0) //validando as horas trabalhadas
			throw new IllegalArgumentException(
					"Base Salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}
	//calcula o svencimentos: sobrescreve o método earnings em CommissionEmployee
	@Override
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}

	@Override
	public String toString() {
		return String.format("%s %s; %s $%,.2f",
				"base-salaried", super.toString(), 
				"base Salary ", getBaseSalary());
	}
	
	
	
}







