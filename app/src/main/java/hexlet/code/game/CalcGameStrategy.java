package hexlet.code.game;

import hexlet.code.Cli;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class CalcGameStrategy {


    private static Map.Entry<String, String> getTaskAndAnswer() {
        Random random = new Random();
        int num1 = random.nextInt(Utility.RANDOM_LIMIT) + 1; // Случайное число от 1 до 100
        int num2 = random.nextInt(Utility.RANDOM_LIMIT) + 1;
        String chars = "+-*";
        char op = chars.charAt(random.nextInt(chars.length())); // Выбор случайного оператора

        int result = switch (op) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            default -> throw new IllegalStateException("Unexpected operator: " + op);
        };

        String task = "What is the result of the expression?\n"
                + "Question: " + num1 + " " + op + " " + num2;
        return Map.entry(task, String.valueOf(result));
    }

    public static void execute(Scanner in) {
        String userName = Cli.welcomeUser(in);
        Utility.game(in, Utility.LOOP_COUNT, userName, CalcGameStrategy::getTaskAndAnswer);
    }
}
