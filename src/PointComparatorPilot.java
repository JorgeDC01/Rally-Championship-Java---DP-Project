import java.util.Comparator;
/*
    A comparator that compares the points btw 2 Pilots. In case of equality, The pilots will
    be compared with their skills.
 */
public class PointComparatorPilot implements Comparator<IPilot> {
    /*
        Compare two pilots about points.
        @param p1 The first pilot
        @param p2 The second pilot that will be compared with the first one.
        return 1 if p1 > p2; 0 if p1 = p2 and -1 if p1 < p2.
     */
    @Override
    public int compare(IPilot p1, IPilot p2) {
        if(p1.totalPointsStored() == p2.totalPointsStored()){
            return new SkillComparatorPilot().compare(p1,p2);
        }
        else if(p1.totalPointsStored() > p2.totalPointsStored()){
            return 1;
        }
        else {
            return -1;
        }
    }
}




