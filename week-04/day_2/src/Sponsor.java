public class Sponsor {

  String name;
  int age;
  String gender;
  String company;
  int hiredStudents;



  public Sponsor(){

    Sponsor Jane;
    Jane = new Sponsor();
    Jane.name = "Jane";
    Jane.age = 30;
    Jane.gender = "female";
    Jane.company = "Google";
    Jane.hiredStudents = 0;

  }

  public void introduce() {
    System.out.println("Hi, I'm" + name+ ", a " + age + "year old " + gender + "who represents" + company +  "and hired" + hiredStudents +  "students so far.");
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
  public void hire(){
    hiredStudents++;

  }

}
