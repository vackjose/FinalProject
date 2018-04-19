package classes;

public class Administration {
	//attributes of Class 
	private String firstName = "";
	private String lastName = "";
	private String address = "";
	private int zipCode = 0;
	private String state = "";
	private String userName = "";
	private String password = "";
	private String email = "";
	private String socialSecurity = "";
	private String securityQuestion = "";
	private String[] flightsBooked = new String[100];
	
	
	//methods of Class 
	public Administration (String firstName, String lastName, String address, int zipCode, String state, String userName, String password, String socialSecurity, String securityQuestion) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.zipCode = zipCode; 
		this.state = state;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.socialSecurity = socialSecurity;
		this.securityQuestion = securityQuestion;
		
	}
	public void searchFlight (String startCity, String endCity, String date, String time) {
		
	}
	public void bookFlight () {
		
	}
	public void deleteFlightAdm () {
		
	}
	public void deleteFlight () {
		
	}
	public void addFlight () {
		
	}
	public void updateFlight () {
		
	}
	

}
