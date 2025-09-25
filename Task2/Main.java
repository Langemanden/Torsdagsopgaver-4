import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please type your name");

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.println("Hello " + name + ". Please type your age");

        // 2.f: Læs alderen fra brugeren
        int age = input.nextInt();

        System.out.println("You are " + age + " years old.");

        int yearsUntilRetirement = 67 - age;
        System.out.println("You have " + yearsUntilRetirement + " years until retirement.");

        input.close(); 
    }
}
