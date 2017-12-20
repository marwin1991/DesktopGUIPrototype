package diceMaster.model;

        import java.util.List;

public interface Server {
    boolean registerClient(String nick, GamesTableEventHandler gamesTableEventHandler);
    boolean registerClient(String nick);
    ServerGame createGame(GameConfigDTO gameConfigDTO, GameEventHandler gameEventHandler, UserType userType);
    ServerGame joinGame(GameDTO gameDTO, GameEventHandler gameEventHandler, UserType userType);
    List<GameDTO> getGames();
}
