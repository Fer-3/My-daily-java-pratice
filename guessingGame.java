import java.util.Scanner;
import java.util.Random;

public class guessingGame{
  public static void main(String[]args){

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int guess;
    int attempts;
    int randomNumber = random.nextInt(1, 4);

    System.out.println("Number Guessing Game");
    System.out.print("Guess a number between 1-4: "); 

    do{
      System.out.println("Enter guess: ");
      guess = scanner.nextInt();
      attempts++;
    }while(guess != randomNumber && attempts != 3);

    System.out.println("You have won");
  }
}
