/*
    Comparator to sort teams about their points earned.
 */
import java.util.Comparator;
public class PointsComparatorTeam implements Comparator<Team>{

    /*
        This method override the method compare from the interface Comparator. Compares two teams about the points got
        by their pilots, in case of equality about the numbers of races ended by their pilots.
        @param t1 The first team that will be compare.
        @param t2 The second team that will be compared.
        @return 1 if points of t1 > points of t2 and -1 in the other case.
     */
    @Override
    public int compare(Team t1, Team t2) {
        if(t1.pointsTeam() == t2.pointsTeam()){
            return new RacesCompletedComparatorTeam().compare(t1,t2);
        }
        else if(t1.pointsTeam() > t2.pointsTeam()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
