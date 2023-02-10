import java.util.HashMap;
import java.util.Scanner;

class Student {

  private int id;
  private String tel;

  public int getId() {
    return this.id;
  }

  public String getTel() {
    return this.tel;
  }

  public Student(int id, String tel) {
    this.id = id;
    this.tel = tel;
  }
}

public class HashMapStudentEx {

  public static void main(String[] args) {
    HashMap<String, Student> studentMap = new HashMap<>();
    studentMap.put("황기태", new Student(1, "010-1111-2222"));
    studentMap.put("이재문", new Student(2, "010-2222-3333"));
    studentMap.put("김남진", new Student(3, "010-3333-4444"));
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("검색 할 이름을 쓰세요.");
      String name = scanner.nextLine();
      Student student = studentMap.get(name);
      if (student == null) {
        System.out.println("없는 학생입니다.");
      } else {
        System.out.println(
          "id : " + student.getId() + " tel : " + student.getTel()
        );
      }
      scanner.close();
    }
  }
}
