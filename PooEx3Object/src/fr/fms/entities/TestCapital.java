package fr.fms.entities;

public class TestCapital {

	public static void main(String[] args) {
		Capital paris = new Capital("Paris", "France", 2000000, "Tour Eiffel");
		Capital london = new Capital("Londres", "GB", 9400000, "Big Ben");
		
		System.out.println(paris);
		System.out.println(london);

	}

}
