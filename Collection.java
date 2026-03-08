import java.util.ArrayList;
import java.util.Collections;

public class Collection {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Apple");
    list.add("Banana");
    Collections.addAll(list, "Mango", "Grapes");
    System.out.println("After Adding: " + list);

    list.remove("Banana");
    list.remove(0);
    System.out.println("After Removing: " + list);

    list.set(0, "Orange");
    System.out.println("After Updating: " + list);

    list.add("DragonFruit");
    Collections.sort(list);

    System.out.println("Sorted list: " + list);
  }
}
