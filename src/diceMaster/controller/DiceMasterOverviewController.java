package diceMaster.controller;

import diceMaster.Main;
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

    public DiceMasterOverviewController(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void initGameLayout() {
        try {
            this.primaryStage.setTitle("DiceMasterPrototype");

            FXMLLoader loader = new FXMLLoader();

            /*
            loader.setLocation(Main.class.getResource("view/InGamePane.fxml"));
            BorderPane rootLayout = (BorderPane) loader.load();


            InGameController inGameController = loader.getController();
            inGameController.setAppController(this, 4);
            */


            loader.setLocation(Main.class.getResource("view/LoginPane.fxml"));
            BorderPane rootLayout = (BorderPane) loader.load();


            LoginController loginController= loader.getController();
            loginController.setAppController(this,null);


            // add layout to a scene and show them all
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            // don't do this in common apps
            e.printStackTrace();

        }
    }

    public void goToGamesTable(Server server){
        try {
            FXMLLoader loader = new FXMLLoader();

            loader.setLocation(Main.class.getResource("view/GamesTablePane.fxml"));
            BorderPane rootLayout = (BorderPane) loader.load();
            GamesTableController gamesTableController = loader.getController();
            gamesTableController.setAppController(this, server);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void goToGame(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/InGamePane.fxml"));
            BorderPane rootLayout = (BorderPane) loader.load();


            InGameController inGameController = loader.getController();
            inGameController.setAppController(this, 4);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
