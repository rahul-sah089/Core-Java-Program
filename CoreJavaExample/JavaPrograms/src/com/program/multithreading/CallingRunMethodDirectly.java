package com.program.multithreading;
//==> Each thread starts in a separate call stack.
//==> Invoking the run() method from main thread,
//    the run() method goes onto the current call stack rather
//    than at the beginning of a new call stack.
public class CallingRunMethodDirectly extends Thread{
	public void run(){
		System.out.println("Running....");
	}
	
	public static void main(String[] args){
		CallingRunMethodDirectly thread = new CallingRunMethodDirectly();
		thread.run();
	}
}
