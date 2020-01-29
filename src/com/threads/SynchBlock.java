package com.threads;

import com.pojo.Hello;

public class SynchBlock extends Thread{
	Hello hel = null;
	Hello hel2 = new Hello();
	public SynchBlock(Hello hel) {
		this.hel=hel;
	}
	//static synchronized method
	public void run() {
		hel.show2();
		hel.show3();
	}
	
	//two different obj calling one static sync
	/*public void run() {
		hel.show2();
		hel2.show2();
	}*/
	/*
	 * public void run() {
		hel.show1();
	}*/

	public static void main(String[] args) {
		Hello hel = new Hello();
		SynchBlock s1 = new SynchBlock(hel);
		SynchBlock s2 = new SynchBlock(hel);
		s1.start();
		s2.start();
	}

}
