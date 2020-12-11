/*
    This class represents the Cold extra complexity that "decorates" the track, so extends the TrackDecorator abstract class.
    The difference btw this extra complexity is the calculation of real complexity and distance of the track.
 */

public class ColdDecorator extends TrackDecorator{

    public ColdDecorator(ITrack track) { super(track); }
    @Override
    public double getComplexity() { return this.track.getComplexity()*1.1; }
    @Override
    public double getDistance() { return this.track.getDistance()*0.9; }
    @Override
    public String getNoumExtras(){ return "COLD " + this.track.getNoumExtras(); }
}
