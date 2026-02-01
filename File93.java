import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class File93 {

  public static void main(String[] args) {

    Predicate<Integer> predicate = x -> x % 2 == 0;

    BiPredicate<Integer, Integer> bipred = (x, y) -> x % 2 == 0 && y % 2 == 0;
    System.out.println(bipred.test(2, 4));

    BiPredicate<String, Integer> biPred = (str, x) -> str.length() == x;
    System.out.println(biPred.test("numun", 4));

    Function<String, Integer> biFun = str -> str.length();
    System.out.println(biFun.apply("naman"));

    BiFunction<String, String, Integer> biFunc = (x, y) -> x.length() + y.length();
    System.out.println(biFunc.apply("hi", "hello"));

    BiConsumer<Integer, Integer> biConsumer = (x, y) -> {
      System.out.println(x + y);
    };
    biConsumer.accept(4, 5);

  }

}
