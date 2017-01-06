public class ImplementingRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Implenting the run() method of Runnable interface");
		System.out.println("Thread started");
	}

	public static void main(String[] args) {
		ImplementingRunnable runnable = new ImplementingRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
