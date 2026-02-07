import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// terminal operations

public class FileX2_2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        // 1. Collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // 2. forEach
        list.stream().forEach(x -> System.out.println(x));

        // 3. Reduce: combines result to produce a single result
        Optional<Integer> optionalInteger = list.stream().reduce((x, y) -> x + y);
        Optional<Integer> optionalInteger2 = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());

        // 4. Count
        // another example, Terminal operations: min, max, get, count, collect

        List<Integer> collect2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        long res = collect2.stream().filter(x -> x % 2 == 0).distinct().count();
        System.out.println(res);

        // 5. anyMatch, allMatch, noneMatch
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);

        boolean b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);

        // 6. findFirst, findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

        // 7. toArray
        Object[] arr = Stream.of(1, 2, 3).toArray();

        // 8. min/ max
        System.out.println(Stream.of(2, 44, 69).max(Comparator.naturalOrder()).get());

        // 9. forEachOrdered ( when using parallel stream, want things in order)
        List<Integer> number0 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("using forEach with parallel stream");
        number0.parallelStream().forEach(System.out::println);
        System.out.println("using forEachOrdered with parallel stream");
        number0.parallelStream().forEachOrdered(System.out::println);

        // Examples

        // words greater than length 3
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());

        // squaring and sorting
        List<Integer> nums = Arrays.asList(5, 2, 9, 1, 6);
        System.out.println(nums.stream().map(x -> x * x).sorted().toList());

        // counting occurences of a character
        String sentense = "Hello world";
        System.out.println(sentense.chars().filter(x -> x == 'l').count());

        // Stream cannot be resued after a terminal operation has been called
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
        // List<String> list1 = stream.map(String::toUpperCase).toList(); // exception

    }

}
