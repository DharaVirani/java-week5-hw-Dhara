package javaprograms;

import java.util.Scanner;

/**
 * 2. Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop.
 */

public class Program_2_StudentMarkSheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Student Name    \t \t:\t");
        String name = scanner.next();
        System.out.println("Enter Student Roll Number  \t\t:\t");
        int rollNum = scanner.nextInt();
        System.out.println("Enter Marks of Subject Maths \t:\t");
        int mathMarks = scanner.nextInt();
        while(mathMarks < 0 || mathMarks > 100){
            System.out.println("\nInvalid input, Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            mathMarks = scanner.nextInt();
        }
        System.out.println("Enter Marks of Subject English\t:\t");
        int scienceMarks = scanner.nextInt();
        while(scienceMarks < 0 || scienceMarks > 100){
            System.out.println("\nInvalid input, Marks should be between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            scienceMarks = scanner.nextInt();
        }

        System.out.println("Enter Marks of Subject English\t:\t");
        int englishMarks = scanner.nextInt();
        while(englishMarks < 0 || englishMarks > 100){
            System.out.println("\nInvalid input, Marks should be between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            englishMarks = scanner.nextInt();
        }


        int total = sum(mathMarks , scienceMarks , englishMarks );
        int percentage = (total* 100)/300;
        String result = calculateResult(mathMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name,rollNum,mathMarks, scienceMarks, englishMarks, total, percentage, result, grade);
//        Closing object
        scanner.close();

    }

//    Calculating the sum
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

//    Calculating the result on subject marks
    public static String calculateResult(int mathMarks, int scienceMarks, int englishMarks){
        while(mathMarks < 35 || scienceMarks < 35  || englishMarks < 35) {
          return "Fail" ;
        }
        return "Pass";
    }

//    Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result){
       String grade = null;
       if(percentage >= 80){
         grade = "A+";
       } else if (percentage >= 60) {
         grade = "A";
       } else if (percentage >= 50) {
           grade = "B";
       } else if (percentage >= 35) {
         grade = "C" ;
       }else {
           grade = "-";
       }
       return grade;
    }

//    Printing the Mark sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathMarks, int scienceMarks, int englishMarks,
                                         double total, double percentage, String result, String grade){

        System.out.println("--------------------------------");
        System.out.println("|                              |");
        System.out.println("| Mark Sheet                   |");
        System.out.println("|                              |");
        System.out.println("|______________________________|");
        System.out.println("|Name:" + name + "                    |");
        System.out.println("|Roll No:" + rollNum + "                    |");
        System.out.println("|______________________________|");
        System.out.println("|Math:" + mathMarks + "                       |");
        System.out.println("|Science:" + scienceMarks+ "                    |");
        System.out.println("|English:" + englishMarks + "                   |");
        System.out.println("|______________________________|");
        System.out.println("|Total:" + total + "                   |");
        System.out.println("|______________________________|");
        System.out.println("|Percentage:" + percentage + "               |");
        System.out.println("|Result:" + result + "                   |");
        System.out.println("|Grade:" + grade + "                      |");
        System.out.println("|______________________________|");

















    }

}
