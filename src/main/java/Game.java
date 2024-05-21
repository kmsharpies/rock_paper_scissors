public class Game {

    public void whoWins(RPS playerMove, RPS computerMove) {
        if (playerMove == computerMove) {
            System.out.println("Draw!");
        } else if ((playerMove == RPS.ROCK && computerMove == RPS.SCISSORS) ||
                (playerMove == RPS.PAPER && computerMove == RPS.ROCK) ||
                (playerMove == RPS.SCISSORS && computerMove == RPS.PAPER)) {
            System.out.println("Winner! :D");
        } else {
            System.out.println("Loser.. ;_;");
        }
    }
}