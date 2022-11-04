package app;

public class HourlyEmployee extends Employee{
	
	private double wage;//salario por hora
	private double hours;//horas trabalhadas durante a semana
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		
		
		if(wage < 0.0) //validando a remuneração
			throw new IllegalArgumentException(
					"Wage must be positive!");
		this.wage = wage;
		
		if(hours < 0.0) //validando a remuneração
			throw new IllegalArgumentException(
					"Hours must be positive!");
		this.hours = hours;
	}
	//retorna a remuneração
	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if(wage < 0.0) //validando a remuneração
			throw new IllegalArgumentException(
					"Hourly wage must be positive!");
		this.wage = wage;
		
	}
	//retorna as horas trabalhadas
	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if(wage < 0.0) //validando as horas trabalhadas
			throw new IllegalArgumentException(
					"Worked hours must be positive!");
		this.hours = hours;
	}
	//calcular os rendimentos; sobrescreve o método earnings em Employee
	@Override
	public double earnings() {
		
		if(getHours() <= 40) {//nenhuma hora extra
			return getHours() * getWage();
		}else {
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
		
	}
	
	//retoma a representação hourlyEmployee
	@Override
	public String toString() {
		return String.format("HourlyEmployee: %s%n%s: $%,.2f; %s; $%,.2f",
				super.toString(), "hourly wage", getWage(),
				"hours worked", getHours());
	}
	
	
	
}
