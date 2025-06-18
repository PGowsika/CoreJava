package aggregation;

public class Aggregation {

	String city;
	String state;
	String country;
	
	public Aggregation(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	
	@Override
	public String toString() {
		return "Aggregation [city=" + city + ", state=" + state + ", country=" + country + "]";
	}



	
}
