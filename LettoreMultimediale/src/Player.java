import java.util.ArrayList;

public class Player {

    private String modello;
    private String marca;
    private ArrayList<Playlist> playlists;

    private Playlist playlistAttiva;
    private int indiceBrano = 0;

    public Player(String modello, String marca) {
        this.modello = modello;
        this.marca = marca;
        this.playlists = new ArrayList<>(); // Aggregazione
    }

    public void aggiungiPlaylist(Playlist p) {
        playlists.add(p);
        if (playlistAttiva == null) {
            playlistAttiva = p; // Imposta la prima playlist automaticamente
        }
    }

    // PLAY
    public void play() {
        if (playlistAttiva == null || playlistAttiva.getNumeroBrani() == 0) {
            System.out.println("Nessun brano da riprodurre.");
            return;
        }

        Brano b = playlistAttiva.getBrano(indiceBrano);
        System.out.println("Riproduzione: " + b.getTitolo() + " (posizione " + indiceBrano + ")");
    }

    // SUCCESSIVO
    public void successivo() {
        if (playlistAttiva == null) return;

        indiceBrano++;
        if (indiceBrano >= playlistAttiva.getNumeroBrani()) {
            indiceBrano = 0; // Ritorna all'inizio
        }

        play();
    }

    // PRECEDENTE
    public void precedente() {
        if (playlistAttiva == null) return;

        indiceBrano--;
        if (indiceBrano < 0) {
            indiceBrano = playlistAttiva.getNumeroBrani() - 1; // Vai all’ultimo brano
        }

        play();
    }

    // SELEZIONA BRANO
    public void selezionaBrano(int n) {
        if (playlistAttiva == null) return;

        if (n >= 0 && n < playlistAttiva.getNumeroBrani()) {
            indiceBrano = n;
            play();
        } else {
            System.out.println("Indice non valido.");
        }
    }
}
