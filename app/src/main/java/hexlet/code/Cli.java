package hexlet.code;

import hexlet.code.game.GameType;

import java.util.Scanner;

public class Cli {

    public static GameType askGameType(Scanner in) {
        GameType[] gameTypeValues = GameType.values();
        System.out.println("Please enter the game number and press Enter.");
        for (GameType gameType : gameTypeValues) {
            if (gameType.ordinal() == 0) {
                continue;
            }
            System.out.println(gameType.ordinal() + " - " + gameType.name());
        }
        System.out.println(gameTypeValues[0].ordinal() + " - " + gameTypeValues[0].name());
        System.out.print("Your choice: ");
        return gameTypeValues[Integer.parseInt(in.nextLine())];
    }

    public static String welcomeUser(Scanner in) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = in.nextLine();
        System.out.printf("Hello, %s!\n", userName);
        return userName;
    }
}
