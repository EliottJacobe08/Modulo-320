public class Pythagoras {
	public static void main(String[] args) {
		double base = Double.parseDouble(args[0]);
		double exponent = Double.parseDouble(args[1]);
		double hypotenuse = Math.hypot(leg1,leg2);
		System.out.printf("leg1: %.1f\n",leg1);
		System.out.printf("leg2: %.1f\n",leg2);
		System.out.printf("hypotenuse: %.2f\n",hypotenuse);
	}
}