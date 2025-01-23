package hexlet.code.game;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class GcdGameStrategy {
    private static int gcdEuclid(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static Map.Entry<String, String> getTaskAndAnswer() {
        Random random = new Random();
        int num1 = random.nextInt(100) + 1; // Случайное число от 1 до 100
        int num2 = random.nextInt(100) + 1;

        String task = "Find the greatest common divisor of given numbers.\n"
                + "Question: " + num1 + " " + num2;
        String correctAnswer = String.valueOf(gcdEuclid(num1, num2));
        return Map.entry(task, correctAnswer);
    }

    public static void execute(Scanner in, String userName) {
        Utility.game(in, 3, userName, GcdGameStrategy::getTaskAndAnswer);
    }
}
