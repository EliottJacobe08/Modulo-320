public class Main {
    public static void main(String[] args) {
        Garage g = new Garage("Garage Centrale");

        automobile a1 = new automobile("AB123CD", "Fiat", "Panda", 1999, false, false);
        automobile a2 = new automobile("EF456GH", "Tesla", "Model 3", 2021, true, false);
        automobile a3 = new automobile("IJ789KL", "Volkswagen", "Golf", 1995, false, false);
        automobile a4 = new automobile("MN012OP", "Renault", "Zoe", 2022, true, true);

        g.aggiungiAuto(a1);
        g.aggiungiAuto(a2);
        g.aggiungiAuto(a3);
        g.aggiungiAuto(a4);

        g.mostraAuto();

        System.out.println("\nNumero di auto elettriche: " + g.contaElettriche());
        g.mostraStoriche();

        g.rimuoviAuto("AB123CD");
        g.mostraAuto();
    }
}
