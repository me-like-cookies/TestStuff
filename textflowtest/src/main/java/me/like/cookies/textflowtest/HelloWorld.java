package me.like.cookies.textflowtest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
 
public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(@SuppressWarnings("exports") Stage stage) 
    {
    	makeWebViewStage(stage);
        stage.show();
    }

	private void makeWebViewStage(Stage stage) {
		final String content = "<h3>headline</h3><p>Can you select the text with your mouse within a JavaFX Text?</p>";
    	WebView v = new WebView();
    	v.getEngine().loadContent(content);
        Scene scene = new Scene(v);
        stage.setTitle("WebView Test");
        stage.setScene(scene);
	}
}
