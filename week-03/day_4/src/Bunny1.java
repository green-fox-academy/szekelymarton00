public class Bunny1 {

  public static void main(String[] args) {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    System.out.println(Bunny(10));

  }
  static int Bunny(int n){
    if (n == 0)
      return 0;
    else
      return 2 + Bunny(n - 1);
    }
  }


