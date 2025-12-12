import GestioneDelpersonale.Dipendente;

public class Dirigente extends Dipendente {
    private Double bonusAnnuale;

    public Dirigente(String nome, Integer matricola, Double salarioBase, Double pagaoraria, Double bonusAnnuale) {
        super(nome, matricola, salarioBase, pagaoraria);
        this.bonusAnnuale = bonusAnnuale;
    }

    public Dirigente() {
        this.bonusAnnuale = 0.0;
    }
    public Double calcolaStipendioDirigente() {
        return salarioBase + bonusAnnuale;
    }

    public Double getBonusAnnuale() {
        return bonusAnnuale;
    }

    public void setBonusAnnuale(Double bonusAnnuale) {
        this.bonusAnnuale = bonusAnnuale;
    }
}
