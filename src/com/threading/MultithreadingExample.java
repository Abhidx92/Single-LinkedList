package com.threading;

public class MultithreadingExample implements Runnable {

	Thread myThread;
	
	
	public static void main(String args[]) throws InterruptedException{
		MultithreadingExample multithreadingExample =  new MultithreadingExample();
		multithreadingExample.myThread = new Thread(new MultithreadingExample(),"Abhi 1 Thread");
		multithreadingExample.myThread.start();
		multithreadingExample.myThread = new Thread(new MultithreadingExample(),"Abhi 2 Thread");
		multithreadingExample.myThread.start();
		//Thread.currentThread().yield();
		multithreadingExample.printName();
	}
	
	
	@Override
	public void run(){
		printName();
	}
	
	public synchronized void printName(){
		
		if(Thread.currentThread().getName().equalsIgnoreCase("Abhi 1 Thread")){
			try {
				Thread.currentThread().wait();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName());
	}
}
