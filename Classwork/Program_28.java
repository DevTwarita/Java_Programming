import java.util.Scanner;

class Program_28
{
    public static void main(String A[])  //object oriented method
    {
        Scanner scanner = null;
        String sName = null;
        int iAge = 0;
        float fMarks = 0.0f;

        scanner = new Scanner(System.in); 

        System.out.println("Enter Your Name : ");
        sName = scanner.next();
        /*
        throws exception InputMismatchException
        the exception is happening because of how scanner.next()
        handles spaces when typed name with space in it
        it successfully stores the first word typed before 
        adding space in it...the leftover text typed after space is 
        left sitting in the input buffer
        */

        System.out.println("Enter Your Age : ");
        iAge = scanner.nextInt();

        System.out.println("ENter Your Marks : ");
        fMarks = scanner.nextFloat();

        System.out.println("Welcome "+sName);
        System.out.println("Your Age is : "+iAge);
        System.out.println("Your marks are : "+fMarks);
    }
}