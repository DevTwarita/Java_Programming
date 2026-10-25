//Approach 3

import java.util.Scanner;

class Program_38
{
    public static void main(String A[])
    {
        Scanner scanner = null;
        int iValue1 = 0, iValue2 = 0, iResult = 0;

        scanner = new Scanner(System.in);

        System.out.println("Enetr First Number : ");
        iValue1 = scanner.nextInt();

        System.out.println("Enetr Second Number : ");
        iValue2 = scanner.nextInt();

        iResult = Arithmatic.Addition(iValue1, iValue2);

        System.out.println("Addition is : "+iResult);
    }
}

class Arithmatic
{
    public static int Addition(int iNo1, int iNo2)
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        
        return iAns;
    }
}

//here for some people error occured because jvm thought 
// that main needs to be in the first class you mention
//but when it did not see main in arithmatic class it displayed some issue
//hence we brought arithmatic class below main class to solve this issue