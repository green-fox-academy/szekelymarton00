public class NumberAdder {

  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    System.out.println(Addn(10));
  }
  static int Addn(int n){
    if (n == 0){
      return 0;
    } else{
      return  Addn(n - 1) + n;
    }
  }

}
