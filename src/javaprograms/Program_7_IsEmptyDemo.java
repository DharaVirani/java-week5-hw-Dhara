package javaprograms;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */

public class Program_7_IsEmptyDemo {

    public static void main(String[] args) {

//        ArrayList declared

        ArrayList <String> drinkList = new ArrayList<>();
        drinkList.add(null);
        drinkList.add(" ");
        drinkList.add("Diet Coke");
        drinkList.add("Coke");
        drinkList.add("Coca Cola");
        drinkList.add("Pepsi");          //null values allowed


        if(drinkList.isEmpty()){
            System.out.println("The list is empty");
        }else {
            System.out.println("The list is not empty");
        }

//        remove all elements from the list to check if the list is empty or not
        drinkList.clear();

//        check if the list is empty again
        if(drinkList.isEmpty()){
            System.out.println("The list is empty");
        }else {
            System.out.println("The list is not empty");
        }


    }
}
