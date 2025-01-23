package hexlet.code.game;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class EvenGameStrategy {
    private static Map.Entry<String, String> getTaskAndAnswer() {
        Random random = new Random();
        int num = random.nextInt(100) + 1; // Случайное число от 1 до 100
        boolean isEven = num % 2 == 0;
        String task = "Answer \"yes\" if the number is even, otherwise answer \"no\".\n"
                + "Question: " + num;
        String correctAnswer = isEven ? "yes" : "no";
        return Map.entry(task, correctAnswer);
    }

    public static void execute(Scanner in, String userName) {
        Utility.game(in, 3, userName, EvenGameStrategy::getTaskAndAnswer);
    }
}
