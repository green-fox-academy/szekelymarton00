package music;

public class Violin extends StringedInstrument {

  public Violin() {
    this.name = "Violin";
    this.numberOfStrings = 4;
  }

  @Override
  public String play() {
    return this.name + "a " + this.numberOfStrings + "-stringed instrument that" + sound();
  }

  @Override
  public String sound() {
    return "screeches";

  }
}
