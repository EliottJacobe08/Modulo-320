public class Encryption {
  public static void main(String[] args) {
	  String inputCode = args[0];
	  char firstP = inputCode.charAt(0);
	  char thirdP = inputCode.charAt(2);
	  int L = inputCode.length();
	  char last = inputCode.charAt(L-1);
	  char secondToLast = inputCode.charAt(L-2);
	  System.out.println("inputCode = "+inputCode);
	  System.out.println("encryptedCode = "+firstP+thirdP+last+secondToLast);
  }
}
