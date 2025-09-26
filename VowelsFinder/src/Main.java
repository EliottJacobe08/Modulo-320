import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String world = args[0];
        world = world.toLowerCase();
        String NV = "";

        for (int i = 0; i < world.length(); i++) {
            char c = world.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o'|| c == 'u') {
                NV+= c;
            }
        }
        System.out.println(world+" a vocali: "+NV);


    }
}