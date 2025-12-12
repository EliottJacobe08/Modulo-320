import java.util.ArrayList;
import java.util.List;

public class Negozio {
    private String Name;
    private ArrayList<Videogioco> Videogiochi = new ArrayList<Videogioco>();

    public Negozio(String name) {
        Name = name;
    }

    public void AggiungiVideogioco(Videogioco videogioco) {
        Videogiochi.add(videogioco);
    }

    public void RimuoviVideogioco(Videogioco videogioco) {
        Videogiochi.remove(videogioco);
    }
    public ArrayList<Videogioco> getVideogiochi (){
        return Videogiochi;
    }

    public String getName() {
        return Name;
    }
}
