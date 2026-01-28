
interface Parent {
  default void sayHello() {
    System.out.println("hello");
  }
}

class Child implements Parent {

  // we can override as well
  public void sayHello() {
    System.out.println("chidl says hello");
  }

}

public class File3 {
  public static void main(String[] args) {

    Child c = new Child();
    c.sayHello();

    // Parent p = new Parent(); we cant do this.
    Parent c1 = new Child();
    c1.sayHello();
  }

}
