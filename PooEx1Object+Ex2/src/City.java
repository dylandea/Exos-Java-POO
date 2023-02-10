
public class City {

	private String name;
	private String country;
	private int population;
	private static int nbOfInstances = 0;
	
	public static int getNbOfInstances() {
		return nbOfInstances;
	}

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
	
	public int setPopulation(int population) {
		if (population < 0)
			throw new RuntimeException("Le nombre d'habitants ne peut être négatif.");
		if (population < this.population) 
			throw new RuntimeException("Le nouveau nombre d'habitants ne peut être inférieure à l'ancienne.");
		else this.population = population;
		return this.population;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public void setName(String name) {
		if (name.toLowerCase().equals("st-geours")) 
			this.name = "Saint-Geours-de-Maremne";
		else 
			this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	
//	@Override
//	public String toString() {
//		return "ville de " + this.name + " en " + this.country + " ayant " + this.population + " habitants";
//	}

	@Override
	public String toString() {
		return "City [name=" + name + ", country=" + country + ", population=" + population + "]";
	}

	public int getPopulation() {
		return this.population;
	}

	public String getCountry() {
		
		return this.country;
	}

	public void display() {
		System.out.println("ville de " + this.name + " en " + this.country + " ayant " + this.population + " habitants");
		
	}
	
	public String displayCityAsAskedInExo2() {
		if (this.population != 0)  return this.name + " , " + this.country + " , population " + this.name + " " + this.population + " d'habitants";
		else  return this.name + " , " + this.country;
	}

}
