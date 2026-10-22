import java.util.Scanner; //specific package

class Program_22
{
    public static void main(String A[])
    {
        Scanner scanner = new Scanner(System.in); //coding convention to use same object name as the method

        System.out.println("Enter Your Name : ");
        String sName = scanner.nextLine(); //here sName is string name

        System.out.println("Welcome "+sName);
    }
}