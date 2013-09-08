public class Warmup {
	public static void main(String[] args) {
		factorial(4);
	}
	public static int factorial (int n) {
		int factorial = 1;
		for (int i=1; i <=n; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
		return factorial;
	}
}