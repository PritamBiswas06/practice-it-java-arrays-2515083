import java.util.*;

public class App1 {
  public static void main(String[] args) {
    int[] arr = new int[] { 10, 20, 30, 40, 50 };
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    System.out.println();

    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.println(arr[i]);
    }
    System.out.println();

    for (int item : arr) {
      System.out.println(item);
    }
    System.out.println();

    Arrays.stream(arr).forEach(System.out::println);
    // Arrays.stream(arr).filter();
    // Arrays.stream(arr).average();
    // Arrays.stream(arr).sum()
  }

}
