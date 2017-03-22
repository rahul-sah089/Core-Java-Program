package com.program.multithreading.creatingThread;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread 2 is running");
	}

	public static void main(String[] args) {
		Thread2 runnable = new Thread2();
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
