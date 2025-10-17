public class ClassePunto {
    private double x;
    private double y;


    public ClassePunto() {
        this.x = 1.0;
        this.y = 1.0;
    }
    public ClassePunto(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public int calcolaDistanza() {
        return (int) Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    public String determinaQuadrante() {
        if (x > 0 && y > 0)
            return "Primo quadrante";
        else if (x < 0 && y > 0)
            return "Secondo quadrante";
        else if (x < 0 && y < 0)
            return "Terzo quadrante";
        else if (x > 0 && y < 0)
            return "Quarto quadrante";
        else if (x == 0 && y == 0)
            return "Origine";
        else if (x == 0)
            return "Sull'asse Y";
        else // y == 0
            return "Sull'asse X";
    }
    public String toString(){
        return "Cordinate: ("+this.x+","+this.y+")"+" Distanza: "+this.calcolaDistanza()+" Quadrante: "+this.determinaQuadrante();
    }
}
