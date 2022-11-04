package app;

public class CommissionEmployee extends Employee{
	
	private double grossSales; //vendas brutas
	private double commissionRate; //porcentagem por comissão
	
	//construtor
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		
		if(commissionRate <= 0.0) //validando as horas trabalhadas
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		
		if(grossSales < 0.0) //validando as horas trabalhadas
			throw new IllegalArgumentException(
					"Gross sales be >= 0.0");
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}
	//configura as vendas brutas
	public void setGrossSales(double grossSales) {
		if(grossSales < 0.0) //validando 
			throw new IllegalArgumentException(
					"Gross Sales must be >= 0.0!");
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if(commissionRate <= 0.0) //validando 
			throw new IllegalArgumentException(
					"Gross Sales must be >= 0.0!");
		this.commissionRate = commissionRate;
	}
	
	
	@Override
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}

	@Override
	public String toString() {
		return String.format("%s%n%s: $%,.2f; %s; $%,.2f",
				"commission employee", super.toString(),
				"gross sales", getGrossSales(),
				"commission rate", getCommissionRate());
	
	}
	
	
}










