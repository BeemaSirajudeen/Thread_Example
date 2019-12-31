package thread;

public class ThreadSample extends Thread 
{

	public static void main(String[] args) 
	{
		ThreadSample t1=new ThreadSample();                                   //invoke thread class constructor
		t1.start();
		
	}
        public void run()
        {
        	System.out.println("Am is run method by extending thread ");
        }
}
