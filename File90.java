import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class File90 {

  public static void main(String[] args) {

    Function<String, Integer> func = x -> x.length();
    // System.out.println(func.apply("naman"));

    Function<String, String> f2 = s -> s.substring(0, 4);
    // System.out.println(f2.apply("naman"));

    Function<List<Student>, List<Student>> studentWithVipAsPrefix = li -> {

      List<Student> result = new ArrayList<>();
      for (Student s : li) {
        if (f2.apply(s.getName()).equalsIgnoreCase("vip")) {
          result.add(s);
        }
      }
      return result;
    };

    Student s1 = new Student("Vipul", 2);
    Student s2 = new Student("Vipulav", 2);
    Student s3 = new Student("Arnav", 2);

    List<Student> students = Arrays.asList(s1, s2, s3);
    List<Student> filteredStudents = studentWithVipAsPrefix.apply(students);
    System.out.println(filteredStudents);

  }

  private static class Student {
    String name;
    int id;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public Student(String name, int id) {
      this.name = name;
      this.id = id;
    }

    @Override
    public String toString() {
      return "Student [name=" + name + ", id=" + id + "]";
    }

  }

}
