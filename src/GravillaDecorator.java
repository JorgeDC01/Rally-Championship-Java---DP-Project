public class GravillaDecorator extends TrackDecorator{

    public GravillaDecorator(ITrack track) { super(track); }

    public double getComplexity() {
        return this.track.getComplexity()*1.05;
    }

    public double getDistance() {
        return this.track.getDistance()*0.95;
    }
    public String getExtras(){
        return "GRAVILLA " + this.track.getExtras();
    }
    public void showTrack(String extra) {
        this.track.showTrack(extra);
    }
}
