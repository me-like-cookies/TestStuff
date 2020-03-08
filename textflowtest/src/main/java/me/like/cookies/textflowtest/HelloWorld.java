package me.like.cookies.textflowtest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
 
public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(@SuppressWarnings("exports") Stage stage) 
    {
        stage.setTitle("TextFlow Test");
        
    	Text text = new Text("Can you select the text with your mouse\nwithin a JavaFX javafx.scene.text.Text?\nI'm afraid, not.");
        
        TextFlow textFlowPane = new TextFlow();
        textFlowPane.getChildren().addAll(text);
        
        Scene scene = new Scene(textFlowPane);
        
        stage.setScene(scene);
        stage.show();
    }
}