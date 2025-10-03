public class FibonacciSequence {
	public static void main (String[] args) {
		int F0 = 0;
		int F1 = 1;
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("F"+i+" = "+F1+"\n");
			int F2 = F0 + F1;
			F0 = F1;
			F1 = F2;
		}
		
		
	}
}