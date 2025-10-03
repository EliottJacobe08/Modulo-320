public class HelloString {
    public static void main(String[] args) {
		String s = "Ciao Mondo";
		int length = s.length();
		char c = s.charAt(0);
		boolean b = s.equals("Ciao Mondo");
		String e = s.substring(0,8);
		System.out.println(s);
		System.out.println(length);
		System.out.println(c);
		System.out.println(b);
		System.out.println(e);

    }
}
