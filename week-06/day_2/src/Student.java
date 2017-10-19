public class Student implements Cloneable {

  String name;
  int age;

  public static void main(String[] args) {
    Student john = new Student("John", 22);
    Student anotherJohn = john.clone();

    System.out.println(john.age + " " + john.name);
    System.out.println(anotherJohn.age + " " + anotherJohn.name);

  }

  public Student(String name, int age) {
    this.name = name;
    this.age = age;

  }

  @Override
  public Student clone(){
    return new Student(this.name,this.age);
  }
}