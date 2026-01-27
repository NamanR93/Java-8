
// Funtional Interface.
public class File2 {

  @FunctionalInterface
  public interface myInterface {

    public void sayHello();

    public static void sayBye() {

    }

    default void someWork() {

    }
  }
}
