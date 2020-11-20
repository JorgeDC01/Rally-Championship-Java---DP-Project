/*
    Representation of all kind of valid distance about a track.
    @author Jorge del Castillo Gomez and Raul Hormigo Ceron.
 */

public enum DistanceTrack {
    SHORT("SHORT",250.0),
    INTERMEDIATE("INTERMEDIATE",275.0),
    LONG("LONG",300.0);

    private final String name;
    private final double distanceTrack;
    /*
        Initialize the distance (km).Parameterized constructor
        @param distance The length in kilometres
     */
     DistanceTrack(String name,double distance) {

        this.distanceTrack = distance;
        this.name = name;
    }
    /*
        Return the name  LOW, MEDIUM OR HIGH.
        @return Name of track
      */
    public String getName() { return name; }

    /*
        Return the distance of LOW, MEDIUM OR HIGH.
        @return distance of Track
     */
    public double getDistanceTrack() {
        return this.distanceTrack;
    }
    /*
        Override the method toString returning the Name of the complexity and his value.
        @return String Name + Value of complexity
     */
    @Override
    public String toString() {
        return getName() + " (original: " + getDistanceTrack()+")";
    }


}
