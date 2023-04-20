package ExceptionHandling;

// try With Resources

import java.util.Scanner;
public class Exception6
{
    public static void main(String[] args)
    {
        int num=0;

        // try with Resources
        try(Scanner sc=new Scanner(System.in))
        {
            num=sc.nextInt();
        }


        System.out.println(num);

    }
}