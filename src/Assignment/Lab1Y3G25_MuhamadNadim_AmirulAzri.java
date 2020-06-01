/*
In a group of two members, design and develop a Java program that performs simple calculation.
Your program will read in values and operation to be calculated from the user and display the result.
Your program is able to continue the calculation using the result from previous calculation plus a new value and new operation given by the user.
Allow the user the select the operation of addition, subtraction, and multiplication, division, power (x^y), and square (x^2).
User can reset the value back to zero just like normal calculator. Loop the operations until user chooses to quit the program.

Git & github tutorial part 1: https://www.youtube.com/watch?v=H0nVBpoTBGc
Git & github tutorial part 2: https://www.youtube.com/watch?v=gunh_-IkeAw
 */
package Assignment;

import java.util.Scanner;

public class Lab1Y3G25_MuhamadNadim_AmirulAzri {
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);

        System.out.println("This calculator only inputs two values and has six calculation method.");

        System.out.println("Enter the first value: ");
        int n1 = read.nextInt();

        System.out.println("Enter the second value: ");
        int n2 = read.nextInt();

        System.out.println("Which of kind of calculation you want to see? :- ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Power[the first value ^ the second value]");
        System.out.println("6. Square[the first/second value ^ 2]");

    }
}
