package CardGames;

public class Player {
    protected int gamesWon;
    protected String name;
    public Player(int gamesWon, String name) {
        this.gamesWon = gamesWon;
        this.name = name;
    }
    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }
}
