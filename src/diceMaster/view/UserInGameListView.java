package diceMaster.view;

import diceMaster.model.common.UserInGame;
import javafx.scene.Group;

import java.util.LinkedList;
import java.util.List;

public class UserInGameListView extends Group {

    public UserInGameListView(List<UserInGame> usersInGame) {
        int i = 0;
        for (UserInGame userInGame: usersInGame) {
            UserInGameFilled u = new UserInGameFilled(userInGame);
            u.setLayoutY(20 * i);
            this.getChildren().add(u);

            i++;
        }
    }
}
