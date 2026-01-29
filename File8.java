import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class File8 {
  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(6);
    list.add(0);
    list.add(99);
    list.add(1);

    Collections.sort(list, (a, b) -> b - a);
    System.out.println(list);

    Student s1 = new Student(2, "numun");
    Student s2 = new Student(3, "Raj");
    Student s3 = new Student(33, "Akshit");

    List<Student> li = new ArrayList<>();
    li.add(s1);
    li.add(s2);
    li.add(s3);

    Collections.sort(li, (a, b) -> (b.id - a.id));
    System.out.println(li);
  }

}

class Student {
  public Integer id;
  public String name;

  public Student(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public String toString() {
    return this.id + " : " + this.name;
  }
}
