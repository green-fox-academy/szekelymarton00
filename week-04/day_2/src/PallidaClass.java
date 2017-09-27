import java.util.ArrayList;

public class PallidaClass {

  String classname;
  ArrayList<Student> students;
  ArrayList<Mentor> mentors;
  Student student;
  Mentor mentor;


  public PallidaClass() {
    this.classname = "Pallida";

  }

  public void addStundent() {
    student = new Student();
    students.add(new Student());
  }

  public void addMentor() {
    mentor = new Mentor();
    mentors.add(new Mentor());
  }

  public void info() {
    System.out.println(mentors.size());
    System.out.println(students.size());
  }

}
