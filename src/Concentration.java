public enum Concentration {
    SCATTERBRAIN("SCATTERBRAIN",90),
    NORMAL("NORMAL",100),
    CONCENTRATED("CONCENTRATED",110),
    ZEN("ZEN",120);

    private final String name;
    private final double concentrationPilot;
    /*
        Initialize a Concentration with his name and his amount. Parameterized constructor
        @param The name as a String and The amount of concentration as a int
    */
    Concentration(String name,int concentration) {
        this.name = name;
        this.concentrationPilot= concentration;
    }
    /*
        Get the name of an object from this enum.
        @return The name of the concentration as a String
     */
    public String getName() {return name;}
    /*
        Get the amount of concentration of an object from this enum.
        @return The amount of pilot's concentration as a int.
     */
    public double getConcentrationPilot() {return concentrationPilot;}
    /*
       Override the method toString returning the Name of the concentration and his value.
       @return String Name + Value of concentration
    */
    @Override
    public String toString() {
        return "conc: " + getName() + "(" + getConcentrationPilot() + ")";
    }
}
