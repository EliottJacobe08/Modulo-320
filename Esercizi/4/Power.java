public class Power {
	public static void main(String[] args) {
		double base = Double.parseDouble(args[0]);
		double exponent = Double.parseDouble(args[1]);
		double result = Math.pow(base,exponent);
		System.out.printf("base: %.1f\n",base);
		System.out.printf("exponent: %.1f\n",exponent);
		System.out.printf("result: %.1f\n",result);
	}
}