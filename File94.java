import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class File94 {
  public static void main(String[] args) {

    UnaryOperator<Integer> unaryOp = x -> x * x;
    System.out.println(unaryOp.apply(5));

    BiFunction<String, String, String> biFunction = (str1, str2) -> str1 + str2;

    BinaryOperator<String> binary = (str1, str2) -> str1 + str2;
    System.out.println(binary.apply("hi", "hello"));

  }

}
