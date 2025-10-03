public class AVG {
	public static void main(String[] args) {
        float num1 = Float.parseFloat(args[0]);
        float num2 = Float.parseFloat(args[1]);
        float num3 = Float.parseFloat(args[2]);
        int media = (int)((num1 + num2 + num3) / 3);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("media = " + media);
    }
}
