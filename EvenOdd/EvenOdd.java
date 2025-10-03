public class EvenOdd {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java EvenOdd <numbers>");
            return;
        }

        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);

                if (number % 2 == 0) {
                    System.out.println(number + " is Even");
                } else {
                    System.out.println(number + " is Odd");
                }
            } catch (NumberFormatException e) {
                System.out.println(arg + " is not a valid integer");
            }
        }
    }
}
