/*
    Representation of all kind of valid distance about a track.
    @author Jorge del Castillo Gomez and Raul Hormigo Ceron.
 */

public enum DistanceTrack {
    SHORT(250),
    INTERMEDIATE(275),
    LONG(300);

    private final int distanceTrack;
    /*
        Initialize the distance (km).Parameterized constructor
        @param distance The length in kilometres
     */
    DistanceTrack(int distance) {
        this.distanceTrack = distance;
    }
    /*
       Return the distance of LOW, MEDIUM OR HIGHT.
       @return distance of Track
     */
    public int getDistanceTrack() {
        return this.distanceTrack;
    }
}
