public class DivRemainder {
	public static void main(String[] args) {
        float dividend = Float.parseFloat(args[0]);
        float divisor = Float.parseFloat(args[1]);
		float divRemainder = dividend / divisor;
		System.out.println("dividend: "+ dividend);
		System.out.println("divisor: "+ divisor);
		System.out.println("divRemainder: "+ divRemainder);
	}
}