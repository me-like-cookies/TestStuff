package me.like.cookies.textflowtest;

import org.fxmisc.richtext.StyleClassedTextArea;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
 
public class HelloWorld extends Application 
{
	private static final String CAPTION = "LOREM IPSUM\n";
	private static final String LOREM_IPSUM = 
			"Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore " +
	        "et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. " +
	        "Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";
	
	public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(@SuppressWarnings("exports") Stage stage) 
    {
        stage.setTitle("TextFlow Test");
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setPannable(true);
        
        StyleClassedTextArea area = new StyleClassedTextArea();
        area.setPrefSize(400, 300);
        scrollPane.setContent(area);       
        Scene scene = new Scene(scrollPane);
        stage.setScene(scene);

        area.getStylesheets().add(HelloWorld.class.getResource("/css/StyleClasses.css").toExternalForm());
        
        area.append(CAPTION, "caption");
        area.append("\n", "miniline");
        area.append(LOREM_IPSUM, "other");
        area.setEditable(false);
        area.setWrapText(true);


        stage.show();
    }
}