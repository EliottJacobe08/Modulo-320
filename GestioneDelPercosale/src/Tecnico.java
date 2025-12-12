import GestioneDelpersonale.Dipendente;

public class Tecnico extends Dipendente {
    private Integer oreStraordinario;

    public Tecnico(String nome, Integer matricola, Double salarioBase, Double pagaoraria, Integer oreStraordinario) {
        super(nome, matricola, salarioBase, pagaoraria);
        this.oreStraordinario = oreStraordinario;
    }

    public Tecnico() {
        this.oreStraordinario = 1;
    }
    public Double calcolaStipendioTecnico() {
        return salarioBase +(pagaoraria * oreStraordinario);
    }

    public void setOreStraordinario(Integer oreStraordinario) {
        this.oreStraordinario = oreStraordinario;
    }

    public Integer getOreStraordinario() {
        return oreStraordinario;
    }
}
