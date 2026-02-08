/*
Paralle Stream: are most effective for CPU- intensive or large datasets where tasks are independent.


*/

import java.util.List;
import java.util.stream.Stream;

public class FileX3 {
  public static void main(String[] args) {

    long startTime = System.currentTimeMillis();
    List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
    List<Long> factorialList = list.stream().map(FileX3::factorial).toList();
    long endTime = System.currentTimeMillis();
    System.out.println("Time taken with sequential stream: " + (endTime - startTime) + " ms");

    startTime = System.currentTimeMillis();
    factorialList = list.parallelStream().map(FileX3::factorial).toList();
    // factorialList
    // =list.parallelStream().map(FileX3::factorial).sequential().toList();
    endTime = System.currentTimeMillis();
    System.out.println("Time taken with parallel stream: " + (endTime - startTime) + " ms");

  }

  public static long factorial(int n) {
    long result = 1;

    for (int i = 2; i <= n; i++) {
      result *= i;
    }
    return result;
  }

}
