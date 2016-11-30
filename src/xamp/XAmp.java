/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xamp;

import java.nio.file.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 *
 * @author IAMLUX this will be the first step
 */
public class XAmp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/xamp/GUI/MainView.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
    /*
    * Make the new and edit buttons in MainView.fxml open addAndEdit.fxml. 
    */
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public static void playSong() {
        Media media = new Media(Paths.get("test.mp3").toUri().toString()); //replace /Movies/test.mp3 with your file
        MediaPlayer player = new MediaPlayer(media);
        player.play();
    }

}
