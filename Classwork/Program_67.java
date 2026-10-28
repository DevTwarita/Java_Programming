import java.util.Scanner;

class Program_67
{
    public static void main(String A[])
    {        
        Scanner scanner = new Scanner(System.in);
        int iValue = 0;

        Iteration iteration = new Iteration();

        System.out.println("Enter the frequency : ");
        iValue = scanner.nextInt();
        
        iteration.display(iValue);
    }
}

class Iteration
{
    public void display(int iNo)
        {
           int iCnt = 0; //this value is default value which is for integer

           iCnt = 1; // this is for loop 

           do
           {
                System.out.println("-------------");
                System.out.println(iCnt + "  Jay Ganesh");
                System.out.println("-------------");
                iCnt++;
           } while(iCnt <= iNo);
        }
}
// it will run one time at least this is tail checking
// do while is used for circular linked list