import java.util.Vector;

/**
 * VectorEx
 */
public class VectorEx {

  public static void main(String[] args) {
    Vector<Integer> vec = new Vector<Integer>();
    vec.add(1);
    vec.add(2);
    vec.add(3);
    System.out.println(vec.size()); //3
    vec.add(0, 30); //0번에 30 끼워넣기
    System.out.println(vec.get(0)); //30 /숫자 불러오기
    for (int i = 0; i < vec.size(); i++) {
      int num = vec.get(i); //언박싱
      System.out.print(num + " ");
    }
  }
}
