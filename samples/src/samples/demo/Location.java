package samples.demo;

public class Location
{
	private String location;
	public int x = 10;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	 public static void Location(String[] args) {
		    Location myObj = new Location();
		    myObj.x = 25; // x is now 25
		    System.out.println(myObj.x);
		  }
}


