import java.util.Comparator;
/*
/*
    A comparator that compares the skills  btw 2 Pilots. In case of equality, The pilots will
    be compared with their names.
 */
public class SkillComparatorPilot implements Comparator<Pilot>{
    @Override
    public int compare(Pilot p1, Pilot p2) {
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
