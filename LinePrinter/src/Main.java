//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int length = 0;
        int direction = 0;

        if (args.length < 2) {
            System.out.println("Usage: java Main <length> <direction>");
        }

        try {
            length = Integer.parseInt(args[0]);
            direction = Integer.parseInt(args[1]);

            if (length == 0) {

            }
        }

    }
}