public class automobile {
    public String targa;
    public String marca;
    public String modello;
    public int anno;
    public boolean elettrica;
    public boolean parcheggiata;

    public automobile(String targa, String marca, String modello, int anno, boolean elettrica, boolean parcheggiata) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        this.elettrica = elettrica;
        this.parcheggiata = parcheggiata;
    }

    public void stampaInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Automobile [" +
                "Targa: " + targa + ", " +
                "Marca: " + marca + ", " +
                "Modello: " + modello + ", " +
                "Anno: " + anno + ", " +
                "Elettrica: " + elettrica + ", " +
                "Parcheggiata: " + parcheggiata + "]";
    }

    public String entraGarage() {
        parcheggiata = true;
        return "Auto " + marca + ", targata " + targa + " è parcheggiata";
    }

    public String esciGarage() {
        parcheggiata = false;
        return "Auto " + marca + ", targata " + targa + " è uscita";
    }

    public boolean isStorica() {
        int annoCorrente = java.time.Year.now().getValue();
        return annoCorrente - anno > 25;
    }
    public String getTarga() { return targa; }
    public boolean isElettrica() { return elettrica; }
    public boolean isParcheggiata() { return parcheggiata; }
    public int getAnno() { return anno; }

}
