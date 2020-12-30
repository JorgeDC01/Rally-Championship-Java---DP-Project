import java.util.Comparator;
public class PointComparatorPilotSpecificRace implements Comparator<IPilot>{
    /*
        Override the method compare of two pilots depending on the points got by two pilots in the same race.
        @param p1 The first pilot that will be compared and p2 The second pilot.
        @return 1 if points of the first pilot is greater than the second's points. -1 if its lower and 0 if both are equals.
     */
    @Override
    public int compare(IPilot p1, IPilot p2) {
        if(p1.specificResultTrack(p1.getActualTrack()).getPoints() == p2.specificResultTrack(p2.getActualTrack()).getPoints())
            return 0;
        else if(p1.specificResultTrack(p1.getActualTrack()).getPoints() > p2.specificResultTrack(p2.getActualTrack()).getPoints()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
