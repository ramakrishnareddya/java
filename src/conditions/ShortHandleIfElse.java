package conditions;

public class ShortHandleIfElse {

	public static void main(String[] args) {
		
		int age = 16;
		int eligibility = 18;
		String result;
		
		result = (age >= eligibility) ? "eligible" : "not eligible";
		System.out.println(result);
	}
}
