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
        GameType gameType = Cli.askGameType(in);
        if (gameType == GameType.Exit) {
            return;
        }
        String userName = Cli.welcomeUser(in);
        switch (gameType) {
            case Even -> EvenGameStrategy.execute(in, userName);
            case Calc -> CalcGameStrategy.execute(in, userName);
            case GCD -> GcdGameStrategy.execute(in, userName);
            case Progression -> ProgressionGameStrategy.execute(in, userName);
            case Prime -> PrimeGameStrategy.execute(in, userName);
            default -> {
            }
        }
    }
}
