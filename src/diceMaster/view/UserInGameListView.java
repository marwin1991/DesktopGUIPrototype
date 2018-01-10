package diceMaster.view;

import diceMaster.model.common.UserInGame;
import javafx.scene.Group;

import java.util.LinkedList;
import java.util.List;

public class UserInGameListView extends Group {
    private List<UserInGame> players = new LinkedList<>();

    public UserInGameListView() {
        for (int i = 0; i < 5; i++) {
            UserInGameFilled u = new UserInGameFilled();
            u.setLayoutY(0 + 20 * i);

            this.getChildren().add(u);
        }
    }
}
