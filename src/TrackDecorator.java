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
    public double getComplexity(){
        return this.track.getComplexity();
    }
    /*
        Get the distance of the track
        @return The distance as a Double
     */
    public double getDistance(){
        return this.track.getDistance();
    }
}
