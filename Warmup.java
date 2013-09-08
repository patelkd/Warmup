public class Warmup {
	public static void main(String[] args) {
		// factorial(5);
		exponent(7,2);
	}
	public static int factorial (int n) {
		int factorial = 1;
		for (int i=1; i <=n; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
		return factorial;
	}
	public static int exponent(int x, int n) {
		int y = 1;
		for (int i=1; n>=i; i++) {
			y=y*x;
		}
		System.out.println(y);
		return y;
	}
}