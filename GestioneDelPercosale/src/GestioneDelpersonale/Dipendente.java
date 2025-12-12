package GestioneDelpersonale;

public class Dipendente {
    protected String nome;
    protected Integer matricola;
    protected Double salarioBase;
    protected Double pagaoraria;

    public Dipendente(String nome, Integer matricola, Double salarioBase, Double pagaoraria) {
        this.nome = nome;
        this.matricola = matricola;
        this.salarioBase = salarioBase;
        this.pagaoraria = pagaoraria;
    }

    public Dipendente() {
        this.nome = "none";
        this.matricola = 0;
        this.salarioBase = 0.0;
        this.pagaoraria = 0.0;
    }

    public Double calcolaStipendio() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public Integer getMatricola() {
        return matricola;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public Double getPagaoraria() {
        return pagaoraria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricola(Integer matricola) {
        this.matricola = matricola;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setPagaoraria(Double pagaoraria) {
        this.pagaoraria = pagaoraria;
    }
}
