//Approach 3

import java.util.Scanner;

class Program_39
{
    public static void main(String A[])
    {
        Scanner scanner = null;
        Arithmatic arithmatic = null; //created method
        int iValue1 = 0, iValue2 = 0, iResult = 0;

        scanner = new Scanner(System.in);

        System.out.println("Enetr First Number : ");
        iValue1 = scanner.nextInt();

        System.out.println("Enetr Second Number : ");
        iValue2 = scanner.nextInt();

        arithmatic = new Arithmatic(); //created object for the method

        iResult = arithmatic.Addition(iValue1, iValue2);

        System.out.println("Addition is : "+iResult);
    }
}

class Arithmatic
{
    public int Addition(int iNo1, int iNo2) //removed static
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        
        return iAns;
    }
}

//in previous program 36 java couldnt find the addition method because
//it was in another class i.e arithmatic 
//in program 38 to solve this issue we declared the addition static method
//but now if we want addition to be non static yet perform the function
//we created object in main class for method Arithmatic which is also
//created in main class