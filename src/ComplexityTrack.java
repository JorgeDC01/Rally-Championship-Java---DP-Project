/*
    Representation of all kind of valid complexity about a track.
    @author Jorge del Castillo Gomez and Raul Hormigo Ceron.
 */

public enum ComplexityTrack {
    LOW(1),
    MEDIUM(1.25),
    HIGHT(1.5);

    private double amountComplexity;

    /*
        Initialize the complexity.Parameterized constructor
        @param v The complexity
     */
    ComplexityTrack(double v) {
        this.amountComplexity = v;
    }

    /*
        Return the amountComplexity of LOW, MEDIUM OR HIGHT.
        @return Complexity
     */
    public double getAmount(){
        return this.amountComplexity;
    }
}
