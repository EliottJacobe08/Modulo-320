import java.util.Random;
public class Dice {
	public static void main(String[] args) {
		
		Random rn = new Random();
		int min = 1;
		int max = 6;
		for (int i = 1; i < 6; i++) {
			
			int answer = rn.nextInt(6) + 1;
			System.out.println(i+".dice: "+answer);
		}
	}
}