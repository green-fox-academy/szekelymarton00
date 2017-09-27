public class Sponsor extends Person {


  String company;
  int hiredStudents;

  public Sponsor(){

  }


  public Sponsor(String name, int age, String gender, String company) {
    this.name = "Jane";
    this.age = 30;
    this.gender = "female";
    this.company = "Google";
    this.hiredStudents = 0;

  }

  public void introduce() {
    System.out.println(
        "Hi, I'm" + name + ", a " + age + " year old " + gender + " who represents " + company
            + " and hired " + hiredStudents + " students so far.");
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public void hire() {
    hiredStudents++;

  }

}
