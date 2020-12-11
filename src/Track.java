/*
    The class track represents the tracks where pilots will take part with their
    respective cars. The difference btw tracks are the complexity and distance to
    go down the track. This two settings will have influence in the efficiency of
    the pilot.
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
        Set the distance of the track on distance
        @param DistanceTrack distance of track as parameter
     */
    public void setOriginalDistance(DistanceTrack distance){
        this.originalDistance = distance;
    }
    /*
        Show in console the track's information (Name, Original and current Complexity, Original and current Distance
        It hasn't got parameters.
     */

    public void showTrack(String extra){
        System.out.println( "Track's name: " + nameTrack + ", cond: " + extra + ", Complexity: " + originalComplexity.toString() +", actual: " + getComplexity() + ", Distance: " + originalDistance.toString() + ", actual: " + getDistance());
    }
    /*
        Get  the distance of a track in km
        @return the distance of a track as a Double
     */
    public double getOriginalDistance(){ return this.originalDistance.getDistanceTrack(); }
    /*
        Get the complexity of the track.
        @return The complexity of the track as a Double
     */
    public double getOriginalComplexity(){ return originalComplexity.getAmountComplexity(); }
    /*
        Get the real complexity of the track
        @return Complexity as a Double
     */
    public double getComplexity(){
        return getOriginalComplexity();
    }
    /*
        Get the real distance of the track
        @return The distance as a Double
     */
    public double getDistance(){
        return getOriginalDistance();
    }
    public String getExtras(){
        return " ";
    }
}
