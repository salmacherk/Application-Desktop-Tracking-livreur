package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Charge le fichier FXML
        Parent root = FXMLLoader.load(getClass().getResource("/interfaces/home.fxml"));
        
        // Cr�e une sc�ne � partir de la racine FXML
        Scene scene = new Scene(root);
        
        // D�finit la sc�ne sur la sc�ne principale
        primaryStage.setScene(scene);
        
        // Affiche la sc�ne principale
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
