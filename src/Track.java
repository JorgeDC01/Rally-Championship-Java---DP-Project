/* The class track represents the kind of tracks where pilots will take part
with their respective cars.
@author: Jorge del Castillo Gómez and Raul Hormigo Cerón
 */
import java.util.HashSet;
/*
    The class track represents the tracks where pilots will take part with their
    respective cars. The difference btw tracks are the complexity and distance to
    go down the track. This two settings will have influence in the efficiency of
    the pilot.
 */
public class Track {
    private String nameTrack;
    private ComplexityTrack complexity;
    private DistanceTrack distance;
   // private final HashSet<ExtraComplexity> extraComplexities;

    /*
        Initialize the distance (km).Parameterized constructor
        @param String nameTrack (name of the track) ComplexityTrack and DistanceTrack
     */
    public Track (String nameTrack, ComplexityTrack complexity, DistanceTrack distance) {
    setComplexity(complexity);
    setDistance(distance);
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
    public void setComplexity(ComplexityTrack complexity){
        this.complexity = complexity;
    }
    /*
        Set the distance of the track on distance
        @param DistanceTrack distance of track as parameter
     */
    public void setDistance(DistanceTrack distance){
        this.distance = distance;
    }
    /*
        Show in console the track's information (Name, Original and current Complexity, Original and current Distance
        It hasn't got parameters.
     */

    public void showTrack(){
        System.out.println("Track's name: " + nameTrack + ", Complexity: " + complexity.toString() + ", Distance: " + distance.toString());
    }










        /*
         Initialize the instance Track.
         It's a default constructor.
      */
    /*public Track () {
        nameTrack = "";
        complexity[0] = new ComplexityTrack();
        distance[0] = new DistanceTrack();
        complexity[0] = new ComplexityTrack();
        complexity[0] = new ComplexityTrack();
        extraComplexities = new HashSet<>();

    }
    */



    /*
       Return the complexity of the track
       @return Complexity of the track

    public ComplexityTrack getOriginalComplexity() {
        return this.complexity[0];
    }
    /*
        Return the distance in kilometres of the track
        @return Distance of Track

    public DistanceTrack getOriginalDistance() {
        return this.distance[0];
    }

    //public ComplexityTrack getCurrentComplexity(){
       // return this.complexity[1];
    //}

    public DistanceTrack getCurrentDistance(){
        return this.distance[1];
    }
    */



    /*
    public void setComplexityTrack (ComplexityTrack complexity) {
        this.complexity[0] = complexity;
        this.complexity[1] = complexity;
    }

    public void setDistanceTrack (DistanceTrack distance) {
        this.distance[0] = distance;
        this.distance[1] = distance;
    }
    */
    /*public void setExtraComplexities (ExtraComplexity extraComplexity) {
        extraComplexities.add(extraComplexity);
        // Operate with the factorComplexity and factorDistance
        complexity[1].setComplexityTrack( extraComplexity.getComplexityFactor() * complexity[0].getAmount());
        distance[1].setDistanceTrack(extraComplexity.getDistanceFactor() * distance[0].getDistanceTrack());
    }
    /*
     */
    /*public void showTrack(){
        String information;
        information = getNameTrack() + "Conditions: ";
        for(ExtraComplexity aux: extraComplexities){
            information += aux.getName() + ", ";
        }
        information += "Complexity: original: " + this.complexity[0] + ".Current: " + this.complexity[1] + ".Distance: original: " + this.distance[0] + ".Current: " + this.distance[1];
        System.out.println(information);
    }
    */

}
