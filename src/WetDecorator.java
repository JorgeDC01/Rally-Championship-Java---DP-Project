/*
    This class represents the Night extra complexity that "decorates" the track, so extends the TrackDecorator abstract class.
    The difference btw this extra complexity is the calculation of real complexity and distance of the track.
 */

public class WetDecorator extends TrackDecorator{
    /*
      Create the extra complexity wet for a track.
      @param track The track that will have a new extra complexity.
     */
    public WetDecorator(ITrack track) { super(track); }
    /*
        Get the complexity of the track.
        @return The complexity as a Double.
     */
    @Override
    public double getComplexity() { return Math.round(this.track.getComplexity()*1.15*100d)/100d; }
    /*
        Get the distance of the track.
        @return The distance as a Double.
     */
    @Override
    public double getDistance() { return Math.round(this.track.getDistance()*0.85*100d)/100d; }
    /*
        Get the extras complexities of the field track.
        @return The extra complexities as a String.
     */
    @Override
    public String getNoumExtras(){ return "WET " + this.track.getNoumExtras(); }
}
