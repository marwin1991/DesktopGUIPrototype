package diceMaster.controller;

import diceMaster.Main;
import diceMaster.mockaps.FakeServer;
import diceMaster.model.server.Server;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DiceMasterOverviewController {

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    private Stage primaryStage;

    private Server server;

    public Server getServer() {
        return server;
    }

    public DiceMasterOverviewController(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void initGameLayout() {
        try {
            this.primaryStage.setTitle("DiceMasterPrototype");

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/LoginPane.fxml"));
            BorderPane rootLayout = loader.load();
            LoginController loginController = loader.getController();
            this.server = new FakeServer();
            loginController.setAppController(this);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public void showGamesTable() {
        try {
            FXMLLoader loader = new FXMLLoader();

            loader.setLocation(Main.class.getResource("view/GamesTablePane.fxml"));
            BorderPane rootLayout = loader.load();
            GamesTableController gamesTableController = loader.getController();
            gamesTableController.setAppController(this, this.server);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showGame() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/InGamePane.fxml"));
            BorderPane rootLayout = loader.load();
            InGameController inGameController = loader.getController();
            inGameController.setAppController(this, 4);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
