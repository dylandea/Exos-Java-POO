package fr.fms.entities;

public class TestSalesRep {

	public static void main(String[] args) {
		SalesRep dupont = new SalesRep("Robert", "Dupont", 50, "rue des rosiers à Topulouse", new City("Limoges", "FR", 133000), "Brico", 3.5);
		dupont.setPercentage(-1.0);
		System.out.println(dupont);
	}
}
