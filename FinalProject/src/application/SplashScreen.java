package application;



import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SplashScreen extends Application {
	Stage window;
	public static void main(String[] args) throws Exception {
		launch(args);
		
	}
	@Override
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		ProgressBar bar = new ProgressBar();
		bar.setPrefWidth(200);
		Label loadText = new Label("Screen Loading.....");
		VBox layout = new VBox();
		layout.getChildren().add(loadText);
		layout.getChildren().add(bar);
		layout.setAlignment(Pos.CENTER);
		Scene splash = new Scene(layout, 500, 500);
		
		
		window.setScene(splash);
		window.setTitle("Loading");
		window.show();
		

	}
}
