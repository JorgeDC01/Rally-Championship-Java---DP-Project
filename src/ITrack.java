/*
    The interface of a Track and the decorator. This interface will declare the comon methods
    that will be used at decorator and at track.
    @author: Jorge del Castillo Gómez
 */

public interface ITrack {
     /*
        Get the real complexity of the track.
        @return Complexity as a Double.
     */
     double getComplexity();
     /*
        Get the real distance of the track.
        @return The distance as a Double.
     */
     double getDistance();
     /*
        Get " " as a extra complexity of a default track (without extra complexities).
        @return String nothing.
     */
     String getNoumExtras();
     /*
       Return the name of the track.
       @return Name of the track.
     */
     String getNameTrack();
     /*
        Set the name of the track on NameTrack.
        @param name The name of the track.
     */
     void setNameTrack(String nameTrack);
     /*
        Get the Distance of track (name and distance in km).
        @return the distance of a track as a DistanceTrack.
     */
     DistanceTrack getOriginalDistance();
     /*
        Get the complexity of the track (name and value).
        @return The complexity of the track as a Complexity.
     */
     ComplexityTrack getOriginalComplexity();
     /*
        Set the complexity of the track on complexity.
        @param complexity The complexity of the track.
     */
     void setOriginalComplexity(ComplexityTrack complexity);
     /*
        Set the distance of the track on distance.
        @param distance The distance of track.
     */
     void setOriginalDistance(DistanceTrack distance);
}

