public class SinglePattern {
	private static SinglePattern mySingleTon;
	static {
		mySingleTon = new SinglePattern();
	}

	private SinglePattern() {
	}

	public static SinglePattern getInstanace() {
		return mySingleTon;
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		SinglePattern singlePattern1 = getInstanace();
		SinglePattern singlePattern2 = getInstanace();
		System.out.println(singlePattern1);
		System.out.println(singlePattern2);
		System.out.println("Main Method Ended");
	}
}
