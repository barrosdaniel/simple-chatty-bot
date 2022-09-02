import java.util.Scanner;

public class SimpleChattyBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2022.");
        System.out.println("Please, remind me your name.");
        System.out.print("> ");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }
}
