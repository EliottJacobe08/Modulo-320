public class Temperatura {
    public double celcius;
    public double min = -273.15;
    public double max = 100.00;

    public double getCelsius() {
        return celcius;
    }

    public static Temperatura getRandom(double min, double max) {
        double val = min + Math.random() * (max - min);
        return new Temperatura(val);
    }



    public Temperatura(double celcius) {
        this.celcius = celcius;
        if (celcius < -273.15) {
            System.out.println(" il valore è inferiore a -273.15 (zero assoluto)");
            this.celcius = -273.15;
        }
    }

    public String stato() {
        if (this.celcius < 10) {
            return "Freddo";
        } else if (this.celcius > 25) {
            return "Caldo";
        } else {
            return "Temperato";
        }
    }

    public double inFahrenheit() {
        return (this.celcius * 1.8) + 32;
    }
    public double inKelvin() {
        return (this.celcius * 1.8) + 27;
    }
    public String toString() {
        return "Temperatura in celcius: " + this.celcius + "; stato: " + this.stato()+"inFahrenheit"+this.inFahrenheit()+"inKelvin"+this.inKelvin();
    }

}


