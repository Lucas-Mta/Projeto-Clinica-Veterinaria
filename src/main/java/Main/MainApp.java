package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            // Carregar o arquivo FXML da tela de login
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ViewAntiga/Login.fxml"));
            Parent root = loader.load();

            // Configurar a cena com o layout da tela de login
            Scene scene = new Scene(root);
            primaryStage.setTitle("Login - Clínica Veterinária");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
