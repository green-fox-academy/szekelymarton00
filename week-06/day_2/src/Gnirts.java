public class Gnirts implements CharSequence {


  private String s1;

  public Gnirts(String s1){
    this.s1 = s1;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return s1.charAt(this.s1.length() - 2);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

  public static void main(String[] args) {
    Gnirts g = new Gnirts("example");
    System.out.println(g.charAt(1));

    Shifter s = new Shifter("example", 2);
    System.out.println(s.charAt(0));
  }
}
