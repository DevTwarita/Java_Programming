import java.util.Scanner;

class Program_23
{
    public static void main(String A[])
    {
        Scanner scanner = null; //assigned default values
        String sName = null; //this is only reference

        scanner = new Scanner(System.in); //here object is created

        System.out.println("Enter Your Name : ");
        sName = scanner.nextLine();

        System.out.println("Welcome "+sName);
    }
}