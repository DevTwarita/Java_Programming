class Program_63
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

           for(iCnt = 6 ; iCnt <= 6; iCnt--) //++ forward transversal, backward transversal
           {
                System.out.println("Jay Ganesh...");
           }
        }
}

//Infinite loop
//why?
//ulta gela tar -infinity always condition true for iCnt <= 6