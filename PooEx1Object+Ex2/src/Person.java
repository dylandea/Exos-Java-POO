
public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String address;
	private City birthCity;
	
	public Person(String firstName, String lastName, int age, String address, City birthCity) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.birthCity = birthCity;
	}
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = "unknown";
	}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = "unknown";
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ "]Born" + birthCity;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String displayPersonAsAskedInExo2() {
		return firstName + " , " + lastName + " , " + age + "ans , habitant " + address
				+ " , Ville de naissance : " + birthCity.displayCityAsAskedInExo2();
	}

	public City getBirthCity() {
		return birthCity;
	}

	
}
