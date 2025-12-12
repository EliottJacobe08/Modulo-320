import org.w3c.dom.ls.LSOutput;

public class Planet {
    private String Name;
    private Double Mass;
    private Double Volume;
    private Double Density;
    private Double Radius;
    private Boolean life;
    private Integer population;
    private Boolean gasgiant;
    private Double Albedo;

    public Planet(String name, Double mass, Double volume, Double density, Double radius, Boolean life, Integer population, Boolean gasgiant, Double albedo) {
        Name = name;
        Mass = mass;
        Volume = volume;
        Density = density;
        Radius = radius;
        this.life = life;
        this.population = population;
        this.gasgiant = gasgiant;
        Albedo = albedo;
    }

    @Override
    public String toString() {
        return "pianeta:";
    }
    public Double AGP() {
        return 6.67430e-11 *(getMass()/Math.pow(getRadius(),2));
    }

    public String getName() {
        return Name;
    }

    public Double getMass() {
        return Mass;
    }

    public Double getVolume() {
        return Volume;
    }

    public Double getDensity() {
        return Density;
    }

    public Double getRadius() {
        return Radius;
    }

    public Boolean getLife() {
        return life;
    }

    public Integer getPopulation() {
        return population;
    }

    public Boolean getGasgiant() {
        return gasgiant;
    }

    public Double getAlbedo() {
        return Albedo;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setMass(Double mass) {
        Mass = mass;
    }

    public void setVolume(Double volume) {
        Volume = volume;
    }

    public void setDensity(Double density) {
        Density = density;
    }

    public void setRadius(Double radius) {
        Radius = radius;
    }

    public void setLife(Boolean life) {
        this.life = life;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public void setGasgiant(Boolean gasgiant) {
        this.gasgiant = gasgiant;
    }

    public void setAlbedo(Double albedo) {
        Albedo = albedo;
    }
}
