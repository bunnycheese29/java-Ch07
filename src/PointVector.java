import java.util.Vector;

class Point {

  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "(" + x + "," + y + ")";
  }
}

public class PointVector {

  public static void main(String[] args) {
    Vector<Point> vec = new Vector<>();
    vec.add(new Point(1, 2));
    vec.add(new Point(2, 2));
    vec.add(new Point(3, 3));
    vec.remove(1); //제거하기
    System.out.println(vec.get(0));
    for (int i = 0; i < vec.size(); i++) { //길이
      System.out.println(vec.get(i)); //출력하기
    }
  }
}
