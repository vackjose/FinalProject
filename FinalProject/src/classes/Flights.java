package classes;

public class Flights {
	// attributes from class 
	private String flightID;
	private String startCity = "";
	private String endCity = "";
	private String date = "";
	private String time = "";
	private String departureDate = "";
	private String returnDate = "";
	private String departureTime = "";
	private String returnTime = "";
	public Flights (String startCity, String endCity, String date, String time) {
		this.startCity = startCity;
		this.endCity = endCity; 
		this.date = date;
		this.time = time;
	}
	
	
	

}
