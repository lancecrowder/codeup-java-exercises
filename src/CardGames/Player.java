package CardGames;

public class Player {
    protected int gamesWon;
    protected String name;

    public Player(int gamesWon, String name) {
        this.gamesWon = gamesWon;
        this.name = name;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
