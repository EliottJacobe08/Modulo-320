public class Libro {
    public String titolo;
    public String autore;
    public int annoPublicazione;
    public boolean disponibile;

    public Libro(){}

    public Libro(String titolo, String autore, int annoPublicazione, boolean disponibile) {
        this.titolo = titolo;
        this.autore = autore;
        this.annoPublicazione = annoPublicazione;
        this.disponibile = disponibile;
    }

    public void stampaInfo(){
        System.out.println("titolo: " + titolo);
    }

    public void verificaDisponibilita(){
        System.out.println("disponibile: " + disponibile);
    }
}
