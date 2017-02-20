package domestic;

public class Dog {

	// access modifiers

	// public is the least restrictive, which means the widest range of visibility
	public void bark() {
		System.out.println("Raw raw raw");
	}

	// private is the most restrictive, nothing outside the class can access a private member
	private void waveTail() {
		System.out.println("Wooosh");
	}

}
