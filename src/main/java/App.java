import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner =new Scanner(System.in);
        Game game = new Game();
        User player = new User();
        Computer computer = new Computer();

        player.makeMove();
        computer.makeMove();
//
//        game.whoWins();

    }


}

