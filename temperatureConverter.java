import java.util.Scanner;

public class temperature {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double temperature;
    double newTemperature;
    int choice;

    System.out.println("Temperature Conversion Program");
    System.out.println("Celsius to Fahrenheit is 1");
    System.out.println("Fahrenheit to Celsius is 2");
    System.out.print("Choice: ");
    choice = scanner.nextInt();

    switch (choice) {
    case 1:
      System.out.print("What temperature is it in celsius: ");
      temperature = scanner.nextDouble();
      newTemperature = (temperature * 1.8) + 32;
      System.out.println("It is " + newTemperature + " f ");
      break;

    case 2:
      System.out.print("What temperature is it in fahrenheit: ");
      temperature = scanner.nextDouble();
      newTemperature = (temperature - 32) * 5 / 9;
      System.out.println("It is " + newTemperature + " c ");
      break;

    default:
      System.out.println("Not an option");
      break;
    }
  }
}
