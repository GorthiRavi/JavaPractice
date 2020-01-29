package com.threads;

public class SimpleThreadClass implements Runnable{

	public static void main(String[] args) {
		Thread t = new Thread(new SimpleThreadClass());
		t.start();
		Thread th = Thread.currentThread();
		System.out.println("Parent Thread group Name : " + th.getThreadGroup().getParent().getName() //system
		+ "; Curret main thread name : " + th.getName()  //main
		+ ";  Curret main thread group name : " + th.getThreadGroup().getName() //main
		+ "; Curret main thread id : " + th.getId() //1
		+ "; Curret main thread active count : " + th.getThreadGroup().activeCount()); //2
	}

	@Override
	public void run() {
		for(int i=0; i<1;i++) {
			System.out.println("Curret child thread name : " + Thread.currentThread().getName());
			System.out.println("Curret child thread group name : " + Thread.currentThread().getThreadGroup().getName() );
			System.out.println("Curret child thread State : " + Thread.currentThread().getState() );
			System.out.println("Curret child thread id : " + Thread.currentThread().getId() );
		}
		
	}

}
