import java.util.Comparator;
/*
    To compare pilots in the pilotsRace from Organization.
 */
public class PointComparatorPilotRace implements Comparator<IPilot> {
    /*
        Compares two pilots depending on the points scored.
        @param p1 The first pilot to be compared
        @param p2 The second pilot to be compared.
        @return 1 if points of p1 > points of p2; -1 if points of p1 < p2 and if their points are equal, they will be compared
        depending on the times that they finished races.
     */
    @Override
    public int compare(IPilot p1, IPilot p2) {
        if(p1.totalPointsStored() == p2.totalPointsStored()){
            return new RacesFinishedComparatorPilotRace().compare(p1,p2);
        }
        else if(p1.totalPointsStored() > p2.totalPointsStored()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
