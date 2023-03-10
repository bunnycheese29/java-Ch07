package practice;

import java.util.Scanner;
import java.util.Vector;

public class Practice01 {

  public static void main(String[] args) {
    Vector<Integer> vec = new Vector<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("정수(-1이 입력될 때까지)");

    while (true) {
      int n = scanner.nextInt();
      if (n == -1) {
        break;
      }
      vec.add(n);
      int max = vec.get(0);
      for (int i = 0; i < vec.size(); i++) {
        if (vec.get(i) > max) {
          max = vec.get(i);
        }
      }
      System.out.println("가장 큰 수는 " + max);
    }
  }
}
