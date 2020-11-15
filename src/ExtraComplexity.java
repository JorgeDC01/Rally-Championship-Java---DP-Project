/*
    Representation of all kind of valid distance about a track.
    @author Jorge del Castillo Gomez and Raul Hormigo Ceron.
 */

public enum ExtraComplexity {
    NIGHT (1.2,0.8),
    WET (1.15,0.85),
    COLD (1.1,0.9),
    GRAVEL (1.05,0.95);

    private  double complexityFactor;
    private  double distanceFactor;
    /*
        Initialize the ExtraComplexity. Parameterized constructor.
        @param Factor that have influence in the track's complexity.
        @param Factor that have influence in the track's distance.
     */
    ExtraComplexity(double complexityFactor, double distanceFactor) {
        this.complexityFactor = complexityFactor;
        this.distanceFactor = distanceFactor;
    }
    /*
        Return the complexity's factor of a variety
        @return The factorComplexity
     */
    public double getComplexityFactor() {
        return this.complexityFactor;
    }
    /*
        Return the distance's factor
        @return The factorDistance
      */
    public double getDistanceFactor() {
        return this.distanceFactor;
    }
}
