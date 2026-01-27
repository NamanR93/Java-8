@FunctionalInterface
public interface Child extends Parent {
  // public void sayBye(); -- if this then not Child not functional Interface.

  public void sayHello(); // for same method, yes it is.

  default void bye() { // doesnt effect

  }

}
