package diceMaster.controller;

import diceMaster.view.DicesField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class InGameController {
    private DiceMasterOverviewController appController;

    @FXML
    Button reRollButton;

    @FXML
    DicesField dicesField;

    public void setAppController(DiceMasterOverviewController appController) {
        this.appController = appController;
    }

    public void handleReRoll(ActionEvent event) {
        List<Integer> randomDotsToSet = new LinkedList<>();
        Random rand = new Random();
        for(int i=0; i<5; i++)
            if(dicesField.getDices().get(i).isSelected()) {
                randomDotsToSet.add(rand.nextInt(6) + 1);
            }
            else
                randomDotsToSet.add(dicesField.getDices().get(i).getNumberOfDots());
        for(int i=0; i<5; i++)
            System.out.println(randomDotsToSet.get(i));
        dicesField.setDicesDots(randomDotsToSet);
        for(int i=0; i<5; i++)
            if(dicesField.getDices().get(i).isSelected())
                dicesField.getDices().get(i).setSelected(false);
        reRollButton.setDisable(true);
    }

    public void handleDicesFieldMouseCiliced(MouseEvent mouseEvent) {
        boolean flag = false;
        for(int i=0; i<5; i++)
            if(dicesField.getDices().get(i).isSelected())
                flag=true;
        reRollButton.setDisable(!flag);
    }
}
