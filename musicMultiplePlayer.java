
import java.util.*;
import java.io.*;
import java.util.Scanner;
import javax.sound.sampled.*;

public class musicMultiplePlayer{

  static Stack<Clip> clips = new Stack<>();
 
  public static void main(String[]args){

    Scanner scan = new Scanner(System.in);
    System.out.print("File path: ");
    String filepath = "/home/fer/Music/freesound_community-random-wave-42704-52850.wav";
    File file = new File(filepath);

    try(Scanner scanner = new Scanner(System.in);
    AudioInputStream  as = AudioSystem.getAudioInputStream(file)){

      AudioInputStream aS = AudioSystem.getAudioInputStream(file);
      aS.equals(as);

      Clip clip = AudioSystem.getClip();
      clip.open(as);
      clips.push(clip);
      clips.lastElement().start();

      Clip newClip = AudioSystem.getClip();

      String response = "";
      String newfilepath;

      while (!response.equals("Q")) { 

        System.out.print("File path: ");
        newfilepath = scanner.next();
        file = new File(newfilepath);
        aS = AudioSystem.getAudioInputStream(file);

        if (!filepath.equals(newfilepath)){
          clips.lastElement().stop();
          newClip = clips.pop();
        }

        System.out.println("P = Play");
        System.out.println("S = Stop");
        System.out.println("R = Rest");
        System.out.println("L = Play last audio");
        System.out.println("Q = Quit");
        System.out.print("You can enter your choice: ");

 
        response = scanner.next().toUpperCase();

        switch (response) {
          case "P" -> clips.lastElement().start();
          case "S" -> clips.lastElement().stop();
          case "R" -> clips.lastElement().setMicrosecondPosition(0);
          case "L" -> newClip.start();
          case "Q" -> clips.lastElement().close();
          default -> System.out.print("That's not an option");
        }
      }
      scanner.close();
 
    } catch (IOException e){
      System.out.println("There was an error");
    } catch (UnsupportedAudioFileException e){
      System.out.println("Unsupported audio file");
    } catch (LineUnavailableException e){
      System.out.println("Line is unavailable expection");
    }
  }
}
