package diceMaster.model.common;

import diceMaster.model.common.DTO;
import diceMaster.model.common.GameConfigDTO;

import java.util.List;

public class GameDTO implements DTO {
    private int id;
    private GameConfigDTO gameConfig;
    private List<UserInGame> players;
    private List<User> observers;

    @Override
    public void fromJSON() {

    }

    @Override
    public String toJSON() {
        return null;
    }
}
