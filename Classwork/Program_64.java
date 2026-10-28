class Program_64
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

           for(iCnt = 6 ; iCnt >= 1; iCnt--) //++ forward transversal, backward transversal
           {
                System.out.println("Jay Ganesh...");
           }
        }
}