public class Main {
    public static void main(String[] args) {

        Player p = new Player("ZX-100", "Sony");

        Playlist pl = new Playlist("Preferiti");
        pl.aggiungiBrano(new Brano("Blinding Lights", "The Weeknd"));
        pl.aggiungiBrano(new Brano("Numb", "Linkin Park"));
        pl.aggiungiBrano(new Brano("Shape of You", "Ed Sheeran"));

        p.aggiungiPlaylist(pl);

        p.play();
        p.successivo();
        p.precedente();
        p.selezionaBrano(2);
    }
}
