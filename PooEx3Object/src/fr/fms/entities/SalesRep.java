package fr.fms.entities;

public class SalesRep extends Person{
	private String company;
	private double percentage;
	private final double MIN_PERCENTAGE = 0.0;
	private final double CA = 50000;
	
	public SalesRep(String firstName, String lastName, int age, String address, City birthCity, String company, double percentage) {
		super(firstName, lastName, age, address, birthCity);
		this.company = company;
		this.percentage = percentage;
	}
	
	public SalesRep(String firstName, String lastName, int age, String address, City birthCity, String company) {
		super(firstName, lastName, age, address, birthCity);
		this.company = company;
		this.percentage = MIN_PERCENTAGE;
	}
	
	
	
	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		if (percentage<MIN_PERCENTAGE) System.out.println("% du chiffre d'affaire inférieur à 0 impossible");
		else this.percentage = percentage;
	}

	@Override
	public String toString() {
		return super.toString() + " , " + company + " , %CA:" + percentage;
	}
	@Override
	public double remuneration() {
		return CA*(percentage/100);
	}
}
