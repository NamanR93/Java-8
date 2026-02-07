import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileX2 {

        public static void main(String[] args) {

                List<Integer> list = Arrays.asList(1, 2, 3, 4, 12, 0, 33, 44, 1234, 56, 77, 0, 1, 2);

                List<Integer> filteredList = list.stream()
                                .filter(x -> x % 2 == 0)
                                .collect(Collectors.toList());

                System.out.println(filteredList);

                List<Integer> newList = filteredList
                                .stream()
                                .map(x -> x / 2)
                                .collect(Collectors.toList());
                System.out.println(newList);

                // we can apply map to filtered list directly.
                // distinct() to get distince value
                // sorted(), limit(), skip(), collect()

                List<Integer> filteredList2 = list.stream()
                                .filter(x -> x % 2 == 0)
                                .map(x -> x / 2)
                                .distinct()
                                .sorted((a, b) -> (b - a))
                                .limit(4)
                                .skip(1)
                                .collect(Collectors.toList());
                System.out.println(filteredList2);

                // another example

                List<Integer> collect = Stream.iterate(0, x -> x + 1)
                                .limit(101)
                                .skip(1)
                                .filter(x -> x % 2 == 0)
                                .map(x -> x / 10)
                                .distinct()
                                .sorted()
                                .peek(x -> System.out.println(x))
                                .collect(Collectors.toList());

                System.out.println(collect);

        }

}
