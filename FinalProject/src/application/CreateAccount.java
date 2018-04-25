package application;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import database.Database;
import classes.User;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import application.Main;

public class CreateAccount extends User {
	
	

	static Button btCreateAccount = new Button("Create Account");
	

	static void createAccount() {
		// Get values from text fields
		
		try {
			Database.getConnection();
			
			
			String sql = "insert into Customer (socialSecurity, address, email, firstName, lastName, "
					+ "userName, state, zipCode, securityQuestion, securityAns, password) values ('" + User.getSocialSecurity().getText() + "', "
					+ "'" + User.getTfAddress().getText() + "', '" + User.getTfEmail().getText() + "', '" + User.getTfFirstName().getText() + "',"
					+ "'" + User.getTfLastName().getText() + "', '" + User.getTfnewUsername().getText() + "', '" + User.getTfState().getText() + "',"
					+ "'" + User.getTfZipCode().getText() + "', '" + User.getTfSecurityQuestion().getText() + "', '" + User.getTfSecurityAns().getText() + "', "
							+ "'" + User.getTfnewPassword().getText() + "')";
			
							
			PreparedStatement myStmt = Database.conn.prepareStatement(sql);
			
			myStmt.executeUpdate(sql);
			
				System.out.println("Saved Successfully");
			
			
			Database.conn.close(); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Incorrect Format");
			e.printStackTrace();
		}
		
		
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */

}
