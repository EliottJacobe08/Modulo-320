import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            int m = Integer.parseInt(args[1]);
            if(args.length <0) {
                System.out.println("Usage: java Main <n> <m>");
                return;
            }
            int[][] matrix = new int[n][n];

            Random rand = new Random();
            for(int i = 0; i <matrix.length ; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                    System.out.print(rand.nextInt(0,m+1)+"\t");
                }
                System.out.println();
            }

        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

    }
}