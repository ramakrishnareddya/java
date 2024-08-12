package methods;

public class Method {
	public static void main(String[] args) {
		myFirstMethod();
		mySecondMethod();
		
		// we can call a method multiple times 
		
		mySecondMethod();
		myThirdMethod();
	}
	
	static void myFirstMethod() {
		System.out.println("MY first Method");
	}
	static void mySecondMethod() {
		System.out.println("My Second Method");
	}

	static void myThirdMethod() {
		System.out.println("My Third Method");
	}
}
