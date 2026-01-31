import java.util.function.Predicate;

public class File9 {

  public static void main(String[] args) {

    Predicate<Integer> isEven = x -> x % 2 == 0;

    Predicate<String> startsWithLetterV = x -> x.toLowerCase().charAt(0) == 'v';

    // System.out.println(startsWithLetterV.test("hello"));

    Predicate<String> endWithLetterL = x -> x.toLowerCase().charAt(x.length() - 1) == 'l';

    // Predicate<String> and = startsWithLetterV.and(endWithLetterL);// same for or
    // System.out.println(and.test("Vakul"));

    // Now suppose we dont people with name V to enter a place: use negate

    System.out.println(startsWithLetterV.negate().test("vumul"));

    // now we can do this will class as well

    Student s1 = new Student("Naman", 1);
    Student s2 = new Student("Vipul", 2);

    Predicate<Student> studentPredicate = x -> x.getId() > 1;
    System.out.println(studentPredicate.test(s2));

    // isEqual

    Predicate<Object> predicate = Predicate.isEqual(2);
    System.out.println(predicate.test(2));

  }

  private static class Student {
    String name;
    int id;

    public String getName() {
      return name;
    }

    public int getId() {
      return id;
    }

    public void setName(String name) {
      this.name = name;
    }

    public void setId(int id) {
      this.id = id;
    }

    public Student(String name, int id) {
      this.name = name;
      this.id = id;
    }

  }
}
