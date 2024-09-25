package lk.ijse.gdse.simplelogin.controller;

/**
 * --------------------------------------------
 * Author: R.I.B. Shamodha Sahan Rathnamalala
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 9/25/2024 4:05 PM
 * Project: simpleLogin
 * --------------------------------------------
 **/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LoginFormController {

    @FXML
    private AnchorPane loginPage;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void signInOnAction(ActionEvent event) throws IOException {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        if (username.equals("amal") && password.equals("1234")){
            loginPage.getChildren().clear();
            loginPage.getChildren().add(
                    FXMLLoader
                            .load(getClass()
                                    .getResource("/view/DashBoard.fxml"))
            );
        }else {
            new Alert(Alert.AlertType.ERROR,"somthing wrong").show();
        }
    }

}
