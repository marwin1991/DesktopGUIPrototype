package diceMaster.controller;

import diceMaster.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DiceMasterOverviewController {

    private Stage primaryStage;

    public DiceMasterOverviewController(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void initGameLayout() {
        try {
            this.primaryStage.setTitle("DiceMasterPrototype");

            // load layout from FXML file
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/InGamePane.fxml"));
            BorderPane rootLayout = (BorderPane) loader.load();

            // set initial data into diceMaster.controller
            InGameController controller = loader.getController();
            controller.setAppController(this, 4);

            // add layout to a scene and show them all
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            // don't do this in common apps
            e.printStackTrace();

        }
    }
}
