package javaprograms;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */

public class Program_3_ReverseValues {
    public static void main(String[] args) {

//ArrayList of Integer wrapper class declared and add() method used to add elements in the list
        ArrayList <Integer> reverseList = new ArrayList<>();
        reverseList.add(15);
        reverseList.add(16);
        reverseList.add(27);
        reverseList.add(18);
        reverseList.add(19);
        reverseList.add(20);
        reverseList.add(21);
        reverseList.add(22);
        reverseList.add(23);
        reverseList.add(24);
        reverseList.add(25);

//      Collections is a class which have pre-defined methods used for collection objects

       Collections.reverse(reverseList);
//      Printing the list after reversing
        System.out.println("After reversing the order : "+ reverseList);

    }
}
