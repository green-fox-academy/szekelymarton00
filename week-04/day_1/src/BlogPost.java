public class BlogPost {

  //  Create a BlogPost class that has
//      an authorName
//      a title
//      a text
//      a publicationDate
//      Create a few blog post objects:
//      "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
//  Lorem ipsum dolor sit amet.
//"Wait but why" titled by Tim Urban posted at "2010.10.10."
//  A popular long-form, stick-figure-illustrated blog about almost everything.
//"One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
//  Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.
// When I asked to take his picture outside one of IBM’s New York City offices,
// he told me that he wasn’t really into the whole organizer profile thing.
  String authorName;
  String title;
  String text;
  String publicationDate;


  public static void main(String[] args) {

    BlogPost firstPost;

    firstPost = new BlogPost();
    firstPost.authorName = "John Doe";
    firstPost.title = "Lorem Ipsum";
    firstPost.text = "Lorem ipsum dolor sit amet.";
    firstPost.publicationDate = "2000.05.04.";

    BlogPost another;

    another = new BlogPost();
    another.authorName = "Tim Urban";
    another.title = "Wait but why";
    another.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
    another.publicationDate = "2010.10.10.";

    BlogPost nextPost;

    nextPost = new BlogPost();
    nextPost.authorName = "William Turton";
    nextPost.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    nextPost.text =
        "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. \n"
            + " When I asked to take his picture outside one of IBM’s New York City offices, \n"
            + " he told me that he wasn’t really into the whole organizer profile thing. ";
    nextPost.publicationDate = "2017.03.28.";

  }

}

