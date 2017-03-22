package com.program.multithreading.creatingThread;

public class SleepMethodExample extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException itrEx) {
				itrEx.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println("Main Thread Started");
		SleepMethodExample thr1 = new SleepMethodExample();
		SleepMethodExample thr2 = new SleepMethodExample();
		thr1.start();
		thr2.start();
		System.out.println("Main Thread Ended");
	}

}
