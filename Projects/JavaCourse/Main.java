import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        // clear up the next()
        scanner.nextLine();

        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age+" years old.");
        System.out.println("You like "+ food);
    }
}
