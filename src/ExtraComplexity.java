/*
    Representation of all kind of valid distance about a track.
    @author Jorge del Castillo Gomez and Raul Hormigo Ceron.
 */

public enum ExtraComplexity {
    NIGHT (1.2,0.8,"NIGHT"),
    WET (1.15,0.85,"WET"),
    COLD (1.1,0.9,"COLD"),
    GRAVEL (1.05,0.95,"GRAVEL");

    private final double complexityFactor;
    private final double distanceFactor;
    private final String name;
    /*
        Initialize the ExtraComplexity. Parameterized constructor.
        @param Factor that have influence in the track's complexity.
        @param Factor that have influence in the track's distance.
     */
    ExtraComplexity(double complexityFactor, double distanceFactor,String name) {
        this.complexityFactor = complexityFactor;
        this.distanceFactor = distanceFactor;
        this.name = name;
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
    /*
         Return the name of the factor ExtraComplexity
         @return String The name of the extraComplexity
       */
    public String getName() { return this.name;}
}
