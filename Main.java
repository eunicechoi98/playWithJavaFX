package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	Stage window;
	Scene sceneOne, sceneTwo;
	
	Button button;

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception{		
		window = primaryStage;
		
		Label labelOne = new Label("First Scene");
		
		
		//primaryStage.setTitle("Title");
		button = new Button();
		button.setText("Next");
		
		// Lambda expression to handle the button events
		// e is the event
		// -> event operator
		button.setOnAction(e -> window.setScene(sceneTwo));
		
		// Layout 1 - children are laid out in vertical column
		// lays out all the objects on top of each other
		VBox layoutOne = new VBox(20);
		layoutOne.getChildren().addAll(labelOne,button);
		
		//StackPane root = new StackPane();
		//root.getChildren().add(button);
		
		Scene scene = new Scene(layoutOne,400,400);
		
		// Button 2:
		Button buttonTwo = new Button();
		buttonTwo.setText("Back");
	
		buttonTwo.setOnAction(e -> window.setScene(scene));
		
		
		// Layout 2:
		StackPane layoutTwo = new StackPane();
		layoutTwo.getChildren().add(buttonTwo);
		sceneTwo = new Scene(layoutTwo,200,200);
		
		sceneTwo.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		//sceneTwo.getStylesheets().add("application.css");
		window.setScene(scene);
		window.show();
		
	}

	

}
