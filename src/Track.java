/* The class track represents the kind of tracks where pilots will take part
with their respective cars.
@author: Jorge del Castillo Gómez and Raul Hormigo Cerón
 */

import java.util.HashSet;

public class Track {
    private String nameTrack;
    private ComplexityTrack complexity;
    private DistanceTrack distance;
    private HashSet<ExtraComplexity> extraComplexities;
    /*
         Initialize the instance Track.
         It's a default constructor.
      */
    public Track(){
        nameTrack = "";
        complexity = NULL;
        distance = NULL;
        ExtraComplexities = NULL;
    }
    /*
        Initialize the distance (km).Parameterized constructor
        @param distance The length in kilometres
     */
    public Track(String nameTrack, ComplexityTrack complexity, DistanceTrack distance, HashSet<ExtraComplexity> extraComplexities) {
        this.nameTrack = nameTrack;
        this.complexity = complexity;
        this.distance = distance;
        ExtraComplexities = extraComplexities;
    }
    /*
       Return the name of the track
       @return Name of the track
     */
    public String getNameTrack() {
        return this.nameTrack;
    }
    /*
       Return the complexity of the track
       @return Complexity of the track
     */
    public ComplexityTrack getComplexity() {
        return this.complexity;
    }
    /*
        Return the distance in kilometres of the track
        @return Distance of Track
     */
    public DistanceTrack getDistance() {
        return this.distance;
    }

}
