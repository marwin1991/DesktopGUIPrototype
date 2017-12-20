package diceMaster.controller;

import diceMaster.model.Server;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

public class LoginController {
    private DiceMasterOverviewController appController;
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
        this.appController = appController;
        this.server = server;
        this.bindSizeProperties();
    }

    private void bindSizeProperties(){
    }

    public void handleLoginEvent(MouseEvent mouseEvent) {
        server.registerClient(null);
        // check if login success then we go to GamesTableController
    }
}

