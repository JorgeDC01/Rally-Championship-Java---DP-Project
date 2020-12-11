/*
    The class track represents the basic tracks (WITHOUT EXTRA COMPLEXITIES) where pilots will take part with their
    respective cars. The difference btw tracks are the complexity and distance to
    go down the track. This two settings will have influence in the efficiency of
    the pilot. This class implements the ITrack interface with the methods getComplexity,
    getDistance, getNoumExtras, getOriginalComplexity, getOriginalDistance and getNameTrack.
    @author: Jorge del Castillo Gómez
 */
public class Track implements ITrack{
    private String nameTrack;
    private ComplexityTrack originalComplexity;
    private DistanceTrack originalDistance;

    /*
        Initialize the distance (km).Parameterized constructor
        @param String nameTrack (name of the track) ComplexityTrack and DistanceTrack
     */
    public Track (String nameTrack, ComplexityTrack complexity, DistanceTrack distance) {
    setOriginalComplexity(complexity);
    setOriginalDistance(distance);
    setNameTrack(nameTrack);
    }
    /*
       Return the name of the track
       @return Name of the track
     */
    public String getNameTrack() {
        return this.nameTrack;
    }
    /*
        Set the name of the track on NameTrack
        @param name The name of the track(String)
     */
    public void setNameTrack (String name) {
        this.nameTrack = name;
    }
    /*
        Set the complexity of the track on complexity
        @param Complexity complexity  of track
     */
    public void setOriginalComplexity(ComplexityTrack complexity){
        this.originalComplexity = complexity;
    }
    /*
        Get the complexity of the track (name and value)
        @return The complexity of the track as a Complexity
     */
    public ComplexityTrack getOriginalComplexity(){ return originalComplexity; }
    /*
        Set the distance of the track on distance
        @param The  DistanceTrack of track as parameter
     */
    public void setOriginalDistance(DistanceTrack distance){
        this.originalDistance = distance;
    }
    /*
        Get the Distance of track (name and distance in km)
        @return the distance of a track as a DistanceTrack
     */
    public DistanceTrack getOriginalDistance(){ return this.originalDistance; }
    /*
        Get the real complexity of the track
        @return Complexity as a Double
     */
    public double getComplexity(){
        return getOriginalComplexity().getAmountComplexity();
    }
    /*
        Get the real distance of the track
        @return The distance as a Double
     */
    public double getDistance(){
        return getOriginalDistance().getDistanceTrack();
    }
    /*
        Get " " as a extra complexity of a default track (without extra complexities)
        @return String nothing
     */
    public String getNoumExtras(){
        return "";
    }
    /*
       Override the method toString of collection.
       @return The output of a track as a String
    */
    @Override
    public String toString(){
        return "Track's name: " + getNameTrack() + ", cond: " + getNoumExtras() + ", Complexity: " + getOriginalComplexity() + ", actual: " + getComplexity() + ", Distance: " + getOriginalDistance() + ", actual: " + getDistance();
    }
}
