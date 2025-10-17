import java.util.Random;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(100);
        boolean indovinato = false;
        while(!indovinato){
            Scanner sc = new Scanner(System.in);
            System.out.println("Inserisci un numero");
            int num = sc.nextInt();
            if(num == randomNum){
                System.out.println("GG");
                indovinato = true;
            } else if(num < randomNum){
                System.out.println("Numero inserito piu piccolo");
            } else {
                System.out.println("Numero inserito piu grande");
            }
        }
    }
}