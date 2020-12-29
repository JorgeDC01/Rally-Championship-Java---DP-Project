import java.util.Comparator;

public class PointComparatorPilotRace implements Comparator<IPilot> {
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
