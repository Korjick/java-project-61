package hexlet.code.game;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Supplier;

public class Utility {
    private static boolean askAndAnswer(Scanner in, String playerName, String task, String correctAns) {
        System.out.println(task);
        System.out.print("Your answer: ");
        String ans = in.next();

        if (ans.equals(correctAns)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + ans + "' is wrong answer ;(. Correct answer was '" + correctAns + "'.");
            System.out.println("Let's try again, " + playerName + "!");
            return false;
        }
    }

    public static void game(Scanner in, int playCount, String playerName,
                            Supplier<Map.Entry<String, String>> taskAndCorrectAnsFun) {
        for (int i = 0; i < playCount; i++) {
            Map.Entry<String, String> taskAndAnswer = taskAndCorrectAnsFun.get();
            String task = taskAndAnswer.getKey();
            String correctAns = taskAndAnswer.getValue();

            boolean result = askAndAnswer(in, playerName, task, correctAns);
            if (!result) {
                return;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
    }
}
