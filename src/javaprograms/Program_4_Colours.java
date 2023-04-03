package javaprograms;
/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

import java.util.ArrayList;

public class Program_4_Colours {

    public static void main(String[] args) {

//   ArrayList of String wrapper class is used and add() method to add elements
    ArrayList <String> coloursList = new ArrayList<>();
    coloursList.add("Red");
    coloursList.add("Blue");
    coloursList.add("Green");
    coloursList.add("Pink");
    coloursList.add("Violet");
    coloursList.add("Black");

//    foreach loop to read elements of ArrayList one by one

        for (String colours: coloursList) {
            System.out.println(colours);
        }

    }

}
