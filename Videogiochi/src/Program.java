public class Program {
    public static void main(String[] args) {

        Sviluppatore Fusion = new Sviluppatore("Fusion");
        Sviluppatore Fyfyl = new Sviluppatore("Fyfyl");
        Sviluppatore Derasoon = new Sviluppatore("Derasoon");

        Videogioco Valorant = new Videogioco("Valorant",0.0f,true);
        Videogioco RocketLeague = new Videogioco("RL",20.0f,true);

        Valorant.AggiungiSviluppatore(Fusion);
        Valorant.AggiungiSviluppatore(Derasoon);

        RocketLeague.AggiungiSviluppatore(Fyfyl);
        RocketLeague.AggiungiSviluppatore(Fusion);

        Negozio DreamTeam = new Negozio("DreamTeam");
        DreamTeam.AggiungiVideogioco(Valorant);
        DreamTeam.AggiungiVideogioco(RocketLeague);

        DreamTeam.RimuoviVideogioco(RocketLeague);

        System.out.println(DreamTeam.getVideogiochi());


    }
}
