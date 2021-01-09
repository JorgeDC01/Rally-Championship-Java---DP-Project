/*
    Comparator of pilots about their skills.
 */
import java.util.Comparator;
/*
    A comparator that compares the skills  btw 2 Pilots. In case of equality, The pilots will
    be compared with their names.
 */
public class SkillComparatorPilot implements Comparator<IPilot>{
    /*
        Compare two pilots about their skills.
        @param p1 The first pilot.
        @param p2 The second pilot.
        @return 1 if p1 > p2; 0 if p1 = p2 and -1 if p1 < p2.
     */
    @Override
    public int compare(IPilot p1, IPilot p2) {
        if(p1.calculateSkills() == p2.calculateSkills()){
            return p1.getNamePilot().compareTo(p2.getNamePilot());
        }
        else if(p1.calculateSkills() > p2.calculateSkills()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
