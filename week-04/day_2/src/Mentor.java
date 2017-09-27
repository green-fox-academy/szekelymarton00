public class Mentor extends Person {


  String level;


  public Mentor(){

  }


  public Mentor(String name, int age, String gender, String level) {
    this.name = "Jane";
    this.age = 30;
    this.gender = "female";
    this.level = "intermediate";


  }

  public void introduce() {
    System.out
        .println("Hi, I'm " + name + ", a " + age + " year old " + gender + " " +  level + " mentor.");
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
}
