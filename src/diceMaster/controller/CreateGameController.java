package diceMaster.controller;

import diceMaster.model.common.GameConfigDTO;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CreateGameController extends Pane {
    private boolean approved = false;
    private GameConfigDTO gameConfigDTO;
    private Stage dialogStage;

    @FXML
    private TextField tableNameTextFiled;

    @FXML
    private CheckBox joinAsPlayerCheckBox;

    @FXML
    private CheckBox joinAsObserverCheckBox;

    @FXML
    private ComboBox<String> gameTypeComboBox;

    @FXML
    private ComboBox<Integer> maxPlayersComboBox;

    @FXML
    private ComboBox<Integer> easyBotsComboBox;

    @FXML
    private ComboBox<Integer> hardBotsComboBox;


    public CreateGameController() {
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage =  dialogStage;
    }

    public boolean isApproved() {
        return approved;
    }

    public void handleJoinAsPlayerCheckBox(MouseEvent mouseEvent) {
        joinAsPlayerCheckBox.setSelected(true);
        joinAsObserverCheckBox.setSelected(false);
    }

    public void handleJoinAsObserverCheckBox(MouseEvent mouseEvent) {
        joinAsPlayerCheckBox.setSelected(false);
        joinAsObserverCheckBox.setSelected(true);
    }

    public void handleCancelClicked(MouseEvent mouseEvent) {
        dialogStage.close();
    }

    public void handleCreateClicked(MouseEvent mouseEvent) {
        String tableName = tableNameTextFiled.getText();
        if(tableName.isEmpty()) {
            showAlert("Table's name field cannot be empty");
            return;
        }
        if(tableName.startsWith(" ")) {
            showAlert("Table's name cannot start with white char.");
            return;
        }
        if(maxPlayersComboBox.getValue() + easyBotsComboBox.getValue() + hardBotsComboBox.getValue() <= 1) {
            showAlert("There has to be at least 2 game participants (bots/players)");
            return;
        }
        dialogStage.close();
    }

    public void showAlert(String alertMessege){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("DiceMaster - Create game");
        alert.setHeaderText("DiceMaster - Create game");
        alert.setContentText(alertMessege);
        alert.show();
    }
}
