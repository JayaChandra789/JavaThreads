package threads;

class ThreadRunnables implements Runnable //For Initializing Runnable interface we need to use below syntax in new Thread class
{ //Thread t1 = new Thread(new ThreadRunnables());
	public void run()
	{
		for(int i = 0 ;i<=10; i++)
		{
			if(i%3==0)
			{	 
				System.out.println("Divisble by 3 upto 10 are:"+ i );
				try
				{
					Thread.sleep(3000);
				}
				catch(InterruptedException objIE)
				{
					objIE.printStackTrace();
				}	
			}
		}
	}
}

class ThreadRunnabels implements Runnable
{
	public void run()
	{
		for(int i = 0 ;i<=10; i++)
		{
			if(i%2==0)
			{	 
				System.out.println("Divisble by 2 upto 10 are:"+ i );
				/**/
				try   { Thread.sleep(1000); } //For Delay duration
				catch(InterruptedException objIE){ objIE.printStackTrace(); }	//Handle that interruption
			}
		}
	}
}
public class ThreadUsingRunnableInterface 
{
	public static void main(String[] args) 
	{	
		Thread t1 = new Thread(new ThreadRunnables()); //class call if we use Runnable Interface in thread class
		Thread t2 = new Thread(new ThreadRunnabels()); //class call if we use Runnable Interface in thread class
		
		t1.start();
		t2.start();
	}
}
