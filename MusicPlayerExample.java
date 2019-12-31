package thread;

public class MusicPlayerExample implements Runnable 
{
	 Thread t;
	  MusicPlayerExample()
	  {
		  t=new Thread(this);
		  System.out.println("Music player is running ");
		  t.start();          // invoke run
		  t.interrupt();
	  }
	  public void run()
	  {
		  try
		  {
			  while(true)
			  {
				  Thread.sleep(1000);
			  }
		  }
		  catch(InterruptedException e)
		  {
			  System.out.println("Recieved a Whatsapp notification");
		  }
	  }
		public static void main(String[] args)
		{
			new MusicPlayerExample();
			

		}
}

	
//or we can write
/*
  public class MusicPlayerExample extends Thread
     public void run()
     {
      try
      {
        System.out.println("Music player is running ");
        Thread.sleep(1000);
      }
        catch(InterruptedException e)
		  {
			  System.out.println("Recieved a Whatsapp notification");
		  }
	  }
 
  public static void main(String[] args)
  {
    MusicPlayerExample t=new MusicPlayerExample();
    t.start();
	t.interrupt();
	
*/

