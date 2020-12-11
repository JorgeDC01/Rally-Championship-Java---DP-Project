

public class test {
    public static void main (String [ ] args) {

        ITrack t1,t2,t3,t4,t5,t6;
        t1 = new Track("PORTUGAL", ComplexityTrack.MEDIUM, DistanceTrack.INTERMEDIATE);
        t1 = new GravelDecorator(t1);
        t1 = new NightDecorator(t1);
        System.out.println(t1);

        t2 = new Track("AUSTRALIA", ComplexityTrack.LOW, DistanceTrack.LONG);

        Team T1 = new Team("citroen",true,true);
        T1.addPilot(new ExperiencedPilot("Loeb",null,Concentration.NORMAL));
        T1.addPilot(new StarPilot("Makinen",null,Concentration.ZEN));
        T1.addPilot(new BeginnerPilot("Auriol",null,Concentration.NORMAL));
        T1.addCar(new ResistantCar("Citröen C5",Speed.FAST,Fuel.ELEPHANT));
        T1.addCar(new FastCar("Citröen C4",Speed.FAST,Fuel.RARE));
        T1.addCar(new NormalCar("Citröen C3",Speed.FAST,Fuel.RARE));
        T1.setComparatorPilots(new PointComparatorPilot());
        T1.setComparatorCars(new FuelComparatorCar());
        T1.sortPilots();
        T1.sortCars();
        T1.showPilotsOfTeam();
        T1.showCarsOfTeam();
    }
}
