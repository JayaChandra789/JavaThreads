package threads;

class Even extends Thread 
{
    @Override
    public void run() //Run method mandate for threads as task scheduler implements threads
    {
        for (int i = 1; i <= 5; i++) 
        {
            if (i % 2 == 0) 
            {
                System.out.println("Even: " + i);
                //For Delay purpose
                try
                {
                	Thread.sleep(2000); //Duration time
                } //
                catch(InterruptedException objIE) //Catch block must
                {
                	objIE.printStackTrace(); //obj.printStackTrace();
                }
            }
        }
    }
}
class Odd extends Thread 
{
    @Override
    public void run() //Run method mandate for threads as task scheduler implements threads
    {
        for (int j = 1; j <= 5; j++) 
        {
            if (j % 2 != 0) 
            {
                System.out.println("Odd: " + j);
            }
        }
    }
}
public class ThreadExample 
{
    public static void main(String[] args) 
    {
        Even evenObj = new Even();
        Odd oddObj = new Odd();
        
        //For priority purpose
        evenObj.setPriority(2);
        oddObj.setPriority(1);
        
        //Executing string with start method only possible.
        evenObj.start();
        oddObj.start();
    }
}
