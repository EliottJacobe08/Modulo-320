public class ArithmeticProgression {
	public static void main (String[] args) {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		int number3 = Integer.parseInt(args[2]);
		
		int diff1 = number2 -number1;
		int diff2 = number3 -number1;
		
		if (diff1 == diff2){
			System.out.println(number1 + " " + number2 + " " + number3 +" are in arithmetic progression (constant difference of " + diff1 + ")");
		}
		else {
			 System.out.println(number1 + " " + number2 + " " + number3 +" are NOT in arithmetic progression");
		}
	}
	
}