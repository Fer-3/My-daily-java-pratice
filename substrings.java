import java.util.Scanner;

public class substrings {

  public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    String email;
    String username;
    String domain;

    System.out.print("Enter your email: ");
    email = scanner.next();
    username = email.substring(0, email.indexOf("@"));
    domain = email.substring(email.indexOf("@") + 1);

    System.out.println(username);
    System.out.println(domain);

    scanner.close();
  }
}
