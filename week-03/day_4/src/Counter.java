public class Counter {

  public static void main(String[] args) {

    System.out.println(CountDown(9));

  }

  static int CountDown(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n + CountDown(n - 1);
    }
  }
}


