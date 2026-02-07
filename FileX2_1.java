import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FileX2_1 {
  public static void main(String[] args) {

    // Intermediate operations transform a stream into another stream
    // They are lazy, meaning they dont execute until a terminal operation is
    // invoked.

    // 1.Filter

    List<String> list = Arrays.asList("Akshit", "Ram", "Shyram", "Akshit");
    Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));

    long res = list.stream().filter(x -> x.startsWith("A")).count();
    System.out.println(res);

    // 2. map
    Stream<String> stringStream = list.stream().map(String::toUpperCase);

    // 3.sorted
    Stream<String> sortedStream = list.stream().sorted();
    Stream<String> sortedStreamUsingComparator = list.stream().sorted((a, b) -> a.length() - b.length());

    // 4. distinct

    System.out.println(list.stream().filter(x -> x.startsWith("A")).distinct().count());

    // 5. limit

    System.out.println(Stream.iterate(1, x -> x + 1).limit(100).count());

    // 6. Skip

    System.out.println(Stream.iterate(1, x -> x + 1).skip(10).limit(100).count());

    // 7.peek
    Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).count();

    // 8. Flatmap
    // Hangle streams of collections, lists, or arrays where each array is itself a
    // collection
    // Flatten nested structures (e.g lists within lists ) so that they can be
    // processed as a single sequence of elements
    // Transform and flatten elements at the same time.

    List<List<String>> listofLists = Arrays.asList(
        Arrays.asList("apple", "banana"),
        Arrays.asList("kiwi", "mango"),
        Arrays.asList("pear", "grapes"));

    System.out.println(listofLists.get(1).get(1));
    System.out.println(listofLists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList());

    List<String> sentences = Arrays.asList("Hello World", "Java Streams are powerful", "flatmap is useful");
    System.out.println(sentences
        .stream()
        .flatMap(x -> Arrays.stream(x.split(" ")))
        .map(String::toUpperCase)
        .toList());

  }

}
