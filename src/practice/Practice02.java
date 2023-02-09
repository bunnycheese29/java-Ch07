package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice02 {

  public static void main(String[] args) {
    ArrayList<Character> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
    int sum = 0;
    for (int i = 0; i < 6; i++) {
      char grade = scanner.next().charAt(0);
      arrayList.add(grade);
      if (grade == 'A') {
        sum += 4;
      } else if (grade == 'B') {
        sum += 3;
      } else if (grade == 'C') {
        sum += 2;
      } else if (grade == 'D') {
        sum += 1;
      } else if (grade == 'F') {
        sum += 0;
      }
    }
    System.out.println((double) (sum) / (double) arrayList.size());
  }
}
