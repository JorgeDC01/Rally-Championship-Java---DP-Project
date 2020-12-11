/*
    This class represents the Night extra complexity that "decorates" the track, so extends the TrackDecorator abstract class.
    The difference btw this extra complexity is the calculation of real complexity and distance of the track.
 */

public class WetDecorator extends TrackDecorator{

    public WetDecorator(ITrack track) { super(track); }
    @Override
    public double getComplexity() { return this.track.getComplexity()*1.15; }
    @Override
    public double getDistance() { return this.track.getDistance()*0.85; }
    @Override
    public String getNoumExtras(){ return "WET " + this.track.getNoumExtras(); }
}
