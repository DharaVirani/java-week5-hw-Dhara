package javaprograms;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */

public class Program_5_IteratorDemo {

    public static void main(String[] args) {
//        ArrayList declared and elements stored with add() method
        ArrayList arrayList= new ArrayList();
        arrayList.add("Prime");
        arrayList.add(2023);
        arrayList.add('A');
        arrayList.add(true);
        arrayList.add("Amazing");
        arrayList.add(100);

//        Reading values using iterator method

        Iterator  iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }


}
