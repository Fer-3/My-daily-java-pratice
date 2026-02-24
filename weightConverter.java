import java.util.Scanner;

public class weightConverter {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double weight;
    double newWeight;
    int choice;

    System.out.println("Weight Converter Program");
    System.out.println("1. Convert lbs to kgs");
    System.out.println("2. Convert kgs to lbs");

    System.out.print("Choose an option: ");
    choice = scanner.nextInt();

    switch (choice) {
    case 1:
      System.out.print("Enter weight in pounds: ");
      weight = scanner.nextDouble();
      newWeight = weight * 0.45359237;
      System.out.println("It is " + newWeight + " kilograms");
      break;

    case 2:
      System.out.print("Enter weight in kilograms: ");
      weight = scanner.nextDouble();
      newWeight = weight * 2.20462262;
      System.out.println("It is " + newWeight + " pounds");
      break;

    default:
      System.out.println("This is not an option");
      break;
    }
  }
}
