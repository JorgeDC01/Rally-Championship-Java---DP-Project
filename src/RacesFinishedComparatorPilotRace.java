/*
       Comparator of pilots about the races finished to sort them before the race.
 */
import java.util.Comparator;

public class RacesFinishedComparatorPilotRace implements Comparator<IPilot> {
    /*
        This method override the compare of two Pilots about their numbers of races finished. In case of equality, about
        their names in a ascendant way.
        @return Int
     */
    @Override
    public int compare(IPilot p1, IPilot p2) {
        if(p1.numberRacesCompeted() == p2.numberRacesCompeted()){
            return p1.getNamePilot().compareTo(p2.getNamePilot());
        }
        else if(p1.totalPointsStored() > p2.totalPointsStored()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
