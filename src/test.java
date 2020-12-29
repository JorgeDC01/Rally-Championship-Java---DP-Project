

public class test {
    public static void main (String [ ] args) {

        // CAMPEONATO COMPLETO
        Organization org = Organization.getInstance();
        org.setConfigOrganization(3,2,new DistanceComparatorTrack(),false, new PointComparatorPilotRace());


        ITrack t1;
        t1 = new Track("PORTUGAL", ComplexityTrack.MEDIUM, DistanceTrack.INTERMEDIATE);
        t1 = new GravelDecorator(t1);
        t1 = new NightDecorator(t1);
        org.addTrack(t1);
        //System.out.println(t1);

        Team T1 = new Team("citroen",false,false,new PointComparatorPilot(),new FuelComparatorCar());
        T1.addPilot(new ExperiencedPilot("Loeb",null,Concentration.NORMAL));
        T1.addPilot(new StarPilot("Makinen",null,Concentration.ZEN));
        T1.addPilot(new BeginnerPilot("Auriol",null,Concentration.NORMAL));
        T1.addCar(new ResistantCar("Citröen C5",Speed.FAST,Fuel.ELEPHANT));
        T1.addCar(new FastCar("Citröen C4",Speed.FAST,Fuel.RARE));
        T1.addCar(new NormalCar("Citröen C3",Speed.FAST,Fuel.RARE));
        T1.sortPilots();
        T1.sortCars();
        T1.registerTeam();

        org.management();
    }
}
