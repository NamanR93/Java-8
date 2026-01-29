public class File6 {

  interface Employee {
    String getName();
  }

  public static void main(String[] args) {

    Employee sde = () -> "Soft Engineer";
    System.out.println(sde.getName());

    Employee editor = () -> "Editor";
    System.out.println(editor.getName());

  }

}
