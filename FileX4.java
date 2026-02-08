import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

class FileX4 {

  // Collectors
  public static void main(String[] args) {

    List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
    List<String> res = names.stream()
        .filter(x -> x.startsWith("A"))
        .collect(Collectors.toList());
    System.out.println(res);

    // 2. Collecting to a Set

    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 4);
    Set<Integer> set = nums.stream().collect(Collectors.toSet());
    System.out.println(set);

    // 3. collecting to a Specific Collection

    ArrayDeque<String> deque = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));

    // 4. Joining Strings

    String concatenedNames = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
    System.out.println(concatenedNames);

    // 5. summarizing Data
    // Generated statical summary (count, sum, min, average, max)

    List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11);
    IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x -> x));

    System.out.println("Count: " + stats.getCount());
    System.out.println("Count: " + stats.getSum());
    System.out.println("Count: " + stats.getMin());
    System.out.println("Count: " + stats.getAverage());
    System.out.println("Count: " + stats.getMax());

    // 6. calculating Average

    Double average = numbers.stream().collect(Collectors.averagingInt(x -> x));
    System.out.println("Average: " + average);

    // 7. Counting Elements

    Long count = numbers.stream().collect(Collectors.counting());
    System.out.println(count);

    // 8. Counting elements

    List<String> words = Arrays.asList("hello", "world", "java", "streams", "collecting");
    System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
    System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));
    System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
    TreeMap<Integer, Long> treeMap = words.stream()
        .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
    System.out.println(treeMap);

    // 9. partitioning elements
    // Partitions elements into two groups (true and false) based on a performance

    System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));

    // 10. Mapping and Collecting
    // Applies a mapping function before collecting

    System.out.println(words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));

    // 11. toMap: see fileX5: ex-5

  }
}