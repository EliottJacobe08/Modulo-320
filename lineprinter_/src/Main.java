//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int length = 0;
        int direction = 0;

        try {
            length = Integer.parseInt(args[0]);
            direction = Integer.parseInt(args[1]);

            if (args.length > 2) {
                System.out.println("Usage: java Main [length] [direction]");
            }

            if (length == 0) {
                System.out.println("Please enter a length");
                return;
            }
            if (direction != 0 && direction != 1) {
                System.out.println("Please enter a direction between 0 and 1");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number");
        }

        switch (direction) {
            case 0:
                for (int i = 0; i < length; i++) {
                    System.out.println("*");
                }
                break;
            case 1:
                for (int i = 0; i < length; i++) {
                    System.out.print("*");
                }
        }
    }
}