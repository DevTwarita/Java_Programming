import java.util.Scanner;

class Digit
{
    public void DisplayDigits(int iNo)//method is non static
    {
        int iDigit = 0;

        while (iNo != 0) 
        {
            iDigit = iNo % 10;
            iNo = iNo /10;
            System.out.println(iDigit);
        }
    }
}

class Program_123
{
    public static void main (String A[])
    {
        Digit digit = new Digit();
        
        digit.DisplayDigits(9752);
    }
}