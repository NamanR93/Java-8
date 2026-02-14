import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class FileX6 {
  public static void main(String[] args) {

    int nums[] = { 1, 2, 3, 4, 5 };

    IntStream stream = Arrays.stream(nums);

    System.out.println(IntStream.range(1, 5).boxed().collect(Collectors.toList()));
    System.out.println(IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList()));

    IntStream.of(1, 2, 3, 4);

    DoubleStream doubles = new Random().doubles(5);
    // System.out.println(doubles.sum());
    System.out.println(doubles.min());
    System.out.println(doubles.max());
    System.out.println(doubles.average());
    doubles.summaryStatistics();
    doubles.mapToInt(x -> (int) x + 1);
    System.out.println(doubles.boxed().toList());

    IntStream ints = new Random().ints(5);
    System.out.println(ints.boxed().toList());

  }

}
