package hexlet.code;

import hexlet.code.game.CalcGameStrategy;
import hexlet.code.game.EvenGameStrategy;
import hexlet.code.game.GameType;
import hexlet.code.game.GcdGameStrategy;
import hexlet.code.game.ProgressionGameStrategy;
import hexlet.code.game.PrimeGameStrategy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GameType gameType = (args.length > 0) ? GameType.values()[Integer.parseInt(args[0])] : Cli.askGameType(in);
        if (gameType == GameType.Exit) {
            return;
        }
        String userName = (args.length > 1) ? args[1] : Cli.welcomeUser(in);
        switch (gameType) {
            case Even:
                EvenGameStrategy.execute(in, userName);
                break;
            case Calc:
                CalcGameStrategy.execute(in, userName);
                break;
            case GCD:
                GcdGameStrategy.execute(in, userName);
                break;
            case Progression:
                ProgressionGameStrategy.execute(in, userName);
                break;
            case Prime:
                PrimeGameStrategy.execute(in, userName);
                break;
            default:
                break;
        }
    }
}
