package thread;
class Number implements Runnable
 {
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println(i);
		}
	}
}
     public class ThreadSample2Main 
    {

	public static void main(String[] args) 
	{
		Runnable obj1=new Numbers(); 
		Numbers obj2=new Numbers();
		Thread thread1=new Thread(obj1);                             //invokes thread class constructor
		Thread thread2=new Thread(obj2);                            //invokes thread class constructor
		thread1.start();                                           // Multi_threading
		thread2.start();                                          // Multi_threading
		

	}

}
