/*
    This class represents the Night extra complexity that "decorates" the track, so extends the TrackDecorator abstract class.
    The difference btw this extra complexity is the calculation of real complexity and distance of the track.
 */
public class NightDecorator extends TrackDecorator{

    public NightDecorator(ITrack track) { super(track); }
    @Override
    public double getComplexity() { return super.getComplexity()*1.2; }
    @Override
    public double getDistance() { return super.getDistance()*0.8; }
    @Override
    public String getNoumExtras(){ return "NIGHT " + super.getNoumExtras(); }
}
