package javaprograms;

import java.util.ArrayList;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

public class Program_6_RetrievingDemo {
    public static void main(String[] args) {

//        ArrayList declared and add() method used to add elements in the ArrayList

        ArrayList <Integer> arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(70);
        arrayList.add(80);
        arrayList.add(90);
        arrayList.add(100);

//      retrieve an element (at a specified index) from a given array list

        System.out.println("Element at index 2: " + arrayList.get(2));  //retrieve value of index number 2
        System.out.println("Element at index 4: "+ arrayList.get(4));
        System.out.println("Element at index 6: "+ arrayList.get(6));
    }
}
