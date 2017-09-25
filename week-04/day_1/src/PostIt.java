public class PostIt {

  //  Create a PostIt class that has
//      a backgroundColor
//      a text on it
//      a textColor
//      Create a few example post-it objects:
//  an orange with blue text: "Idea 1"
//  a pink with black text: "Awesome"
//  a yellow with green text: "Superb!"
  String backGroundColor;
  String text;
  String textColor;


  public PostIt() {
    this.backGroundColor = "orange";
    this.textColor = "blue";
    this.text = "Idea 1";
  }

  public static void main(String[] args) {

    PostIt second;

    second = new PostIt();
    second.backGroundColor = "pink";
    second.textColor = "black";
    second.text = "Awesome";

    PostIt third;

    third = new PostIt();
    third.backGroundColor = "yellow";
    third.textColor = "green";
    third.text = "Superb2";

  }

}