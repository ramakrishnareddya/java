package conditions;

public class ShortHandleIfElse {

	public static void main(String[] args) {
		
		int age = 16;
		String result;
		
		result = (age > 18) ? "eligible" : "not eligible";
		System.out.println(result);
	}
}
