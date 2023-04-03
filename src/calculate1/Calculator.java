package calculate1;

/**
 * 4. Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate
 */

public class Calculator {


//1st instance method
    public void addition(int a, int b) {
        int result = a+b;
        System.out.println("Addition of the numbers is: " + a + " and " + b + " is: "+ result);
    }
//2nd instance method
    public void subtraction(int a, int b) {
        int result = a-b;
        System.out.println("Subtraction of the numbers is: " + a + " and " + b + " is: "+ result);
    }
//3rd instance method by using exception handling
    public void division(int a,int b) {
        try {
            int result = a/b;
            System.out.println("Division of the numbers is: " + a + " and " + b + " is: "+ result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); //to handle those exceptions if user enters divisor 0
            System.out.println("Enter a different number again: ");

            }
        }

//4th instance method
        public void multiplication ( int a, int b){
        int result = a * b;
        System.out.println("Multiplication of the numbers is: " + a + " and " + b + " is: " + result);
        }
//5th instance method using multiple conditions
        public void calculateResult ( int a, int b, char symbol){
            if (symbol == '+') {
                addition(a,b);
            } else if (symbol == '-') {
                subtraction(a, b);
            } else if (symbol == '/') {
                division(a,b);
            } else if (symbol == '*') {
                multiplication(a, b);
            } else {
                System.out.println("Invalid symbol");
            }
        }
    }



