import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

        // Join the two lists by matching one girl with one boy in the order list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        int length = girls.size();
        if (length != boys.size()) {
        }
        ArrayList<String> order = new ArrayList<String>(length);
        for (int i = 0; i < length; i++) {
            order.add(girls.get(i) + " " + boys.get(i));
        }
            System.out.println(order);
    }
}