interface A {
  default void sayHello() {
    System.out.println("A says hello");
  }
}

interface B {
  default void sayHello() {
    System.out.println("B says hello");
  }
}

public class File4 implements A, B {
  public static void main(String[] args) {

    File4 myclass = new File4();
    myclass.sayHello();

  }

  @Override
  public void sayHello() {

    A.super.sayHello();
    // B.super.sayHello();
  }

}
