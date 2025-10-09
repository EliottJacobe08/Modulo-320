//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro("MOMMY TOMMY","MARCO DEL COOCCCO",99,true);
        libro.stampaInfo();
        libro.verificaDisponibilita();

        Libro libro1 = new Libro();
        libro1.titolo = "MOMMY TOMMY";
        libro.autore="A";
        libro1.annoPublicazione = 91;
        libro1.disponibile = true;
        libro1.stampaInfo();
        libro1.verificaDisponibilita();
    }
}