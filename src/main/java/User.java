import java.util.Scanner;

public class User {

    private RPS rps;

    public void makeMove(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rock, paper, or scissors?");
        String playerMove = scanner.next();
        RPS playerChoice = RPS.valueOf(playerMove);

    }

    public RPS getMove(){
        return rps;
    }
}
