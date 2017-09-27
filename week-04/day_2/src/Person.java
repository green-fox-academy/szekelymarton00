import java.util.ArrayList;

public class Person {

  String name;
  int age;
  String gender;

  public Person() {

  }

  public Person(String name, int age, String gender) {
    this.name = "Jane";
    this.age = 30;
    this.gender = "female";
  }


  public void introduce() {
    System.out.println("Hi I am " + name + " a " + age + " year old " + gender);
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }


  public static void main(String[] args) {

    ArrayList<Person> people = new ArrayList<>();

    Person mark = new Person("Mark", 46, "male");
    people.add(mark);
    Person jane = new Person("Jane", 30, "female");
    people.add(jane);
    Student john = new Student("John Doe", 20, "male", "BME");
    people.add(john);
    Student student = new Student("Jane", 30, "female", "The School of Life");
    people.add(student);
    Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
    people.add(gandhi);
    Mentor mentor = new Mentor("Jane", 30, "female", "intermediate");
    people.add(mentor);
    Sponsor sponsor = new Sponsor("Jane", 30, "female", "Google");
    Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");

    student.skipDays(3);

    for (int i = 0; i < 5; i++) {
      elon.hire();
    }
    for (int i = 0; i < 3; i++) {
      sponsor.hire();
    }

    for (Person person : people) {
      person.introduce();
      person.getGoal();
    }


  }


}