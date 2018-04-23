package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Login
extends Application {
  private TextField tfUsername= new TextField();
  private TextField tfPassword = new TextField();
  private Button btLogin = new Button("Login");
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create UI
    GridPane gridPane = new GridPane();
    gridPane.setHgap(5);
    gridPane.setVgap(5);
    gridPane.add(new Label("Username:"), 0, 0);
    gridPane.add(tfUsername, 1, 0);
    gridPane.add(new Label("Password:"), 0, 1);
    gridPane.add(tfPassword, 1, 1);
    gridPane.add(btLogin, 1, 5);

    // Set properties for UI
    gridPane.setAlignment(Pos.CENTER);
    tfUsername.setAlignment(Pos.BOTTOM_RIGHT);
    tfPassword.setAlignment(Pos.BOTTOM_RIGHT);
    GridPane.setHalignment(btLogin, HPos.RIGHT);

    // Process events
    btLogin.setOnAction(e -> calculateLoanPayment());

    // Create a scene and place it in the stage
    Scene scene = new Scene(gridPane, 400, 250);
    primaryStage.setTitle("J&J Airlines Login"); // Set title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  private void calculateLoanPayment() {
    // Get values from text fields
	tfUsername.getText();
    tfPassword.getText();

  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}

