
import dictionary.Dictionary;
import dictionary.Entry;

public class Main {

    public static void main(String[] args) {

        Dictionary diz = new Dictionary();

        // Aggiunta parole
        diz.aggiungi(new Entry("gatto", "cat"));
        diz.aggiungi(new Entry("cane", "dog"));
        diz.aggiungi(new Entry("tavolo", "table"));

        Entry trovato = diz.cerca("gatto");
        if (trovato != null) {
            System.out.println("Traduzione trovata: " + trovato);
        } else {
            System.out.println("Parola non trovata!");
        }

        System.out.println("\n--- Dizionario completo ---");
        diz.stampaTutto();
    }
}
