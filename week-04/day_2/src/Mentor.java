public class Mentor {

  String name;
  int age;
  String gender;
  String level;


  public Mentor(String name, int age, String gender, String level) {

  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + "year old " + gender + level + "mentor.");
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
}
