package thread;
class MusicPlayer extends Thread
{
	public void run()
	{
	   System.out.println("Music is playing ");
	}
}
class MSWord implements Runnable
{
	public void run()
	{
		System.out.println("Typing MS Word document");
	}
}
public class ThreadSample3Main 
{

	public static void main(String[] args) 
	{
		Runnable obj1=new MSWord();
		 MSWord obj2=new  MSWord ();
		 MusicPlayer thread2=new MusicPlayer();
		 Thread thread1=new Thread(obj1);                 //invokes thread class constructor
	                    // Multi_threading
		thread1.start();
		thread2.start();
		
	}

}
