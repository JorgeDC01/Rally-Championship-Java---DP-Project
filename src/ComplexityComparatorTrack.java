import java.util.Comparator;
/*
    A comparator that compares the complexity btw 2 tracks.
 */
public class ComplexityComparatorTrack implements Comparator<ITrack> {
    @Override
    /*
        Compare two tracks about their complexities.
        @param t1 The first track that will be compared.
        @param t2 The second track that will be compared.
        @return 1 if t1 > t2. 0 if t1 = t2. -1 if t1 < t2
     */
    public int compare(ITrack t1, ITrack t2) {
        if(t1.getComplexity() == t2.getComplexity())
            return 0;
        else if(t1.getComplexity() > t2.getComplexity()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
