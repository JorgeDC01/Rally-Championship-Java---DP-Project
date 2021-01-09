import java.util.Comparator;
public class RacesCompletedComparatorTeam implements Comparator<Team>{

    /*
        This method override the method compare from the interface Comparator. Compares two teams about the races completed finished
        by their pilots, in case of equality about the names of the team.
        @param t1 The first team that will be compare.
        @param t2 The second team that will be compared.
        @return 1 if races completed of t1 > races completed of t2 and -1 in the other case.
     */
    @Override
    public int compare(Team t1, Team t2) {
        if(t1.getRacesCompleted()== t2.getRacesCompleted()){
            return t1.getNameTeam().compareTo(t2.getNameTeam());
        }
        else if(t1.getRacesCompleted() > t2.getRacesCompleted()){
            return 1;
        }
        else{
            return -1;
        }
    }
}