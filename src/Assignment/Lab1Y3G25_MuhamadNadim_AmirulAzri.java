/*
In a group of two members, design and develop a Java program that performs simple calculation.
Your program will read in values and operation to be calculated from the user and display the result.
Your program is able to continue the calculation using the result from previous calculation plus a new value and new operation given by the user.
Allow the user the select the operation of addition, subtraction, and multiplication, division, power (x^y), and square (x^2).
User can reset the value back to zero just like normal calculator. Loop the operations until user chooses to quit the program.
 */
package Assignment;

import java.util.Scanner;

public class Lab1Y3G25_MuhamadNadim_AmirulAzri
{
    public static void main(String[] args)
    {
        int run = 1;
        Scanner read = new Scanner(System.in);

        table();
        space();
        System.out.println("This calculator only inputs two values and has six calculation methods.");
        space();
        System.out.println("Pick one of the following calculation methods shown above:");
        int met = read.nextInt();

        space();
        if(met == 1)
        {
            add();
        }
        else if (met == 2)
        {
            sub();
        }
        else if (met == 3)
        {
            mul();
        }
        else if (met == 4)
        {
            div();
        }
        else if (met == 5)
        {
            pow();
        }
        else if (met == 6)
        {
            sqr();
        }
        else
        {

        }

    }
    static void table()
    {
        System.out.println("____________________________________________________________________________");
        System.out.println("||  Number   ||     Calculator's Operations                               ||");
        System.out.println("||    1      ||         Addition                                          ||");
        System.out.println("||    2      ||         Subtraction                                       ||");
        System.out.println("||    3      ||         Multiplication                                    ||");
        System.out.println("||    4      ||         Division                                          ||");
        System.out.println("||    5      ||         Power[the first value ^ the second value]         ||");
        System.out.println("||    6      ||         Square[the first/second value ^ 2]                ||");
        System.out.println("----------------------------------------------------------------------------");
    }

    static void space() { System.out.println();}

    public static void add()
    {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int n1 = i.nextInt();
        System.out.println("Enter the second value: ");
        int n2 = i.nextInt();
        int ans = n1+n2;
        System.out.println("Answer for this addition is : "+ans);
    }

    public static void sub()
    {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int n1 = i.nextInt();
        System.out.println("Enter the second value: ");
        int n2 = i.nextInt();
        int ans = n1-n2;
        System.out.println("Answer for this subtraction is : "+ans);
    }

    public static void mul()
    {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int n1 = i.nextInt();
        System.out.println("Enter the second value: ");
        int n2 = i.nextInt();
        int ans = n1*n2;
        System.out.println("Answer for this multiplication is : "+ans);
    }

    public static void div()
    {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int n1 = i.nextInt();
        System.out.println("Enter the second value: ");
        int n2 = i.nextInt();
        int ans = n1/n2;
        System.out.println("Answer for this division is : "+ans);
    }

    public static void pow()
    {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the base value: ");
        int n1 = i.nextInt();
        System.out.println("Enter the exponent value: ");
        int n2 = i.nextInt();
        int ans = (int) Math.pow(n1, n2);
        System.out.println("Answer for this addition is : "+ans);
    }

    public static void sqr()
    {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int n1 = i.nextInt();
        int ans = (int) Math.pow(n1,2);
        System.out.println("Answer for this addition is : "+ans);
    }
}
