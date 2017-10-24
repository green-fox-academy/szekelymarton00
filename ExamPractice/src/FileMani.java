import java.util.ArrayList;

public class FileMani {

  public static void main(String[] args) {
    ReadFile mything = new ReadFile();
    mything.ReadFile("myfile.txt");

    AddToFile MyOtherThing = new AddToFile();
    MyOtherThing.appendToFile("myfile.txt", "\nhi all I am Marci");

    mything.ReadFile("myfile.txt");
    ArrayList<String> myArraylist = new ArrayList<>();

    AddToArrayList myAdd = new AddToArrayList();
    myAdd.addToArray(myArraylist,"hi");
    System.out.println(myArraylist.toString());


  }
}



