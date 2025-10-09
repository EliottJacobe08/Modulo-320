public class Rettangolo {
    public double latoMinore = 5;
    public double latoMaggiore = 3;

    public double Area(){
        return latoMinore * latoMaggiore;
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
