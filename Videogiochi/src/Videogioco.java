import java.util.ArrayList;

public class Videogioco {
    private String Titolo;
    private ArrayList <Sviluppatore> Sviluppatori = new ArrayList<>();
    private Float Prezzo;
    private Boolean Stato;

    public Videogioco(String titolo, Float prezzo, Boolean stato) {
        Titolo = titolo;
        Prezzo = prezzo;
        Stato = stato;
    }
    public void AggiungiSviluppatore(Sviluppatore sviluppatore) {
        Sviluppatori.add(sviluppatore);
    }
    public void RimuoviSviluppatore(Sviluppatore sviluppatore) {
        Sviluppatori.remove(sviluppatore);
    }
    @Override
    public String toString() {
        String s = Titolo + " - ";
        for (Sviluppatore sv : Sviluppatori) {
            s += sv.toString() + " - ";
        }
        s += Prezzo + "Fr.-";
        return s;
    }

}
