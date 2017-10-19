public class Reptile extends Animal {

  public Reptile(String name) {
    this.name = name;
  }

  @Override
  String greet() {
    return null;
  }

  @Override
  String wantChild() {
    return "want a child from an egg!";
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
