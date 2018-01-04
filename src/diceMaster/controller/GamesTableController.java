package diceMaster.controller;

import diceMaster.model.*;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.util.LinkedList;
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

    @FXML
    CreateGameController createGameController;

    public void setAppController(DiceMasterOverviewController appController, Server server) {
        this.appController = appController;
        this.server = server;
        this.bindSizeProperties();
    }

    private void bindSizeProperties(){

    }

    public void createGameActionHandler(MouseEvent mouseEvent) {
        this.createGameController = new CreateGameController();
    }

    public void joinAsPlayerGameActionHandler(MouseEvent mouseEvent) {
        server.joinGame(null,null, null);
    }

    @Override
    public void refreshGamesTable(List<GameDTO> gamesTable) {
        server.getGames();
    }

    public void joinAsObserverGameActionHandler(MouseEvent mouseEvent) {
        server.joinGame(null,null, null);
    }
}