import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
   
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1; 
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess(); 
    }

    private static void makeAGuess(){
     
        Scanner input = new Scanner(System.in);


        if (input.hasNextDouble()) {
 
            int guess = (int) input.nextDouble();


            if (guess == rnd_number) {
                System.out.println("Congratulations! You guessed the number: " + rnd_number);
            } else {
                
                if (guess < rnd_number) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
                makeAGuess(); 
            }
        } else {
      
            System.out.println("That's not a valid number! Try again.");
            input.next(); 
            makeAGuess(); 
        }
    }
}
