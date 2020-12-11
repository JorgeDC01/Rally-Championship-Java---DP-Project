public class NocturnoDecorator extends TrackDecorator{

    public NocturnoDecorator(ITrack track) {
        super(track);
    }

    public double getComplexity() {
        return this.track.getComplexity()*1.2;
    }

    public double getDistance() {
        return this.track.getDistance()*0.95;
    }

    public String getExtras(){
        return "NOCTURNO " + this.track.getExtras();
    }

    public void showTrack(String extra) {
        this.track.showTrack(extra);
    }
}
