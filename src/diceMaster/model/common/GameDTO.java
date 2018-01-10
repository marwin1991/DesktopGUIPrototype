package diceMaster.model.common;

import diceMaster.model.common.DTO;
import diceMaster.model.common.GameConfigDTO;

import java.util.List;

public class GameDTO implements DTO {
    private int id;

    public GameConfigDTO getGameConfig() {
        return gameConfig;
    }

    public List<UserInGame> getPlayers() {
        return players;
    }

    public List<String> getObservers() {
        return observers;
    }

    private GameConfigDTO gameConfig;
    private List<UserInGame> players;
    private List<String> observers;

    public GameDTO(int id, GameConfigDTO gameConfig, List<UserInGame> players, List<String> observers) {
        this.id = id;
        this.gameConfig = gameConfig;
        this.players = players;
        this.observers = observers;
    }

    @Override
    public void fromJSON() {

    }

    @Override
    public String toJSON() {
        return null;
    }
}
