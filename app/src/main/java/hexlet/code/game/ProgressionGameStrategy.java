package hexlet.code.game;

import hexlet.code.Cli;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProgressionGameStrategy {

    private static final int PROGRESSION_LENGTH = 8;
    private static final int PROGRESSION_LENGTH_FROM = 5;
    private static final int PROGRESSION_STEP = 10;

    private static Map.Entry<String, String> getTaskAndAnswer() {
        Random random = new Random();
        int length = random.nextInt(PROGRESSION_LENGTH) + PROGRESSION_LENGTH_FROM; // Длина от 5 до 12
        int start = random.nextInt(PROGRESSION_STEP) + 1; // Начало прогрессии от 1 до 10
        int step = random.nextInt(PROGRESSION_STEP) + 1;  // Шаг прогрессии от 1 до 10

        List<Integer> progression = IntStream.range(0, length)
                .map(i -> start + i * step)
                .boxed()
                .collect(Collectors.toList());

        int hiddenIndex = random.nextInt(length);
        int hiddenValue = progression.get(hiddenIndex);

        progression.set(hiddenIndex, null);

        String task = "What number is missing in the progression?\n"
                + "Question: " + progression.stream()
                .map(el -> el == null ? ".." : el.toString())
                .collect(Collectors.joining(" "));

        return Map.entry(task, String.valueOf(hiddenValue));
    }

    public static void execute(Scanner in) {
        String userName = Cli.welcomeUser(in);
        Utility.game(in, Utility.LOOP_COUNT, userName, ProgressionGameStrategy::getTaskAndAnswer);
    }
}
