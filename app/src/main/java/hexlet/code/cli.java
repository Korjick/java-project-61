package hexlet.code;

import java.util.Scanner;

public class cli {
    public static void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = in.next();
        System.out.printf("Hello, %s!", name);
    }
}
