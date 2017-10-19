public class Mammal extends Animal {

  public Mammal(String name) {
    this.name = name;
  }

  @Override
  String greet() {
    return null;
  }

  @Override
  String wantChild() {
    return "want a child from my uterus!";
  }

  @Override
  boolean hungry() {
    return false;
  }

  @Override
  String getName() {
    return this.name;
  }
}
