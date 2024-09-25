package lk.ijse.gdse.simplelogin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * --------------------------------------------
 * Author: R.I.B. Shamodha Sahan Rathnamalala
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 9/25/2024 4:14 PM
 * Project: simpleLogin
 * --------------------------------------------
 **/

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent load = FXMLLoader
                .load(getClass().getResource("/view/LoginForm.fxml"));

        stage.setTitle("Login System");
//        stage.getIcons().add()

        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.show();
    }
}
