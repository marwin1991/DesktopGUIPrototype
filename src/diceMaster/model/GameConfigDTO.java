package diceMaster.model;

import diceMaster.model.DTO;

public class GameConfigDTO implements DTO {
    private String tabelName;
    private int maxPlayers;
    private GameType gameType;
    private int hardBotsCount;
    private int easyBotsCount;

    public GameConfigDTO(String tabelName, int maxPlayers, GameType gameType, int hardBotsCount, int easyBotsCount) {
        this.tabelName = tabelName;
        this.maxPlayers = maxPlayers;
        this.gameType = gameType;
        this.hardBotsCount = hardBotsCount;
        this.easyBotsCount = easyBotsCount;
    }

    public String getTabelName() {
        return tabelName;
    }

    public void setTabelName(String tabelName) {
        this.tabelName = tabelName;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public int getHardBotsCount() {
        return hardBotsCount;
    }

    public void setHardBotsCount(int hardBotsCount) {
        this.hardBotsCount = hardBotsCount;
    }

    public int getEasyBotsCount() {
        return easyBotsCount;
    }

    public void setEasyBotsCount(int easyBotsCount) {
        this.easyBotsCount = easyBotsCount;
    }

    @Override
    public void fromJSON() {

    }

    @Override
    public String toJSON() {
        return null;
    }
}
