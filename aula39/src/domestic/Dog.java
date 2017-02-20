package domestic;

public class Dog {

	// access modifiers

	// protected is accessible by classes in the same package
	// or by a subclass (inheritance) in different package
	protected void play() {
		System.out.println("Awrf awrf awrf");
	}

	// obs: When no explicit access modifier is specified, it will be default
	// access is more restrictive than the protected modifier
	// because is only accessible to classes in the same package.
}
