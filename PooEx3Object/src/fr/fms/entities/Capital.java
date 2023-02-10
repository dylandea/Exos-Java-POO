package fr.fms.entities;

public class Capital extends City {
	private String monument;
	
	public Capital(String name, String country, int population, String monument) {
		super(name, country, population);
		this.monument = monument;
	}

	public String getMonument() {
		return monument;
	}

	public void setMonument(String monument) {
		this.monument = monument;
	}

	@Override
	public String toString() {
		return super.toString() + " , monument : " + monument;
	}
	
}
