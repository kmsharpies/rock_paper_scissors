import java.util.Random;

public class Computer {

    private RPS rps;

    public RPS makeMove(){

        Random random = new Random();
        int computerMove = random.nextInt(3);
        RPS computerChoice = RPS.values()[computerMove];

        return computerChoice;
    }

    public RPS getMove() {
        return rps;
    }
}
