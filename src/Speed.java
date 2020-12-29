/*
    Representation of all kind of valid speeds about a car and the methods toString,
    Speed and gets.
    @author Jorge del Castillo Gomez
 */
public enum Speed {
    TURTLE("TURTLE",200),
    SLOW("SLOW",210),
    NORMAL("NORMAL",220),
    FAST("FAST",230),
    CHEETAH("CHEETAH",240);

    private final String name;
    private final double amountSpeed;
    /*
        Parameterized constructor.
        @param name The name of the speed.
        @param speed The amount of speed related with his name.
     */
    Speed(String name,double speed) {
    this.name = name;
    this.amountSpeed = speed;}
    /*
        Return the speed of a car between TURTLE,SLOW,NORMAL,FAST AND CHEETAH
        @return A float theory Speed of a car
     */
    public double getSpeed() { return amountSpeed; }
    /*
        Return the Name of the speed
        @return String Name of speed
     */
    public String getName() { return name; }
    /*
        Override the method toString returning the Name of the car and his theory speed
        @return String Name + Speed(theory)
     */
    @Override
    public String toString() {
        return "vel_teo: " + getName() + "(" + getSpeed() + ")";
    }
}
