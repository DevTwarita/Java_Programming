import java.util.Scanner;

class Program_27
{
    public static void main(String A[])  //object oriented method
    {
        Scanner scanner = null;
        String sName = null;
        int iAge = 0;
        float fMarks = 0.0; //lossy conversion error, incompatible types

        scanner = new Scanner(System.in); 

        System.out.println("Enter Your Name : ");
        sName = scanner.next(); // it is only accepting a word

        System.out.println("Enter Your Age : ");
        iAge = scanner.nextInt();

        System.out.println("ENter Your Marks : ");
        fMarks = scanner.nextFloat();

        System.out.println("Welcome "+sName);
        System.out.println("Your Age is : "+iAge);
        System.out.println("Your marks are : "+fMarks);
    }
}