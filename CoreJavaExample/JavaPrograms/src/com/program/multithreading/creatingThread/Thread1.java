package com.program.multithreading.creatingThread;

public class Thread1 extends Thread{
	public void run(){
		System.out.println("Thread1 is running");
	}
	
	public static void main(String[] args){
		Thread1 thread = new Thread1();
		thread.start();
	}
}
