//원하는 타입 지정하기 type E

class GenericClass<E> {

  private E element;

  public E getElement() {
    return this.element;
  }

  public void setElement(E element) {
    this.element = element;
  }
}

public class GenericEx {

  public static void main(String[] args) {
    GenericClass<String> aa = new GenericClass<>();
    GenericClass<Integer> bb = new GenericClass<>();
    aa.setElement("나는 스트링");
    bb.setElement(10);
  }
}
