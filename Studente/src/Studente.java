public class Studente {
    public String nome;
    public int eta;
    public String corso;
    public boolean isProssimo;

    public Studente(String nome, int eta, String corso, boolean isProssimo) {
        this.nome = nome;
        this.eta = eta;
        this.corso = corso;
        this.isProssimo = isProssimo;
    }
    public Studente() {}

    public void saluta(){
        System.out.print("Ciao "+nome + " "+ corso);
    }
    public void verificaPromozione(){
        System.out.print(" allievo "+ isProssimo);
    }

}
