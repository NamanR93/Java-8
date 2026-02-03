import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class File95 {

  public static void main(String[] args) {

    // Method refernce
    List<String> student = Arrays.asList("Naman", "Ashim", "Harsh");
    // student.forEach(x -> System.out.println(x));

    student.forEach(System.out::println);

    // Constructor reference
    List<String> names = Arrays.asList("A", "B", "C");
    // List<MobilePhone> mobilePhone = names.stream().map(x -> new
    // MobilePhone(x)).collect(Collectors.toList());

    List<MobilePhone> mobilePhone = names.stream().map(MobilePhone::new).collect(Collectors.toList());

  }

}

class MobilePhone {
  String name;

  public MobilePhone(String name) {
    this.name = name;
  }

}
