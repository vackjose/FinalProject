package classes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Customer extends Administration {
	

	private String firstName = "";
	private String lastName = "";
	private String address = "";
	private int zipCode = 0;
	private String state = "";
	private String userName = "";
	private String paswword = "";
	private String email = "";
	private String socialSecurity = "";
	private String securityQuestion = "";
	private String securityQAnswer = "";
	private String[] flightsBooked = new String[100];

	private String test;
	
	public Customer(String firstName, String lastName, String address, int zipCode, String state, String userName,
			String password, String socialSecurity, String securityQuestion) {
		super(firstName, lastName, address, zipCode, state, userName, password, socialSecurity, securityQuestion);
	}
}
