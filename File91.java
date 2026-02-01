import java.util.function.Function;

public class File91 {

  public static void main(String[] args) {

    Function<Integer, Integer> fun1 = x -> x * 2;
    Function<Integer, Integer> fun2 = x -> x * x * x;

    System.out.println(fun1.andThen(fun2).apply(3)); // 216
    System.out.println(fun2.andThen(fun1).apply(3)); // 54

    System.out.println(fun1.compose(fun2).apply(3));

    Function<String, String> fun3 = Function.identity();
    System.out.println(fun3.apply("naman"));

    Function<Integer, Integer> identity = Function.identity();
    Integer res = identity.apply(5);
    System.out.println(res);

  }

}
