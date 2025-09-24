public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[args.length];
        String prime = "";
        int Counter = 0;

        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        for (int n : numbers) {
            if (n < 2) continue;

            int j;
            for (j = 2; j < n; j++) {
                if (n % j == 0) {
                    break;
                }
            }

            if (j == n) {
                Counter++;
                prime += n + " ";
            }
        }

        System.out.println("There are " + Counter + " prime numbers: " + prime);
    }
}
