public class Format {
    public static void main(String[] args) {
		double val = Double.parseDouble(args[0]);
		System.out.printf("%.6f",val);
		System.out.printf("%.2f",val);
		System.out.printf("%.0f",val);
		System.out.printf("%,.2f",val);
		System.out.printf("%.2e",val);
		
	}
}