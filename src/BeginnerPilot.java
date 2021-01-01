/*
    The class Pilot who is a beginner. The skills will be calculated in a different way in relation with
    other pilots.
    Override the method calculateSkills that is abstract in the class Pilot
 */
public class BeginnerPilot extends Pilot {
    /*
        Initialize the beginner pilot. This Parameterized constructor calls the super constructor
        which is protected.
        @param namePilot The name of the pilot as a String
        @param carPilot The car assigned as a Car
        @param concentration The concentration of the pilot.
     */
    protected BeginnerPilot(String namePilot, ICar carPilot, Concentration concentration) {
        super(namePilot, carPilot, concentration);
    }
    /*
        This method is override from Pilot. Calculate the skills of the pilot with
        specific constant.
        @return The skills of a pilot as a Double
     */
    @Override
    public double calculateSkills() {
        double v = Math.round((((getConcentration().getConcentrationPilot() * 0.97) / 120) - 0.03)*100d)/100d;
        return v;
    }
    /*
       Override the toString method
       @return The output of a pilot as a String
    */
    @Override
    public String toString() {
        return "Pilot: " + getNamePilot() + ", Tipo: Beginner" + ", Skills: " + calculateSkills() + ", Conc: " + getConcentration().getName() + "("+ getConcentration().getConcentrationPilot() + ")" + ", Descalificado: " + getDisqualifyPilot();
    }
}
