import java.util.Arrays;
import java.util.Iterator;

public class Exo2CelebritiesFilter {
	public static void main(String[] args) {
		
		Person[] persons = new Person[6];
		
		persons[0] = new Person("Macron", "Emmanuel", 43, "L'Elysée à Paris", new City("Amiens", "France"));
		persons[1] = new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris", "France", 2000000));
		persons[2] = new Person("Johnson", "Boris", 56, "Downing street à Londres", new City("New York", "Etats-Unis"));
		persons[3] = new Person ("Depardieu", "Gerard", 72, "Moscou", new City ("Chateauroux", "France"));
		persons[4] = new Person ("Kravitz", "Lenny", 56, "Hotel Particulier à Paris", new City ("New-York", "USA"));
		persons[5] = new Person ("Lawrence", "Jennifer", 30, "Louisville aux USA", new City ("Idan Hills", "USA"));
		
		
		for (Person person : persons) {
			if (person.getAddress().toLowerCase().contains("paris") || person.getBirthCity().getCountry().toLowerCase().contains("france"))
				System.out.println(person.displayPersonAsAskedInExo2());
		}
		
		Iterator<Person> it = Arrays.asList(persons).iterator();
		while (it.hasNext()) {
			Person person = it.next();
			if (person.getAddress().toLowerCase().contains("paris") || person.getBirthCity().getCountry().toLowerCase().contains("france"))
				System.out.println(person.displayPersonAsAskedInExo2());
		}
		
		Arrays.asList(persons).forEach(person -> {
			if (person.getAddress().toLowerCase().contains("paris") || person.getBirthCity().getCountry().toLowerCase().contains("france"))
				System.out.println(person.displayPersonAsAskedInExo2());
		});
	}
}
