package me.like.cookies.textflowtest;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
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
        
    	Text text = new Text("Can you select the text with your mouse\nwithin a JavaFX Text?\n");
        TextArea textArea = new TextArea("can you\nselect this text with the mouse\nwithin a JavaFX TextArea?");
        textArea.setEditable(false);
        
        TextFlow textFlowPane = new TextFlow();
        ObservableList<Node> list = textFlowPane.getChildren();
        list.addAll(text, textArea);
        
        Scene scene = new Scene(textFlowPane);
        
        stage.setScene(scene);
        stage.show();
    }
}