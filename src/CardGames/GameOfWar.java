package CardGames;

import java.util.Scanner;

public class GameOfWar {
    public static Card[] cards = CardsArray.findAll();

    public static void main(String[] args) {
        System.out.println("Would you like to play a game?");
        wantsToContinue();
        do {
            Player player1 = new Player(0, "Player 1");
            Player player2 = new Player(0, "Player 2");
            for (int i = 1; i <= 26; i++) {
                System.out.println("Round Number: " + i);
                System.out.print(player1.name + ": ");
                Card oneCard = cards[(int) Math.floor(Math.random() * 52)];
                System.out.println(oneCard);
                System.out.print(player2.name + ": ");
                Card twoCard = cards[((int) Math.floor(Math.random() * 52))];
                System.out.println(twoCard);
                if (oneCard.value > twoCard.value){
                    player1.setGamesWon(i+1);
                    System.out.println("Player1 wins this round");
                } else if (oneCard.value < twoCard.value){
                    player2.setGamesWon(i+1);
                    System.out.println("Player2 wins this round");
                } else System.out.println("WINNER: NONE");
            }
            System.out.println();
            System.out.println("Player1 score: " + player1.gamesWon);
            System.out.println("Player2 score: " + player2.gamesWon);
            System.out.println();
            if (player1.gamesWon > player2.gamesWon){
                System.out.println("Player1 WINS!!!");
            } else if (player1.gamesWon<player2.gamesWon) {
                System.out.println("Player2 WINS!!!");
            } else {
                System.out.println("WINNER: NONE");
            }
        } while (wantsToContinue());
    }

    public static boolean wantsToContinue(){
        String playAgain;
        Scanner letter = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Press Y to continue");
        playAgain = letter.next();
        if(playAgain.equalsIgnoreCase("y") || playAgain.equalsIgnoreCase("yes")) {
            return true;
        } else return false;
    }
}
