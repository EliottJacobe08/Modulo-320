import GestioneDelpersonale.Dipendente;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Dipendente> personale = new ArrayList<>();

        Tecnico t1 = new Tecnico();
        Tecnico t2 = new Tecnico("s",1,12.12,122.2,1);

        Dirigente d1 = new Dirigente();
        Dirigente d2 = new Dirigente("ssd",2,12.1,22.2,12.1);

        personale.add(t1);
        personale.add(d1);
        personale.add(t2);
        personale.add(d2);

        for (Dipendente n : personale) {
            System.out.println("nome: " +n.getNome() + " matricola: " + n.getMatricola());
        }

    }
}