public class Student {

  String name;
  int age;
  String gender;
  String previousOrganization;
  int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {

  }

  public void introduce() {
    System.out.println(
        "Hi I am " + name + " a " + age + " year old " + gender + "from " + previousOrganization
            + "who skipped" + skippedDays + "days from the course already.");
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }


  public void skipDays(int numberOfDays) {
    numberOfDays++;
  }


}
