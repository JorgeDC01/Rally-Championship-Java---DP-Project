/*
    This class represents the Night extra complexity that "decorates" the track, so extends the TrackDecorator abstract class.
    The difference btw this extra complexity is the calculation of real complexity and distance of the track.
 */
public class NightDecorator extends TrackDecorator{
    /*
          Create the extra complexity night for a track.
          @param track The track that will have a new extra complexity.
     */
    public NightDecorator(ITrack track) { super(track); }
    /*
        Get the complexity of the track.
        @return The complexity as a Double.
     */
    @Override
    public double getComplexity() { return Math.round(super.getComplexity()*1.2*100d)/100d; }
    /*
        Get the distance of the track.
        @return The distance as a Double.
     */
    @Override
    public double getDistance() { return Math.round(super.getDistance()*0.8*100d)/100d; }
    /*
        Get the extras complexities of the field track.
        @return The extra complexities as a String.
     */
    @Override
    public String getNoumExtras(){ return "NIGHT " + super.getNoumExtras(); }
}
