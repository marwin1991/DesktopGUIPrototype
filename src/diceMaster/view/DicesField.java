package diceMaster.view;

import javafx.scene.Group;

import java.util.LinkedList;
import java.util.List;

public class DicesField extends Group {
    private List<Dice> dices = new LinkedList<>();

    public List<Dice> getDices() {
        return dices;
    }

    public DicesField(){
        for(int i=0; i<5; i++){
            Dice d = new Dice();
            d.setLayoutX(0+100*i);

            d.setLayoutY(0);
            this.dices.add(d);
            this.getChildren().add(d);
        }
    }

    public void setDicesDots(List<Integer> dotsToSet){
        for(int i = 0; i< 5; i++){
            dices.get(i).setNumberOfDots(dotsToSet.get(i));
        }
    }
}
