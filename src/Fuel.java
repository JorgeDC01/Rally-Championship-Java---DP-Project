/*
    Representation of all kind of valid speeds about a car and the methods toString,
    Speed and gets.
    @author Jorge del Castillo Gomez
 */
public enum Fuel {

    RARE("RARE",350),
    NORMAL("NORMAL",440),
    LARGE("LARGE",460),
    ELEPHANT("ELEPHANT",480);

    private final String name;
    private final double amountFuel;

    /*
        Parameterized constructor of the fuel.
        @param name The name of the kind of fuel
        @param amountFuel The amount of fuel related with his name.
     */
    Fuel(String name, double amountFuel) {
        this.name = name;
        this.amountFuel = amountFuel;
    }

    /*
        Return the initial fuel of a car
        @return A float initial Fuel of a car
     */
    public double getAmountFuel() { return amountFuel; }
    /*
        Return the Name of a specific fuel
        @return String Name of a specific fuel from a car
     */
    public String getName() { return name; }
    /*
        Override the method toString returning the Name of the fuel and the initial value
        @return String comb: NAME(VALUE)
     */
    @Override
    public String toString() {
        return "comb: " + getName() + "(" + getAmountFuel() + ")";}
}
