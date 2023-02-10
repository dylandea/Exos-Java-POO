package fr.fms.entities;

public class TestEmployee {

	public static void main(String[] args) {
		Employee billGates = new Employee("Bill", "Gates", 65, "aux USA", new Capital("Washington", "USA", 7600000, "W-M"), "Fondation B&M", 100000.0);
		Employee elonMusk = new Employee("Elon", "Musk", 49, "à Palo Alto", new City("Pretoria", "Afrique du Sud", 800000), "Tesla", 150000.0);
		
		System.out.println(billGates);
		System.out.println(elonMusk);
		
	}
}
