//Stream
//ways to create Stream

import java.util.*;
import java.util.stream.Stream;

class FileX1 {

  public static void main(String[] args) {

    // From Collections
    List<String> list = Arrays.asList("apple", "banana", "cherry");
    Stream<String> myStream = list.stream();

    // From Arrays
    String arr[] = { "apple", "banana", "cherry" };
    Stream<String> stream = Arrays.stream(arr);

    // Using Stream.of()
    Stream<Integer> integerStream = Stream.of(1, 2, 3);

    // Infinite Streams:
    // 1. Using Iterate
    Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);

    // 2. using Generate
    Stream<Integer> limit1 = Stream.generate(() -> (int) Math.random() * 100).limit(5);
  }
}