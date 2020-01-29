package com.pojo;

public class Hello {
	
	public void show()
	{
		Thread t = Thread.currentThread();
		synchronized(this) {
			for(int i=0;i<2;i++) {
				System.out.println(t.getName()+ "-SHOW:"+i+"\t"+this);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
				
	}
	public void show1()
	{
		Thread t = Thread.currentThread();
		synchronized(Hello.class) {
			for(int i=0;i<2;i++) {
				System.out.println(t.getName()+ "-SHOW:"+i+"\t"+this);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
				
	}
	
	public static synchronized void show2()
	{
		Thread t = Thread.currentThread();
		
			for(int i=0;i<2;i++) {
				System.out.println(t.getName()+ "-SHOW:"+i+"\t");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
				
	}
	public synchronized void show3()
	{
		Thread t = Thread.currentThread();
		
			for(int i=0;i<2;i++) {
				System.out.println("Non static : "+t.getName()+ "-SHOW:"+i+"\t");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
				
	}
}
