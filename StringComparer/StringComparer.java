public class StringComparer {
	public static void main (String[] args) {
		String word1 = args[0];
		String word2 = args[1];
		
		if(word1.equals(word2)) {
			System.out.println(word1+" and "+word2 " are equals");
		}
		else {
			System.out.println(word1+" and "+word2 " are not equals");
		}
	}
}