package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import classes.User;
import database.Database;
import application.Login;
import application.CreateAccount;

public class Main extends Application {
	
	Stage window;
	Scene login, newAccount;

	
	public static void main (String[] args) {	
		launch(args);
				
	}
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		
	// LOGIN WINDOW
	// Create UI
		GridPane loginPage = new GridPane();
		loginPage.setHgap(5);
		loginPage.setVgap(5);
		loginPage.add(new Label("Username:"), 0, 0);
		loginPage.add(Login.getTfUsername(), 1, 0);
		loginPage.add(new Label("Password:"), 0, 1);
		loginPage.add(Login.getTfPassword(), 1, 1);
		loginPage.add(Login.btLogin, 1, 5);
		loginPage.add(Login.btNewAccount, 0, 10);
	    
	    
	    
	 // Set properties for UI  
		loginPage.setAlignment(Pos.CENTER);
	    User.getTfUsername().setAlignment(Pos.BOTTOM_RIGHT);
	    User.getTfPassword().setAlignment(Pos.BOTTOM_RIGHT);
	    GridPane.setHalignment(Login.btLogin, HPos.RIGHT);
	    GridPane.setHalignment(Login.btNewAccount, HPos.RIGHT);
	    
	 // Create a scene and place it in the stage
	    login = new Scene(loginPage, 400, 250);		    
	    window.setTitle("J&J Airlines Login"); // Set title
	    window.setScene(login); // Place the scene in the stage
	    window.show(); // Display the stage
	    
	  // Actions for buttons
	    Login.btLogin.setOnAction(e -> Login.loginVerification());
	    Login.btNewAccount.setOnAction(e -> window.setScene(newAccount));
	    
	 	    
	 // NEW USER REGISTRATION WINDOW
	 // Create UI
	    		GridPane gridPane1 = new GridPane();
	 		gridPane1.setHgap(5);
	 		gridPane1.setVgap(5);
	 		//A radio button with an empty string for its label
	 		ToggleGroup group = new ToggleGroup();
	 		
	 		RadioButton rb1 = new RadioButton("Customer");
	 		rb1.setToggleGroup(group);
	 		RadioButton rb2 = new RadioButton("Administrator");
	 		rb2.setToggleGroup(group);
	 		
	 		//Setting a text label
	 		gridPane1.add(rb1, 0, 0);
	 		gridPane1.add(rb2, 1, 0);
	 		gridPane1.add(new Label("First Name:"), 0, 1);
	 		gridPane1.add(User.getTfFirstName(), 1, 1);
	 		gridPane1.add(new Label("Last Name:"), 2, 1);
	 		gridPane1.add(User.getTfLastName(), 3, 1);
	 		gridPane1.add(new Label("SSN:"), 0, 2);
	 		gridPane1.add(User.getSocialSecurity(), 1, 2);
	 		gridPane1.add(new Label("Email Address:"), 0, 3);
	 		gridPane1.add(User.getTfEmail(), 1, 3);
	 		gridPane1.add(new Label("Address:"), 0, 4);
	 		gridPane1.add(User.getTfAddress(), 1, 4);
	 		gridPane1.add(new Label("State:"), 0, 5);
	 		gridPane1.add(User.getTfState(), 1, 5);
	 		gridPane1.add(new Label("Zip Code:"), 0, 9);
	 		gridPane1.add(User.getTfZipCode(), 1, 9);
	 		gridPane1.add(new Label("User Name:"), 0, 10);
	 		gridPane1.add(User.getTfnewUsername(), 1, 10);
	 		gridPane1.add(new Label("Password:"), 0, 11);
	 		gridPane1.add(User.getTfnewPassword(), 1, 11);
	 		gridPane1.add(new Label("Security Question:"), 0, 12);
	 		gridPane1.add(User.getTfSecurityQuestion(), 1, 12);
	 		gridPane1.add(new Label("Security Answer:"), 0, 13);
	 		gridPane1.add(User.getTfSecurityAns(), 1, 13);
	 		gridPane1.add(CreateAccount.btCreateAccount, 1, 15);

	 	// Set properties for UI
	 		gridPane1.setAlignment(Pos.CENTER);
	 		User.getTfFirstName().setAlignment(Pos.BOTTOM_RIGHT);
	 		User.getTfLastName().setAlignment(Pos.BOTTOM_RIGHT);
	 		User.getSocialSecurity().setAlignment(Pos.BOTTOM_RIGHT);
	 		User.getTfEmail().setAlignment(Pos.BOTTOM_RIGHT);
	 		User.getTfAddress().setAlignment(Pos.BOTTOM_RIGHT);
	 		User.getTfState().setAlignment(Pos.BOTTOM_RIGHT);
	 		User.getTfZipCode().setAlignment(Pos.BOTTOM_RIGHT);
	 		User.getTfnewUsername().setAlignment(Pos.BOTTOM_RIGHT);
	 		User.getTfnewPassword().setAlignment(Pos.BOTTOM_RIGHT);
	 		User.getTfSecurityQuestion().setAlignment(Pos.BOTTOM_RIGHT);
	 		User.getTfSecurityAns().setAlignment(Pos.BOTTOM_RIGHT);
	 		GridPane.setHalignment(CreateAccount.btCreateAccount, HPos.RIGHT);
			
	 	// Create a scene and place it in the stage
	 		newAccount = new Scene(gridPane1, 700, 450);
	 	
	 	// Actions for buttons
	 		CreateAccount.btCreateAccount.setOnAction(e -> CreateAccount.createAccount());
		    
		    
	}

}
