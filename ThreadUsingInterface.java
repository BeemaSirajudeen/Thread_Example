package thread;
public class ThreadUsingInterface implements Runnable
{
   public static void main(String[] args) 
	{
	   ThreadUsingInterface ts=new ThreadUsingInterface();
	   Thread t1=new Thread(ts);            //invoke thread class constructor
	   t1.start();
	}
    public void run()
     {
    	System.out.println("Am is run method by implementing run ");
     }
}
	
 

