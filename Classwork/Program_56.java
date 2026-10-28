class Program_56
{
    public static void main(String A[])
    {
        Iteration iteration = new Iteration();
        
        iteration.display();
    }
}
class Iteration
{
    public void display()
        {
           int iCnt = 0;

           for(iCnt = 1 ; iCnt <= 6; iCnt++) //here in this code we understand that we 
           // have to change static to dynamic if we change icNt <= 6
           {
                System.out.println("Jay Ganesh...");
           }
        }
}