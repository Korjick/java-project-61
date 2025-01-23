package hexlet.code.game;

import hexlet.code.Cli;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class EvenGameStrategy {
    private static Map.Entry<String, String> getTaskAndAnswer() {
        Random random = new Random();
        int num = random.nextInt(Utility.RANDOM_LIMIT) + 1; // Случайное число от 1 до 100
        boolean isEven = num % 2 == 0;
        String task = "Answer 'yes' if the number is even, otherwise answer 'no'.\n"
                + "Question: " + num;
        String correctAnswer = isEven ? "yes" : "no";
        return Map.entry(task, correctAnswer);
    }

    public static void execute(Scanner in) {
        String userName = Cli.welcomeUser(in);
        Utility.game(in, Utility.LOOP_COUNT, userName, EvenGameStrategy::getTaskAndAnswer);
    }
}
