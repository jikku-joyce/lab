package com.jikku.study;

public class Threads implements Runnable{
	Thread t;
	String threadName;
	
	
	Threads(String threadName)
	{
		this.threadName = threadName;
		System.out.println("Spawning ----> " + threadName);
	}
	
	@Override
	public void run() {
		/*for(int i=0; i<=5; i++)
		{*/
			System.out.println("Executing ---->> " + threadName);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		/*}*/
	}
	
	private void start()
	{
		System.out.println("Starting...." + threadName);
		if(t == null)
		{
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
	public static void main(String args[])
	{
		/*Threads thread1 = new Threads("Thread 1");
		thread1.start();
		
		Threads thread2	= new Threads("Thread 2");
		thread2.start();*/
		
		for(int i=0; i<=5; i++)
		{
			Threads thread = new Threads("Thread "+i);
			thread.start();
		}
	}

}
