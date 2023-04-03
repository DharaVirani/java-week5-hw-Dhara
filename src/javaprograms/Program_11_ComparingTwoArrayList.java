package javaprograms;
/**
 * 11. Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */

import java.util.ArrayList;

public class Program_11_ComparingTwoArrayList {

    public static void main(String[] args) {

//        ArrayList declared with String wrapper class
        ArrayList<String> c1= new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

//        ArrayList declared with String wrapper class
        ArrayList<String> c2= new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

//        Comparing two arrays using equals method
        System.out.println(c1.equals(c2));
    }


}
