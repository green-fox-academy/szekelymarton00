package music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {

  }

  public BassGuitar(int numberOfStrings) {
    this.name = "Bass Guitar";
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public String play() {
    return this.name + "a " + this.numberOfStrings + "-stringed instrument that" + sound();
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";

  }
}
