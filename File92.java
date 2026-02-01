import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class File92 {

  public static void main(String[] args) {

    Consumer<String> consumer = s -> System.out.println(s);
    // consumer.accept("naman");

    Consumer<List<Integer>> listConsumer1 = li -> {
      for (Integer i : li) {
        System.out.println(i + 100);
      }
    };

    // listConsumer1.accept(Arrays.asList(1, 2, 3, 4));

    Consumer<List<Integer>> listConsumer2 = li -> {
      for (Integer i : li) {
        System.out.println(i);
      }
    };
    Consumer<List<Integer>> listConsumer = listConsumer2.andThen(listConsumer1);
    listConsumer.accept(Arrays.asList(1, 2, 3, 4));

    // Supplier

    Supplier<Integer> supplier = () -> 1;
    System.out.println(supplier.get());

  }

}
