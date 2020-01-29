package com.threads;

public class DeadLock extends Thread{

	public synchronized void m1() throws InterruptedException {
		sleep(2000);
		System.out.println("Thread 1 calling ");
		m2();
	}
	
public synchronized void m2() throws InterruptedException {
		m1();
	}
	
public void run() {
	DeadLock d = new DeadLock();
    try {
		d.m1();
		d.m2();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
