interface A {
  static void sayHello() {
    System.out.println("hello!!");
  }
}

public class File5 implements A {
  public static void main(String[] args) {

    File5 myObj = new File5();

    A.sayHello();

  }

}
