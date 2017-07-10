
public class DeadLock {
	String str1 = "Rahul";
	String str2 = "Sah";

	Thread thr1 = new Thread("My Thread 1") {
		public void run() {
			while (true) {
				synchronized (str1) {
					synchronized (str2) {
						System.out.println("Thread 1 " + "str1=" + str1 + " and str2 = " + str2);
					}
				}
			}
		}
	};

	Thread thr2 = new Thread("My Thread 2") {
		public void run() {
			while (true) {
				synchronized (str2) {
					synchronized (str1) {
						System.out.println("Thread 2 " + "str1=" + str1 + " and str2 = " + str2);
					}
				}
			}
		}
	};

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		DeadLock deadkLock = new DeadLock();
		deadkLock.thr1.start();
		deadkLock.thr2.start();
		System.out.println("Main Method Ended");
	}

}
