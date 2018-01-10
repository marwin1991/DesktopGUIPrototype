package diceMaster.controller;

import diceMaster.Main;
import diceMaster.model.common.User;
import diceMaster.model.server.Server;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

import java.io.IOException;

public class LoginController {
    private DiceMasterOverviewController diceMasterOverviewController;
    private Server server;

    @FXML
    BorderPane borderPane;

    @FXML
    TextField userNameTextField;

    @FXML
    Text loginText;

    @FXML
    Button loginButton;

    public void setAppController(DiceMasterOverviewController appController, Server server) {
        this.diceMasterOverviewController = appController;
        this.server = server;
        this.bindSizeProperties();
    }

    private void bindSizeProperties() {
    }

    public void handleLoginEvent(MouseEvent mouseEvent) {
        /*if (!server.registerClient(loginText.getText())) {
            // here alert window that coundlnt login
        }*/
        this.diceMasterOverviewController.goToGamesTable(server);
    }
}

