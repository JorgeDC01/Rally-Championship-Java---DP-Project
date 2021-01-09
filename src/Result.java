/*
    This class represents the result of a Pilot in any track. The result is formed with the
    time competed by a pilot in a track and the points which he got.
 */
public class Result {
    private double time;
    private int points;

    /*
        Initialize the result of a pilot. Default Constructor
    */
    public Result(){
        time = 0;
        points = 0;
    }
    /*
        Initialize the result of a pilot. Parameterized Constructor.
        @param time The time competed in a race by a pilot.
        @param points The points earned as a int.
     */
    public Result(double time,int points){
        this.time = time;
        this.points = points;
    }

    /*
        Get the time competed by a pilot in a race.
        @return The time competed by a pilot as a Float.
     */
    public double getTime() { return time; }
    /*
        Set the pilot's time competed in a race.
        @param time The time of the result done by a pilot.
     */
    public void setTime(double time) { this.time = time; }
    /*
        Get the points earned by a pilot in a race.
        @return The points got by a pilot.
     */
    public int getPoints() { return points; }
    /*
        Set the pilot's points got in a race.
        @param points The points of the result.
     */
    public void setPoints(int points) { this.points = points; }
    /*
        Override the method toString of the interface Object.
        @return The information of pilot's result in a track as as String.
     */
    @Override
    public String toString() {
        return "Time: " + getTime() + " minutes - " + "Points: " + getPoints();
    }
    /*
        Override the method hashCode of the interface Object.
        @return The code of a result as a Int.
     */
    @Override
    public int hashCode() {
       int result = 17;
       result = (int) (7*result + getTime());
       result = 11*result + getPoints();
       return result;
    }
    /*
        Override the method equals of the interface Object.
        @param obj The obj that will be compared if both are equals.
        @return True if both results are identical, in the other case False.
     */
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof Result)) {
            return false;
        }
        Result other = (Result) obj;
        return getTime() == other.getTime() && getPoints() == other.getPoints();
    }
}
