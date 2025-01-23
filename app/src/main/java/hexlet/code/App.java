package hexlet.code;

import hexlet.code.game.CalcGameStrategy;
import hexlet.code.game.EvenGameStrategy;
import hexlet.code.game.GameType;
import hexlet.code.game.GreetGameStrategy;
import hexlet.code.game.GcdGameStrategy;
import hexlet.code.game.ProgressionGameStrategy;
import hexlet.code.game.PrimeGameStrategy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GameType gameType = Cli.askGameType(in);
        if (gameType == GameType.Exit) {
            return;
        }

        switch (gameType) {
            case Greet:
                GreetGameStrategy.execute(in);
                break;
            case Even:
                EvenGameStrategy.execute(in);
                break;
            case Calc:
                CalcGameStrategy.execute(in);
                break;
            case GCD:
                GcdGameStrategy.execute(in);
                break;
            case Progression:
                ProgressionGameStrategy.execute(in);
                break;
            case Prime:
                PrimeGameStrategy.execute(in);
                break;
            default:
                break;
        }
    }
}
