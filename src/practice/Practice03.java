package practice;

import java.util.HashMap;
import java.util.Scanner;

public class Practice03 {

  public static void main(String[] args) {
    HashMap<String, Integer> nations = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("나라 이름과 이름을 입력하세요.(예: Korea 5000)");
    while (true) {
      System.out.print("나라 이름, 인구 >> ");
      String country = scanner.next();
      if (country.equals("그만")) {
        break;
      }
      int population = scanner.nextInt();
      nations.put(country, population);
    }
    while (true) {
      System.out.print("인구 검색 >> ");
      String item = scanner.next();
      if (item.equals("그만")) break;

      if (nations.get(item) == null) {
        System.out.println(item + " 나라는 없습니다.");
      } else {
        System.out.println(item + "의 인구는 " + nations.get(item));
      }
    }
    scanner.close();
  }
}
