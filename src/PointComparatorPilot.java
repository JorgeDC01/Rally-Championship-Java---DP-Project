import java.util.Comparator;
/*
    A comparator that compares the points btw 2 Pilots. In case of equality, The pilots will
    be compared with their skills.
 */
public class PointComparatorPilot implements Comparator<IPilot> {
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




