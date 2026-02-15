import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Practise {

  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

    List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).limit(2)
        .collect(Collectors.toList());
    System.out.println(filteredList);

  }
}