/*
    This class represents the Night extra complexity that "decorates" the track, so extends the TrackDecorator abstract class.
    The difference btw this extra complexity is the calculation of real complexity and distance of the track.
 */
public class NightDecorator extends TrackDecorator{

    public NightDecorator(ITrack track) { super(track); }
    @Override
    public double getComplexity() { return Math.round(super.getComplexity()*1.2*100d)/100d; }
    @Override
    public double getDistance() { return Math.round(super.getDistance()*0.8*100d)/100d; }
    @Override
    public String getNoumExtras(){ return "NIGHT " + super.getNoumExtras(); }
}
