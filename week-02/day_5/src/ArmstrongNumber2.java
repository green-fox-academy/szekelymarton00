import java.util.ArrayList;

public class ArmstrongNumber2 {

  //n = dkk + dk-1k + ... + d2k + d1k.

  public static void main(String[] args) {

    int n = 54;
    String total2 = String.valueOf(n);
    ArrayList<Integer> k = new ArrayList<>();

    k.add(total2.length());
    int total3 = Integer.valueOf(total2);
    double result = Math.pow(n, total3);


  }
}
