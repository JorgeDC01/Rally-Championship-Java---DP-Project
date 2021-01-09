/*
    This class represents the Gravel extra complexity that "decorates" the track, so extends the TrackDecorator abstract class.
    The difference btw this extra complexity is the calculation of real complexity and distance of the track.
 */
public class GravelDecorator extends TrackDecorator{
    /*
        Create the extra complexity gravel for a track.
        @param track The track that will have a new extra complexity.
     */
    public GravelDecorator(ITrack track) { super(track); }
    /*
        Get the complexity of the track.
        @return The complexity as a Double.
     */
    @Override
    public double getComplexity() { return Math.round(super.getComplexity()*1.05*100d)/100d; }
    /*
        Get the distance of the track.
        @return The distance as a Double.
     */
    @Override
    public double getDistance() { return Math.round(super.getDistance()*0.95*100d)/100d; }
    /*
        Get the extras complexities of the field track.
        @return The extra complexities as a String.
     */
    @Override
    public String getNoumExtras(){ return "GRAVEL " + super.getNoumExtras(); }
}
