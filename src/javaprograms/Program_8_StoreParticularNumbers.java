package javaprograms;

import java.util.HashSet;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

public class Program_8_StoreParticularNumbers {

    public static void main(String[] args) {

//        HashSet declaration

        HashSet <Integer> hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(7);
        hashSet.add(8);

//        To show which numbers are in the set then used with HashSet is the best choice for search operation

        for(int i = 1; i <= 10; i++){
           if(hashSet.contains(i)){
               System.out.println(i + "is in the set");
           }else {
               System.out.println(i + "is not in the set");
           }
        }

    }
}
