1. Play the card game of “War”
Make it two player. You can have Player vs. computer or computer1 vs. computer2

- Make a new package called card-games
- Inside, make the following classes:
   - Make a player class called Player.java
       - add a gamesWon count field for the number of games won
       - add a name property and set the name with the constructor
   - Make a card class inside Card.java that has suit and value
   - Make a file called CardsArray.java. (Like the MoviesArray.java) It should have 52 different lines creating playing card objects. The array of objects should be returned by calling a method called .getAllCards()
   - Make a class called GameOfWar.java
       The game should play 26 rounds, sum up each won game for each player. Then output the winning player.