package diceMaster.view;

import diceMaster.model.common.UserInGame;
import javafx.scene.Group;
import javafx.scene.text.Text;

public class UserInGameFilled extends Group {
    private Text nickText = new Text();
    private DicesField dices = new DicesField();
    private Text scoreText = new Text();

    public void setDices(DicesField dices) {
        this.dices = dices;
    }

    public UserInGameFilled(){
        this.nickText.setText("Nick");
        this.nickText.setX(-35.0);
        this.nickText.setY(10.0);
        this.scoreText.setText("1000");
        this.scoreText.setX(75.0);
        this.scoreText.setY(10.0);
        this.dices.setDicesFiledScale(0.15);
        this.getChildren().add(nickText);
        this.getChildren().add(scoreText);
        this.getChildren().add(dices);
    }
}
