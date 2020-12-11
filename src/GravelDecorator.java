/*
    This class represents the Gravel extra complexity that "decorates" the track, so extends the TrackDecorator abstract class.
    The difference btw this extra complexity is the calculation of real complexity and distance of the track.
 */
public class GravelDecorator extends TrackDecorator{

    public GravelDecorator(ITrack track) { super(track); }
    @Override
    public double getComplexity() { return super.getComplexity()*1.05; }
    @Override
    public double getDistance() { return super.getDistance()*0.95; }
    @Override
    public String getNoumExtras(){ return "GRAVEL " + super.getNoumExtras(); }
}
