public class Rettangolo {
    private double latoMinore = 5;
    private double latoMaggiore = 3;

    public double Area(){
        return latoMinore * latoMaggiore;
    }

    public double getLatoMinore() {
        return latoMinore;
    }

    public double getLatoMaggiore() {
        return latoMaggiore;
    }

    public void setLatoMinore(double latoMinore) {
        this.latoMinore = latoMinore;
    }

    public void setLatoMaggiore(double latoMaggiore) {
        this.latoMaggiore = latoMaggiore;
    }

    public double Perimetero(){
        return (latoMinore + latoMaggiore)*2;
    }

    public String dimensioni(){
        String dimensioni = latoMaggiore+"x"+latoMinore;
        return dimensioni;
    }

    public void areaeperimetro(){
        System.out.println(Area());
        System.out.println(Perimetero());
    }
}
