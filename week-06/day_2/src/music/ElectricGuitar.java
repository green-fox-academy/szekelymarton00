package music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {

  }

  public ElectricGuitar(int numberOfStrings) {
    this.name = "Electric Guitar";
    this.numberOfStrings = numberOfStrings;

  }

  @Override
  public String play() {
    return this.name + "a " + this.numberOfStrings + "-stringed instrument that" + sound();

  }

  @Override
  public String sound() {
    return "twangs";
  }
}
