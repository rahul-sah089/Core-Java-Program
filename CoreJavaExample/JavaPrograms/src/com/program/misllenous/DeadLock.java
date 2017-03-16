package com.program.misllenous;

public class DeadLock {
	String str1 = "Biceps";
	String str2 = "Back";
	
	Thread thr1 = new Thread("My thread 1"){
		public void run(){
			while(true){
				synchronized (str1) {
					synchronized (str2) {
						System.out.println(str1 + str2);
					}
				}
			}
		}
	};
	
	Thread thr2 = new Thread("My thread 2"){
		public void run(){
			while(true){
				synchronized (str2) {
					synchronized (str1) {
						System.out.println(str2 + str1);
					}
				}
			}
		}
	};
	
	public static void main(String[] args){
		System.out.println("main method started");
		DeadLock deadLock = new DeadLock();
		deadLock.thr1.start();
		deadLock.thr2.start();
		System.out.println("main method ended");
	}
	
	
}
