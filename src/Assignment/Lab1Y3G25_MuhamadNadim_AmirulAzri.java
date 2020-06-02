/*
In a group of two members, design and develop a Java program that performs simple calculation.
Your program will read in values and operation to be calculated from the user and display the result.
Your program is able to continue the calculation using the result from previous calculation plus a new value and new operation given by the user.
Allow the user the select the operation of addition, subtraction, and multiplication, division, power (x^y), and square (x^2).
User can reset the value back to zero just like normal calculator. Loop the operations until user chooses to quit the program.

Git & github tutorial part 1: https://www.youtube.com/watch?v=H0nVBpoTBGc
Git & github tutorial part 2: https://www.youtube.com/watch?v=gunh_-IkeAw

Refer to notes and videos of Chapters 1-4 for references.
 */
package Assignment;

import java.util.Scanner;

public class Lab1Y3G25_MuhamadNadim_AmirulAzri
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);

        table();
        space();
        System.out.println("This calculator only inputs two values and has six calculation method.");
        space();
        System.out.println("Pick one of the following calculation methods shown above:");
        int met = read.nextInt();

        space();
        if(met == 1)
        {
            System.out.println("Enter the first value: ");
            int n1 = read.nextInt();

            System.out.println("Enter the second value: ");
            int n2 = read.nextInt();

            int add_ans = add(n1,n2);

            space();

            System.out.println("Answer: "+add_ans);
        }
        else if (met == 2)
        {
            System.out.println("Enter the first value: ");
            int n1 = read.nextInt();

            System.out.println("Enter the second value: ");
            int n2 = read.nextInt();

            int sub_ans = sub(n1,n2);

            space();

            System.out.println("Answer: "+sub_ans);
        }
        else if (met == 3)
        {
            System.out.println("Enter the first value: ");
            int n1 = read.nextInt();

            System.out.println("Enter the second value: ");
            int n2 = read.nextInt();

            int mul_ans = mul(n1,n2);

            space();

            System.out.println("Answer: "+mul_ans);
        }
        else if (met == 4)
        {
            System.out.println("Enter the first value: ");
            int n1 = read.nextInt();

            System.out.println("Enter the second value: ");
            int n2 = read.nextInt();

            int div_ans = div(n1,n2);

            space();

            System.out.println("Answer: "+div_ans);
        }
        else if (met == 5)
        {
            System.out.println("Enter the first value: ");
            int n1 = read.nextInt();

            System.out.println("Enter the second value: ");
            int n2 = read.nextInt();

            int pow_and = pow(n1,n2);

            space();

            System.out.println("Answer: "+pow_and);
        }
        else if (met == 6)
        {
            System.out.println("Enter one value: ");
            int n3 = read.nextInt();

            int sq_ans = sq(n3);

            space();

            System.out.println("Answer: "+sq_ans);
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

    static void space()
    {
        System.out.println();
    }

    static int add(int n1, int n2)
    {
        int ans_add;
        ans_add = n1+n2;
        return ans_add;
    }

    static int sub(int n1, int n2)
    {
        return  n1-n2;
    }

    static int mul(int n1, int n2)
    {
        return  n1*n2;
    }

    static int div(int n1, int n2)
    {
        return n1/n2;
    }

    static int pow(int n1, int n2)
    {
        return (int) Math.pow(n1, n2);
    }

    static int sq(int n3)
    {
        return (int) Math.pow(n3, 2);
    }
}
