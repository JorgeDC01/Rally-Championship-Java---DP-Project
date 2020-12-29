/*
    The class Pilot who is experienced. The skills will be calculated in a different way in relation with
    other pilots.
    Override the method calculateSkills that is abstract in the class Pilot
 */
public class ExperiencedPilot extends Pilot {
    /*
        Initialize the experienced pilot. This Parameterized constructor calls the super constructor which is protected.
        @param namePilot The name of the experienced pilot as a String
        @param carPilot The car assigned to a experienced pilot
        @param concentration The concentration of the experienced pilot
     */
    protected ExperiencedPilot(String namePilot, ICar carPilot, Concentration concentration) {
        super(namePilot, carPilot, concentration);
    }
    /*
        This method is override from Pilot. Calculate the skills of the experienced pilot with
        specific constant.
        @return The skills of a experienced pilot as a Double
    */
    @Override
    public double calculateSkills() {
        double v = ((getConcentration().getConcentrationPilot() + 3) / 130)*1.03;
        return v;
    }
    /*
       Override the toString method
       @return The output of a experienced pilot as a String
    */
    @Override
    public String toString() {
        return "Pilot: " + getNamePilot() + ", Tipo: Experienced" + ", Skills: " + calculateSkills() + ", Conc: " + getConcentration().getName() + "("+ getConcentration().getConcentrationPilot() + ")" + ", Descalificado: " + getDisqualifyPilot();
    }
}
