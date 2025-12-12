import java.util.ArrayList;

public class Playlist {
    private String titolo;
    private ArrayList<Brano> brani;

    public Playlist(String titolo) {
        this.titolo = titolo;
        this.brani = new ArrayList<>(); // Composizione
    }

    public void aggiungiBrano(Brano b) {
        brani.add(b);
    }

    public Brano getBrano(int index) {
        if (index >= 0 && index < brani.size()) {
            return brani.get(index);
        }
        return null;
    }

    public int getNumeroBrani() {
        return brani.size();
    }

    public String getTitolo() {
        return titolo;
    }
}
