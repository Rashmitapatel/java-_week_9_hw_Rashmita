package calculate;

import java.util.ArrayList;
/*Write a Java program to create a new array list, add some colours (string) and
        printout the collection using for each loop.  */
public class Programme_4_ArraylistColour {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList<String>();
        colour.add("Red");
        colour.add("Green");
        colour.add("Blue");
        colour.add("Yellow");
        for (String colours:colour) {
            System.out.println(colour);

        }

    }




}
