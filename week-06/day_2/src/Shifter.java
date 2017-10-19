public class Shifter implements CharSequence {

  String s2;
  int shift;

  public Shifter(String s2,int shift){
    this.s2 = s2;
    this.shift = shift;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return s2.charAt(this.s2.length() - shift);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
