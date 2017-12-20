package diceMaster.model;

import diceMaster.model.*;

import java.util.List;

public class GameDTO implements DTO {
    private int id;
    private GameConfigDTO gameConfig;
    private List<Triplet<User,Dices,Integer>> players;
    private List<User> observers;
    private int playerWithMove;

    @Override
    public void fromJSON() {

    }

    @Override
    public String toJSON() {
        return null;
    }
}
