package application;

import database.Database;
import classes.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import application.Main;


public class Login extends User {

  public static Button btLogin = new Button("Login");
  public static Button btNewAccount = new Button("Create New Account");
  
    
  static void loginVerification() {
    // Get values from text fields
	User.getTfUsername().getText();
    User.getTfPassword().getText();
    
    try {
		Database.getConnection();
		
		String sql = "select * from Customer where userName='" + User.getTfUsername().getText() + 
				"' and password='" + User.getTfPassword().getText() + "'";
		PreparedStatement myStmt = Database.conn.prepareStatement(sql);
		
		ResultSet rs = myStmt.executeQuery(sql);
		if (rs.next()) 
			System.out.println("Login Successful");	

		else
			System.out.println("Incorrect Username or Password");
		Database.conn.close(); 
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */


}

