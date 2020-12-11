/*
    This class represents a general decorator of a track (general extraComplexity), so that this class implements the ITrack interface.
    It has a reference to a ITrack: A track or a decorator.
    @author: Jorge del Castillo Gómez
 */
public abstract class TrackDecorator implements ITrack{
    protected ITrack track;
    /*
        The decorator will have the last track that can be decorated or not.
        @param The track
     */
    public TrackDecorator(ITrack track){
        this.track = track;
    }
    /*
        Get the complexity of the track
        @return The complexity as a Double
     */
    public double getComplexity(){ return this.track.getComplexity(); }
    /*
        Get the distance of the track
        @return The distance as a Double
     */
    public double getDistance(){ return this.track.getDistance(); }
    /*
        Get the extras complexities of the field track
        @return The extra complexities as a String
     */
    public String getNoumExtras(){ return this.track.getNoumExtras(); }
    /*
       Return the name of the track
       @return Name of the track
    */
    public String getNameTrack(){ return this.track.getNameTrack(); }
    /*
        Get  the distance of a track in km
        @return the distance of a track as a Double
     */
    public DistanceTrack getOriginalDistance(){ return this.track.getOriginalDistance(); }
    /*
        Get the complexity of the track.
        @return The complexity of the track as a Double
     */
    public ComplexityTrack getOriginalComplexity(){ return this.track.getOriginalComplexity(); }
    /*
        Override the method toString of collection.
        @return The output of a track as a String
    */
    @Override
    public String toString() {
        return "Track's name: " + getNameTrack() + ", cond: " + getNoumExtras() + ", Complexity: " + getOriginalComplexity() + ", actual: " + getComplexity() +
                ", Distance: " + getOriginalDistance() + ", actual: " + getDistance();
    }
}
