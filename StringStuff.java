import java.io.*;

public class StringStuff {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Hello");
    sb.reverse();
    System.out.println(sb);
    System.out.println("String Buffer capacity: " + sb.capacity());

    sb.delete(1, 3);
    System.out.println(sb);

    int len = sb.length();
    System.out.println("Length of String: " + len);
  }
}
