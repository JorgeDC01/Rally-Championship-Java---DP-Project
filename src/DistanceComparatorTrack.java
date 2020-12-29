import java.util.Comparator;
/*
    A comparator that compares the distance btw 2 tracks.
 */
public class DistanceComparatorTrack implements Comparator<ITrack> {
    /*
        Compare two tracks about their distances.
        @param t1 The first track
        @param t2 The second track that will be compared with the first one.
        @return 1 if t1 > t2; 0 if t1 = t2; -1 if t1 < t2
     */
    @Override
    public int compare(ITrack t1, ITrack t2) {
        if(t1.getDistance() == t2.getDistance())
            return 0;
        else if(t1.getDistance() > t2.getDistance()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
