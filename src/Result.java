/*
    This class represents the result of a Pilot in any track. The result is formed with the
    time competed by a pilot in a track and the points that he got.
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
        Initialize the result of a pilot. Parameterized Constructor
        @param The time competed in a race by a pilot as a Float, and The points earned as a int
     */
    public Result(double time,int points){
        this.time = time;
        this.points = points;
    }

    /*
        Get the time competed by a pilot in a race.
        @return The time competed by a pilot as a Float
     */
    public double getTime() { return time; }
    /*
        Set the pilot's time competed in a race
        @param The time as a Float
     */
    public void setTime(double time) { this.time = time; }
    /*
        Get the points earned by a pilot in a race.
        @return The points got by a pilot as a Int
     */
    public int getPoints() { return points; }
    /*
        Set the pilot's points got in a race
        @param The points as a Int
     */
    public void setPoints(int points) { this.points = points; }
    /*
        Override the method toString of the interface Object.
        @return The information of pilot's result in a track as as String
     */
    @Override
    public String toString() {
        return "Time: " + getTime() + " minutes - " + "Points: " + getPoints() + " @@@";
    }
    /*
        Override the method hashCode of the interface Object
        @return The code of a result as a Int
     */
    @Override
    public int hashCode() {
       int result = 17;
       result = (int) (7*result + getTime());
       result = 11*result + getPoints();
       return result;
    }
    /*
        Override the method equals of the interface Object
        @return True if both results are identical, in the other case False
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
