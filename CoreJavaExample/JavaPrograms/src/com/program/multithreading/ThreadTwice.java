package com.program.multithreading;

//This example will show and test wheather we can start a thread twice or not
public class ThreadTwice extends Thread {
	public void run() {
		System.out.println("running .....");
	}

	public static void main(String[] args) {
		System.out.println("Main thread started");
		ThreadTwice thread = new ThreadTwice();
		thread.start();
		thread.start();
		System.out.println("Main thread ended");
	}
}
