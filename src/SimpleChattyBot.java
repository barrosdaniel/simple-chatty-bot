import java.util.Scanner;

public class SimpleChattyBot {
    final static Scanner scanner = new Scanner(System.in);

    static void displayGreeting(String name, String year) {
        System.out.println("Hello! My name is " +  name + ".");
        System.out.println("I was created in " + year + ".");
    }

    static void displayName() {
        System.out.println("Please, remind me your name.");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void displayAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and" +
                " 7.");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to " +
                "start programming!");
    }

    static void displayCount() {
        System.out.println("Now I will prove to you that I can count to any " +
                "number you want.");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i + "!");
        }
    }

    static void testKnowledge() {
        System.out.println("Let's test your programming knowledge.\n" +
                "Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        int response = scanner.nextInt();
        if (response != 2) {
            System.out.println("Please, try again.");
            testKnowledge();
        } else {
            System.out.println("Congratulations, have a nice day!");
        }
    }

    public static void main(String[] args) {
        displayGreeting("Aid", "2002");
        displayName();
        displayAge();
        displayCount();
        testKnowledge();
    }
}
