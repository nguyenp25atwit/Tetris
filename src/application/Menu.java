package application;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*; 
import javafx.scene.layout.*; 
import javafx.scene.control.*;
import javafx.event.*; 
import javafx.geometry.*;

public class Menu extends Main{

	Label response;
	
	public static void main(String[] args) {
		
		launch(args);

	}
	
	public void start(Stage myStage) {
		myStage.setTitle("Ttris");
		
		BorderPane rootNode = new BorderPane();
		
		Scene myScene = new Scene(rootNode, 300, 300);
		
		 myStage.setScene(myScene);
	}

}
