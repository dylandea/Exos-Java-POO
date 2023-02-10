package fr.fms.entities;

public class Employee extends Person{
	private String company;
	private double salary;
	private final double CHARGES = 0.2;
	
	public Employee(String firstName, String lastName, int age, String address, City birthCity, String company, double salary) {
		super(firstName, lastName, age, address, birthCity);
		this.company = company;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return super.toString() + " , " + company + " , " + salary;
	}
	@Override
	public double remuneration() {
		return salary - (salary*CHARGES);
		
	}
	
//	public String displayWithoutPop() {
//		return super.getFirstName() + " , " + super.getLastName() + " , " + super.getAge() + " , " + super.getAddress() + " , " + super.getBirthCity().getName() + " , " + super.getBirthCity().getCountry() + " , " + company + " , " + salary;
//	}
}
