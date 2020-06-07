package Assignment;

import java.util.Scanner;

public class Lab1Y3G25_MuhamadNadim_AmirulAzri
{
    public static void main(String[] args)
    {
        int run = 1;
        Scanner read = new Scanner(System.in);

        while (run == 1)
        {
        space();
        System.out.println("Press 1 to start this calculator program, or press 2 to quit.");
        System.out.println("Please key in one of the two given numbers: ");
        int beg = read.nextInt();

        if (beg == 1) {
        table();
        space();
        System.out.println("This calculator only inputs two values and has six calculation methods.");
        System.out.println("Pick one of the following calculation methods shown above:");
        int met = read.nextInt();

        space();
        if(met == 1)
        { add(); }

        else if (met == 2)
        { sub(); }

        else if (met == 3)
        { mul(); }

        else if (met == 4)
        { div(); }

        else if (met == 5)
        { pow(); }

        else if (met == 6)
        { sqr(); }

        else
        { System.out.println("Error! Only key in value number 1, 2, 3, 4, 5, or 6!!!"); }

        }

        else if (beg == 2) { run = 0; }

        else { System.out.println("Error! Only key in value number 1 or 2!!!"); }
      }
    }

    static void table()
    {
        System.out.println("__________________________________________________________________________________________");
        System.out.println("||  Number   ||                Calculator's Operations                                  ||");
        System.out.println("||    1      ||         Addition [the first value + the second value]                   ||");
        System.out.println("||    2      ||         Subtraction [the first value - the second value]                ||");
        System.out.println("||    3      ||         Multiplication [the first value * the second value]             ||");
        System.out.println("||    4      ||         Division [the first value / the second value]                   ||");
        System.out.println("||    5      ||         Power [the base value ^ the exponent value]                     ||");
        System.out.println("||    6      ||         Square [the input value ^ 2]                                    ||");
        System.out.println("------------------------------------------------------------------------------------------");
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
