package fr.fms.entities;

public class City {

	private String name;
	private String country;
	private int population;
	private static int nbOfInstances = 0;

	public City(String name, String country, int population) {
		setName(name);
		setCountry(country);
		setPopulation(population);
		City.nbOfInstances++;
	}
	
	public City(String name, String country) {
		setName(name);
		setCountry(country);
		City.nbOfInstances++;
	}
	
	public City(String name, int population) {
		setName(name);
		setCountry("unknown");
		setPopulation(population);
		City.nbOfInstances++;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name.toLowerCase().equals("st-geours")) 
			this.name = "Saint-Geours-de-Maremne";
		else 
			this.name = name;
	}
	
	public int getPopulation() {
		return this.population;
	}
	
	public int setPopulation(int population) {
		if (population < 0)
			throw new RuntimeException("Le nombre d'habitants ne peut être négatif.");
		if (population < this.population) 
			throw new RuntimeException("Le nouveau nombre d'habitants ne peut être inférieure à l'ancienne.");
		else this.population = population;
		return this.population;
	}

	public String getCountry() {
		
		return this.country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

	public static int getNbOfInstances() {
		return nbOfInstances;
	}
	
//	@Override
//	public String toString() {
//		if (this.population != 0)  return this.name + " , " + this.country + " , " + this.population + " d'habitants";
//		else  return this.name + " , " + this.country;
//	}
	
	
	//exercice 3.5 !!
	@Override
	public String toString() {
		return this.name + " , " + this.country;
	}

}