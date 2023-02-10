package practice;

import java.util.Scanner;
import java.util.Vector;

public class Practice04 {

  public static void main(String[] args) {
    Vector<Integer> vec = new Vector<>();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("강수량 입력 (0 입력시 종료)>>");
      int n = scanner.nextInt();
      if (n == 0) break;
      vec.add(n);
      int sum = 0;
      for (int i = 0; i < vec.size(); i++) {
        System.out.print(vec.get(i) + " ");
        sum += vec.get(i);
      }
      System.out.println("\n현재 평균 " + (double) sum / (double) vec.size());
    }
  }
}
