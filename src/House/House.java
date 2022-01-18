package House;

public class House {

	//Used for setting up houses
	private	int sqft = 0, beds = 0, cost = 0;
	private double baths = 0.0;
	private String address = "";
	
	
	//constructor
	public House(int sqft, int beds, double baths, int cost, String address) {
		this.sqft = sqft;
		this.beds = beds;
		this.baths = baths;
		this.cost = cost;
		this.address = address;
	}
	
	//getter methods
	public int getSQFT() { return sqft; }
	public int getBeds() { return beds; }
	public double getBaths() { return baths; }
	public int getCost() { return cost; }
	public String getAddress() { return address; }
	
//	@Override
//	public String toString() {
//		return "A " + breed + " " + type + " called " + name + 
//				" that is " + age + " years old.";
//	}

	
}
