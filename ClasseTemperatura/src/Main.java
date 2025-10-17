import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Temperatura[] temperature = {
                Temperatura.getRandom(-273.15, 100.00),
                Temperatura.getRandom(-273.15, 100.00),
                Temperatura.getRandom(-273.15, 100.00),
                Temperatura.getRandom(-273.15, 100.00),
                Temperatura.getRandom(-273.15, 100.00),
        };

        for (int i = 0; i < temperature.length - 1; i++) {
            for (int j = 0; j < temperature.length - i - 1; j++) {
                if (temperature[j].getCelsius() > temperature[j + 1].getCelsius()) {
                    Temperatura temp = temperature[j];
                    temperature[j] = temperature[j + 1];
                    temperature[j + 1] = temp;
                }
            }
        }

        for (Temperatura t : temperature) {
            System.out.println(t);
        }


/*
        Passo A:

        Temperatura t1 = new Temperatura(5.0);
        Temperatura t2 = new Temperatura(9.0);
        Temperatura t3 = new Temperatura(15.0);



        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());

        double mediaT = (t1.getCelsius() +t2.getCelsius() +t3.getCelsius())/3;
        System.out.println("Media Temperature: "+mediaT);

 */
    }
}