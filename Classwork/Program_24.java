import java.util.Scanner;

class Program_24
{
    public static void main(String A[])  //object oriented method
    {
        Scanner scanner = null;
        String sName = null;

        scanner = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        sName = scanner.next(); // it is only accepting a word

        System.out.println("Welcome "+sName);
    }
}