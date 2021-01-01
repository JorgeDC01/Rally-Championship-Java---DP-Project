/*
    This class represents the Night extra complexity that "decorates" the track, so extends the TrackDecorator abstract class.
    The difference btw this extra complexity is the calculation of real complexity and distance of the track.
 */

public class WetDecorator extends TrackDecorator{

    public WetDecorator(ITrack track) { super(track); }
    @Override
    public double getComplexity() { return Math.round(this.track.getComplexity()*1.15*100d)/100d; }
    @Override
    public double getDistance() { return Math.round(this.track.getDistance()*0.85*100d)/100d; }
    @Override
    public String getNoumExtras(){ return "WET " + this.track.getNoumExtras(); }
}
