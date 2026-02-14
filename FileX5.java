import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FileX5 { // examples of collectors
  public static void main(String[] args) {

    // example-1 collecting names by length

    List<String> l1 = Arrays.asList("Anna", "Bob", " Alexander", "Brian", "Alice");

    System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));

    // Counting word Occurrences

    String sentense = "hello world hello java world";
    System.out
        .println(Arrays.stream(sentense.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));

    // Partitioning even and odd no.

    List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    System.out.println(l2.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));

    // Summing values in a Map
    Map<String, Integer> items = new HashMap<>();
    items.put("apple", 10);
    items.put("banana", 20);
    items.put("kiwi", 30);

    System.out.println(items.values().stream().reduce(Integer::sum).get());
    System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));

    // ex-5: creating a map from Stream Elements

    List<String> fruits = Arrays.asList("Apple", "banana", "Cherry");
    System.out.println(fruits.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length())));

    // ex-6

    List<String> fruits2 = Arrays.asList("Apple", "banana", "Apple", "banana", "Cherry");
    System.out.println(fruits2.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y)));

  }

}
