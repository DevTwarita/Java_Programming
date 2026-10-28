//In this program we get to understand updater
//using if condition
//-- becomes plus

import java.util.Scanner;

class Program_59
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
           int iCnt = 0;

           //input updater
           if(iNo < 0)
           {
                iNo = -iNo;
           }

           for(iCnt = 1 ; iCnt <= iNo; iCnt++)
           {
                System.out.println("Jay Ganesh...");
           }
        }
}