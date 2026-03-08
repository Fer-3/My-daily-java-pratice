import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
  public static void main(String[] args) {
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
      writer.write("Writing to a file.");
      writer.write("\nWriting again to a file");

      String[] names = {"James", "Harry", "Jerry"};

      for (String name : names) {
        writer.write("\n" + name);
      }

      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
