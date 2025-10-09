import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Studente studente = new Studente("I am batman", 69,"Gottamcity",true);
        studente.saluta();
        studente.verificaPromozione();

        System.out.println();


        Studente studente1 = new Studente();
        studente1.nome = "MBAPPE";
        studente1.eta = 26;
        studente1.corso = "Win the World Cup";
        studente1.isProssimo = true;
        studente1.saluta();
        studente1.verificaPromozione();
    }
}