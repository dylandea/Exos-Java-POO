
public class TestCity {

	public static void main(String[] args) {
		
		//1.1
		City toulouse = new City("Toulouse", "France", 450000);
		City stgeours = new City("St-Geours", "France", 2500);
		
		System.out.println(stgeours.getName());
		
		
		
		//1.2
		System.out.println();
		System.out.println("Ancienne population: " + toulouse.getPopulation());
		System.out.println("Nouvelle population: " + toulouse.setPopulation(toulouse.getPopulation()+20000));
	
		
		
		//1.3
		System.out.println();
		City rabat = new City("Rabat", 577000);
		
		System.out.println("[ville : " + rabat.getName() + "] [pays : " + rabat.getCountry() + "] [nb d'habitants : " + rabat.getPopulation() + "]");
		
		rabat.setCountry("Maroc");
		
		System.out.println("[ville : " + rabat.getName() + "] [pays : " + rabat.getCountry() + "] [nb d'habitants : " + rabat.getPopulation() + "]");
		
		
		//1.4
		System.out.println();
		toulouse.display();
		//1.5 et 1.6
		System.out.println(toulouse);
		
		//1.7
		System.out.println();
		System.out.println("Nombre d'instances de City :" + City.getNbOfInstances());
		
		//1.8
		
	}

}
