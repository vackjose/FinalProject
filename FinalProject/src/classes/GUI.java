package classes;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUI extends Application {
	Stage window;
	Scene mainMenu, logInPage, signUpPage;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		//label for main menu
		Label mainMenuLabel = new Label("Click on Option");
		
		//sign up & log in button actions
		Button logIn = new Button("Log-In");
		logIn.setOnAction(e -> window.setScene(logInPage));
		
		Button signUp = new Button("Sign-Up");
		signUp.setOnAction(e -> window.setScene(signUpPage));
		
		//layout of main menu
		GridPane mainMenuLayout = new GridPane();
		mainMenuLayout.setHgap(6);
		mainMenuLayout.setVgap(6);
		mainMenuLayout.setAlignment(Pos.CENTER);

		mainMenuLayout.add(mainMenuLabel,1,0);
		mainMenuLayout.add(logIn, 1,2);
		mainMenuLayout.add(signUp, 1,3);

		//main menu creation
		mainMenu = new Scene(mainMenuLayout, 1000, 1000);
		//label for log-in Page
		Label logInLabel = new Label("Enter Information");
			
		
		
		
		// Log-In requirements
		Label userN = new Label("User Name");
		TextField userName = new TextField();
		Label passW = new Label("Password");
		TextField password = new TextField();
				
		//Log-In button creation
		Button logIn2 = new Button("Log-In");
		logIn2.setOnAction(e -> System.out.println("Yeha"));
				
		//Log in layout creation
		GridPane logInLayout = new GridPane();
		logInLayout.setHgap(6);
		logInLayout.setVgap(6);
		logInLayout.setAlignment(Pos.CENTER);
		
		logInLayout.add(logInLabel, 0, 0);
		logInLayout.add(userN, 0, 2);
		logInLayout.add(userName, 1, 2);
		logInLayout.add(passW, 0, 3);
		logInLayout.add(password, 1, 3);
		logInLayout.add(logIn2, 1, 4);

				
		//Log in creation
		logInPage = new Scene(logInLayout, 1000, 1000);
		//label for log-in Page
		Label signUpLabel = new Label("Enter Information");
		
		
		
						
		// Sign-up requirements
		Label newUserN = new Label("User Name");
		TextField newUserName = new TextField();
		
		Label newPassW = new Label("Password");
		TextField newPassword = new TextField();
		
		Label fName = new Label("First Name:");
		TextField firstName = new TextField();

		Label lName = new Label("Last Name:");
		TextField lastName = new TextField();

		Label ssn = new Label("SSN:");
		TextField socialSec = new TextField();

		Label addr = new Label("Address:");
		TextField address = new TextField();

		Label zCode = new Label("Zip-Code:");
		TextField zipCode = new TextField();

		Label st = new Label("State:");
		TextField state = new TextField();

		Label email = new Label("Email:");
		TextField emailAddr = new TextField();

		Label sQuestion = new Label("Security Question:");
		TextField securityQ = new TextField();

		Label sAnswer = new Label("Security Question Answer:");
		TextField securityA = new TextField();



		
						
		//Sign-up button creation
		Button signUp2 = new Button("Sign-Up");
		signUp2.setOnAction(e -> System.out.println("yay"));
		
		//Sign-up layout creation
		GridPane signUpLayout = new GridPane();
		signUpLayout.setHgap(6);
		signUpLayout.setVgap(6);
		signUpLayout.setAlignment(Pos.CENTER);
		
		signUpLayout.add(signUpLabel, 0, 0);
		signUpLayout.add(fName, 0, 1);
		signUpLayout.add(firstName, 1, 1);
		signUpLayout.add(lName, 0, 2);
		signUpLayout.add(lastName,1, 2);
		signUpLayout.add(addr, 0, 3);
		signUpLayout.add(address, 1, 3);
		signUpLayout.add(zCode, 0, 4);
		signUpLayout.add(zipCode, 1, 4);
		signUpLayout.add(st, 0, 5);
		signUpLayout.add(state, 1, 5);
		signUpLayout.add(newUserN, 0, 6);
		signUpLayout.add(newUserName, 1, 6);
		signUpLayout.add(newPassW, 0, 7);
		signUpLayout.add(newPassword, 1, 7);
		signUpLayout.add(email, 0, 8);
		signUpLayout.add(emailAddr, 1, 8);
		signUpLayout.add(ssn, 0, 9);
		signUpLayout.add(socialSec, 1, 9);
		signUpLayout.add(sQuestion, 0, 10);
		signUpLayout.add(securityQ, 1, 10);
		signUpLayout.add(sAnswer, 0, 11);
		signUpLayout.add(securityA, 1, 11);
		signUpLayout.add(signUp2, 1, 12);












				
		//Sign-up creation
		signUpPage = new Scene(signUpLayout, 1000, 1000);		
				
		
		
		
		window.setScene(mainMenu);
		window.setTitle("Cheap Flightz");
		window.show();
		
	}
	
}
