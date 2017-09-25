
public class Mentor {
  String name;
  int age;
  String gender;
  String level;


public Mentor(){
  Mentor Jane;
  Jane = new Mentor();
  Jane.name = "Jane";
  Jane.age = 30;
  Jane.gender = "female";
  Jane.level = "intermediate";

}
  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + "year old " + gender + level + "mentor.");
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
}
