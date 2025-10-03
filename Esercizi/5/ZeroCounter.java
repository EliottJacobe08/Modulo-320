public class ZeroCounter {
	public static void main (String[] args) {
			int[] numbers = new int[args.length];
			int zeroCounter = 0;
			
			
			for(int i = 0; i < args.length;i++) {
				numbers[i] = Integer.parseInt(args[i]);
			}
			
			
			for (int n : numbers) {
				if(n == 0) {
					zeroCounter++;
				}
			}
	}
}