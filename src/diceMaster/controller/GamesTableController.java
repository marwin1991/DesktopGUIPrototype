package diceMaster.controller;


import diceMaster.Main;
import diceMaster.model.common.GameDTO;
import diceMaster.model.server.Server;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;


public class GamesTableController{
    private DiceMasterOverviewController appController;
    private Server server;
    private ObservableList<GameDTO> listOfGames;

    @FXML
    BorderPane borderPane;

    @FXML
    Button createGameButton;

    @FXML
    Button joinGameAsPlayerButton;

    @FXML
    Button joinGameAsObserverButton;

    @FXML
    ListView<GameDTO> games;


    public void setAppController(DiceMasterOverviewController appController, Server server) {
        this.appController = appController;
        this.server = server;
        this.bindSizeProperties();
    }

    private void bindSizeProperties(){

    }

    public boolean showCreateGameDialog(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/CreateGameDialog.fxml"));
            AnchorPane page = loader.load();
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Create game");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(appController.getPrimaryStage());
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            CreateGameController presenter = loader.getController();
            presenter.setDialogStage(dialogStage);
            presenter.init();
            dialogStage.showAndWait();
            return presenter.isApproved();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void createGameActionHandler(MouseEvent mouseEvent) {
        showCreateGameDialog();
    }

    public void joinAsPlayerGameActionHandler(MouseEvent mouseEvent) {

        //server.joinGame(null,null, null);
        appController.goToGame();
    }

    public void refreshGamesTable(List<GameDTO> gamesTable) {
        server.getGames();
    }

    public void joinAsObserverGameActionHandler(MouseEvent mouseEvent) {
        server.joinGame(null,null, null);
    }

}