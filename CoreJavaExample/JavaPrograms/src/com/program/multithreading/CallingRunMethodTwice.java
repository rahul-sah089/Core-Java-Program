package com.program.multithreading;

//Calling run method directly
public class CallingRunMethodTwice extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Main thread started");
		CallingRunMethodTwice thread1 = new CallingRunMethodTwice();
		CallingRunMethodTwice thread2 = new CallingRunMethodTwice();

		thread1.run();
		thread2.run();

		System.out.println("Main thread ended");
	}
}
