package ExceptionHandling;

public class Exception1
{
    public static void main(String[] args)
    {
        int num1=6;
        int num2=0;
        int result=0;

        try
        {
            result=num1/num2;
            System.out.println("in try block");
        }

        catch(Exception obj)
        {
            System.out.println("Something went wrong" + obj);
        }


        System.out.println(result);
        System.out.println("Bye");
    }
}

