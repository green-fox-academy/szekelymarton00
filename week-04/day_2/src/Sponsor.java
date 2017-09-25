public class Sponsor {

  String name;
  int age;
  String gender;
  String company;
  int hiredStudents = 0;


  public Sponsor(String name, int age, String gender, String company) {

  }

  public void introduce() {
    System.out.println(
        "Hi, I'm" + name + ", a " + age + "year old " + gender + "who represents" + company
            + "and hired" + hiredStudents + "students so far.");
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public void hire() {
    hiredStudents++;

  }

}
