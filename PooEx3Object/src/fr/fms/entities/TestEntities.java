package fr.fms.entities;

public class TestEntities {
	
	public static void main(String[] args) {
		
		Person[] persons = new Person[3];

		persons[0] = new Employee("Bill", "Gates", 65, "aux USA", new Capital("Washington", "USA", 7600000, "W-M"), "Fondation B&M", 100000.0);
		persons[1] = new Employee("Elon", "Musk", 49, "à Palo Alto", new City("Pretoria", "Afrique du Sud", 800000), "Tesla", 150000.0);
		persons[2] = new SalesRep("Robert", "Dupont", 50, "rue des rosiers à Toulouse", new City("Limoges", "FR", 133000), "Brico", 5.0);

		for (Person person: persons) {
			System.out.println(person);
		}
		
		
		System.out.println("\n\n\n");
		
		
		
		Object[] objArr = new Object[3];

		objArr[0] = new Employee("Bill", "Gates", 65, "aux USA", new Capital("Washington", "USA", 7600000, "W-M"), "Fondation B&M", 100000.0);
		objArr[1] = new Capital("Paris", "France", 2000000, "Tour Eiffel");
		objArr[2] = new SalesRep("Robert", "Dupont", 50, "rue des rosiers à Topulouse", new City("Limoges", "FR", 133000), "Brico", 3.5);

		for (Object obj: objArr) {
			if (obj instanceof Employee || obj instanceof SalesRep)
			System.out.println(obj);
		}
		
		
		System.out.println("\n\n\n");
		
		
		Person[] persons2 = new Person[3];

		persons2[0] = new Employee("Bill", "Gates", 65, "aux USA", new Capital("Washington", "USA", 7600000, "W-M"), "Fondation B&M", 100000.0);
		persons2[1] = new Employee("Elon", "Musk", 49, "à Palo Alto", new City("Pretoria", "Afrique du Sud", 800000), "Tesla", 150000.0);
		persons2[2] = new SalesRep("Robert", "Dupont", 50, "rue des rosiers à Toulouse", new City("Limoges", "FR", 133000), "Brico", 5.0);

		for (Person person: persons2) {
			System.out.println(person.remuneration());
		}
	}
}
