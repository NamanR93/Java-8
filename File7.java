public class File7 {

  public static void main(String[] args) {

    Runnable runnable = () -> {
      for (int i = 1; i <= 10; i++) {
        System.out.println("hello" + i);
      }
    };

    Thread th = new Thread(runnable);
    th.run();
  }

}
