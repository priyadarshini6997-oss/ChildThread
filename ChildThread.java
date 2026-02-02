package com.index;

public class ChildThread extends Thread {
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Child Thread: "+i);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println("Child thread interrupted");
				
			}
		}
	}
	
	

	public static void main(String[] args) {
		
		ChildThread t = new ChildThread();
		t.start();
		
		System.out.println("Main thread finished");

	}

}
