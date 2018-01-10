package diceMaster.model.server;

import diceMaster.model.common.GameConfigDTO;
import diceMaster.model.common.GameDTO;
import diceMaster.model.common.UserType;
import diceMaster.model.gui.GameEventHandler;


import java.util.List;

public interface Server {
    boolean registerClient(String nick);
    ServerGame createGame(GameConfigDTO gameConfigDTO, GameEventHandler gameEventHandler, UserType userType);
    ServerGame joinGame(GameDTO gameDTO, GameEventHandler gameEventHandler, UserType userType);
    List<GameDTO> getGames();
}
