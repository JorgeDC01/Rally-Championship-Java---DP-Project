/*
    Representation of all kind of valid complexity about a track.
    @author Jorge del Castillo Gomez and Raul Hormigo Ceron.
 */

public enum ComplexityTrack {
    LOW("LOW",1),
    MEDIUM("MEDIUM",1.25),
    HIGH("HIGH",1.5);
    private final String name;
    private final double amountComplexity;

    /*
        Initialize the complexity with the Name and value (double).Parameterized constructor
        @param v The complexity
     */
     ComplexityTrack (String name, double v) {
         this.name = name;
        this.amountComplexity = v;
    }

    /*
        Return the amountComplexity of LOW, MEDIUM OR HIGH.
        @return Complexity
     */
    public double getAmountComplexity(){
        return this.amountComplexity;
    }
    /*
        Return the name of the complexity between LOW, MEDIUM OR HIGH.
        @return String of name
     */
    public String getName() { return name; }

    /*
        Override the method toString returning the Name of the complexity and his value.
        @return String Name + Value of complexity
     */
    @Override
    public String toString() {
        return getName() + " (original: " + getAmountComplexity()+")";
    }
}
