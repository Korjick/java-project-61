package hexlet.code.game;

import hexlet.code.Cli;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class PrimeGameStrategy {
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static Map.Entry<String, String> getTaskAndAnswer() {
        Random random = new Random();
        int num = random.nextInt(100) + 1; // Случайное число от 1 до 100
        boolean isPrime = isPrime(num);

        String task = "Answer \"yes\" if given number is prime. Otherwise answer \"no\".\n"
                + "Question: " + num;
        String correctAnswer = isPrime ? "yes" : "no";

        return Map.entry(task, correctAnswer);
    }

    public static void execute(Scanner in) {
        String userName = Cli.welcomeUser(in);
        Utility.game(in, 3, userName, PrimeGameStrategy::getTaskAndAnswer);
    }
}
