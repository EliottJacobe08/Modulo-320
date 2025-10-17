//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int perimetro = perimetro(1, 2);
        System.out.println(perimetro);

        float perimetro2 = perimetro(2.2F, 3);
        System.out.println(perimetro2);

        double perimetro3 = perimetro(2.2, 2.1);
        System.out.println(perimetro3);

    }
    public static int perimetro(int lunghezza, int larghezza){
        return (lunghezza+larghezza)*2;
    }
    public static float perimetro(float lunghezza, int larghezza){
        return (float) (lunghezza+larghezza)*2;
    }
    public static double perimetro(double lunghezza, double larghezza){
        return (lunghezza+larghezza)*2;
    }
}