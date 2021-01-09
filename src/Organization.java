/*
    This class represents the management of the championship.
    It will exit only one instance of this organization during the simulation.
    (Singleton)
    This class is formed with:
    - neglectLimit: the maximum times that a pilot can leave in the championship.
    - numberPilotsLimit: the maximum number of pilots that a team can send to a race.
    - tracks: contains all the tracks of the championship
    - comparatorTracks: Is the strategy used to order the ArrayList of tracks.
    - ascOrDescTracks: True if the tracks will be sorted in a ascendant way or false if it 'll be sorted in a descendant way.
    - teamsOrganization: The collection of teams that registered at the Organization of the Championship.
 */
import java.util.*;
public class Organization {

    private static Organization instance;
    private int neglectLimited;
    private int numberPilotsLimited;
    private List<ITrack> tracksOrganization;
    private Comparator<ITrack> comparatorTracks;
    private boolean ascOrDescTracks;
    private Set<Team> teamsOrganization;
    private List<IPilot> pilotsRace;
    private Comparator<IPilot> comparatorPilotsRace;

    /*
        Private constructor parameterized. It will be called just only if the instance of Organization hasn't been created
        sent to a race by a Team as a Int.
     */
    private Organization() {
        this.tracksOrganization = new ArrayList<ITrack>();
        this.teamsOrganization = new HashSet<Team>();
        this.pilotsRace = new ArrayList<IPilot>();
    }

    /*
        Public static method that represents the pattern Singleton. If the instance isn't created, it will create the unique instance of
        the Organization. In the other case, return the instance.
        @param The limit of neglect by a pilot as Int and The maximum pilots that a team can send to a race..
        @return The unique instance of Organization created.
     */
    public static Organization getInstance() {
        if (instance == null) {
            return instance = new Organization();
        }
        return instance;
    }

    /*
        This method is similar to a parameterized constructor, but I called it different because of the Singleton. So that
        this method sets the config of the unique instance of Organization.
        @param neglect The limited neglect by a pilot in the championship as a Int.
        @param numbersPilotsLimited The limited number of pilots that a team can send to the same race.
        @param comparatorTracks The comparator used to order the tracks.
        @param ascOrDescTracks Represents if teh collection of tracks will be sorted in a ascendant way or descendant way.
     */
    public void setConfigOrganization(int neglectLimited, int numberPilotsLimited, Comparator<ITrack> comparatorTracks, boolean ascOrDescTracks, Comparator<IPilot> comparatorPilotsRace) {
        setAscOrDescTracks(ascOrDescTracks);
        setComparator(comparatorTracks);
        setNeglectLimited(neglectLimited);
        setNumberPilotsLimited(numberPilotsLimited);
        this.comparatorPilotsRace = comparatorPilotsRace;
    }

    /*
        Set the comparator strategy to order the tracks of teh Championship.
        @param comp The comparator to set.
     */
    public void setComparator(Comparator<ITrack> comp) {
        this.comparatorTracks = comp;
    }

    /*
        Get the comparator used to order the collection of tracks.
        @return The comparator of tracks.
     */
    public Comparator<ITrack> getComparatorTracks() {
        return comparatorTracks;
    }

    /*
        Get the neglect limited for a team.
        @return The times that a pilot can leave in the championship as a Int.
     */
    public int getNeglectLimited() {
        return neglectLimited;
    }

    /*
        Set the neglect limited as a Int.
        @param neglectLimited The times that a pilot can leave in the championship as a Int.
     */
    public void setNeglectLimited(int neglectLimited) {
        this.neglectLimited = neglectLimited;
    }

    /*
        Get the maximum numbers of pilots that can be sent to a race.
        @return The limited numbers of pilots that can be sent as a Int.
     */
    public int getNumberPilotsLimited() {
        return numberPilotsLimited;
    }

    /*
        Set the numbers of pilots that can be sent to a race.
        @param numbersPilotsLimited The numbers of pilots limited to send as a Int.
     */
    public void setNumberPilotsLimited(int numberPilotsLimited) {
        this.numberPilotsLimited = numberPilotsLimited;
    }

    /*
        Get the collection of tracks that are taking part in the championship.
        @return The tracks of the Organization as a List.
     */
    public List<ITrack> getTracksOrganization() {
        return tracksOrganization;
    }

    /*
        Set the collection of tracks that the Organization has.
        @param tracksOrganization The collection of tracks as a List.
     */
    public void setTracksOrganization(List<ITrack> tracksOrganization) {
        this.tracksOrganization = tracksOrganization;
    }

    /*
        Get the direction from the order of tracks.
        @return True if the tracks are sort in a ascendant way and false in the other case.
     */
    public boolean isAscOrDescTracks() {
        return ascOrDescTracks;
    }

    /*
        Set the direction to order the tracks.
        @param ascOrDescTracks The direction: True if is ascendant and false if it's descendant.
     */
    public void setAscOrDescTracks(boolean ascOrDescTracks) {
        this.ascOrDescTracks = ascOrDescTracks;
    }

    /*
        Get the collection of teams of the Organization.
        @return The collection of teams as a Set.
     */
    public Set<Team> getTeamsOrganization() {
        return teamsOrganization;
    }

    /*
        Set the collection of teams as a Set.
        @param teamsOrganization The collection of Teams as a Set.
     */
    public void setTeamsOrganization(Set<Team> teamsOrganization) {
        this.teamsOrganization = teamsOrganization;
    }

    /*
        This method get the list of pilots that will compete in a race.
        @return The list of pilots.
     */
    public List<IPilot> getPilotsRace() {
        return this.pilotsRace;
    }

    /*
        Set the group of pilots that will compete in the race.
        @param pilotsRace The list of pilots that will compete.
    */
    public void setPilotsRace(List<IPilot> pilotsRace) {
        this.pilotsRace = pilotsRace;
    }

    /*
        Add a new pilot to the list of pilots that will compete in the same race.
        @param pilot The pilot given to be added.
     */
    public void addPilotRace(IPilot pilot) {
        getPilotsRace().add(pilot);
    }

    /*
        Set the comparator to sort the pilots that will compete in the race.
        @param comp The comparator to order the pilots.
     */
    public void setComparatorPilotsRace(Comparator<IPilot> comp) {
        this.comparatorPilotsRace = comp;
    }

    /*
        Get the comparator to have sorted the pilots that will compete in a race.
        @return Comparator of the pilots.
     */
    public Comparator<IPilot> getComparatorPilotsRace() {
        return this.comparatorPilotsRace;
    }

    /*
        This method sorts the tracks of the Organization depending on the strategy chosen.
     */
    public void sortTracksOrganization() {
        if (isAscOrDescTracks()) {
            Collections.sort(getTracksOrganization(), getComparatorTracks());
        } else {
            Collections.sort(getTracksOrganization(), Collections.reverseOrder(getComparatorTracks()));
        }
    }

    /*
        Show all the tracks of the Organization, after ordering them.
     */
    public void showTracksOrganization() {
        sortTracksOrganization();
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n" +
                            "||||||||||||||||||| CIRCUITOS DEL CAMPEONATO |||||||||||||||||||" +
                            "\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        Iterator<ITrack> it = getTracksOrganization().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("");
    }

    /*
        This method sorts the pilots that will compete in the race of the Organization depending on the strategy chosen.
    */
    public void sortPilotsRace() {
        Collections.sort(getPilotsRace(), getComparatorPilotsRace());
    }

    /*
        Shoe all the pilots that will compete in the race.
     */
    public void showPilotsRaceOrganization() {
        for (IPilot pilot : getPilotsRace())
            System.out.println(pilot.toString());
    }

    /*
        The Organization will register a team into the championship.
        @param team The team that will be registered if it hasn't been registered before.
     */
    public void registeredTeam(Team team) {
        if (this.teamsOrganization.contains(team)) {
            System.out.println("%The team is already registered in the Organization.%");
        } else {
            this.teamsOrganization.add(team);
        }
    }

    /*
        Add a new track into the championship.
        @param track The track where the pilots will be taken part.
     */
    public void addTrack(ITrack track) {
        if (getTracksOrganization().contains(track)) {
            System.out.println("%The track is already added in the Organization.%");
        } else {
            getTracksOrganization().add(track);
        }
    }

    /*
        Show all the tracks that will compete in the championship.
     */
    public void showTeamsOrganization() {
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n" +
                            "%%%%%%%% ESCUDERÍAS DEL CAMPEONATO %%%%%%%%\n" +
                            "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        for (Team team : getTeamsOrganization()) {
            System.out.println(team);
        }
        System.out.println("");
    }

    /*
        Method that manage the championship.
     */
    public void management() {
        showTracksOrganization();
        showTeamsOrganization();
        //First loop process the races with his turn.
        Iterator<ITrack> it = getTracksOrganization().iterator();
        boolean notEnoughPilots = false;
        int indexTrack = 1;
        while(it.hasNext() && !notEnoughPilots) {
            ITrack track = it.next();

            System.out.println("********************************************************************************************************\n" +
                                "*** " + "CARRERA<" + indexTrack + "> EN " + track);
            addPilots();                            //Añade los pilotos de todas las escuderias a la lista.
            sortPilotsRace();                   // Ordena la parrilla de salida de la carrera.
            if (getPilotsRace().size() > 1) {       //Si el numero de pilots es mayor que 1, se puede correr la carrera.
                System.out.println("********************************************************************************************************\n********************************************************************************************************\n" +
                                    "********************************  Pilotos que van a competir en " + track.getNameTrack() + " ********************************\n" +
                                    "********************************************************************************************************");
                showPilotsRaceOrganization();       // Muestro pilotos que van a competir en la carrera.
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n" +
                                    "+++++++++++++++++++++++++ Comienza la carrera en " + track.getNameTrack() + " +++++++++++++++++++++++++\n" +
                                    "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

                int indexPilot = 1;
                for (IPilot pilot : getPilotsRace()) {
                    System.out.println("@@@ " + "Piloto " + indexPilot + " de " + getPilotsRace().size() + "\n" + pilot.toString() + "\n" + pilot.getCarPilot().toString());
                    pilot.drivePilot(track);        // Cada piloto conduce en la carrera y muestra la informacion.
                    indexPilot++;
                }

                // Entrega de puntos a los pilotos que han corrido la carrera.
                assignPoints(track.getNameTrack());
                // Mostrar la clasificación de la carrera.
                showResultsRace(track.getNameTrack());
            }
            else{
                notEnoughPilots = true;     //No hay suficientes pilotos para correrse la carrera
                System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡\n" +
                                    "!!! No se celebra esta carrera ni la(s) siguiente(s) por no haber pilotos para competir !!!\n" +
                                    "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                if(getPilotsRace().size() == 0){        // Si todos los pilotos están descalificados

                    System.out.println("****************************************************\n" +
                                        "**************** FIN DEL CAMPEONATO ****************\n" +
                                        "****************************************************\n" +
                                        "********** CLASIFICACIÓN FINAL DE PILOTOS **********\n" +
                                        "****************************************************\n" +
                                        "¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡\n" +
                                        "¡¡¡ Campeonato de pilotos queda desierto por haber sido descalificados todos los pilotos !!!\n" +
                                        "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    showDisqualifiedPilots();
                    showClasificationTeams();
                }
                else{                                   // Si solo queda un piloto sin descalificar, es el ganador.
                    showQualifiedPilots();
                    showDisqualifiedPilots();
                    showClasificationTeams();
                }
            }
            getPilotsRace().clear();
            indexTrack++;
            for(Team team: getTeamsOrganization()){
                team.sortCars();
                team.sortPilots();
            }
        }
        // This case is when the final pilots qualified are more than 1.
        if(!notEnoughPilots){
            showQualifiedPilots();
            showDisqualifiedPilots();
            showClasificationTeams();
        }
    }

    /*
        This method requests  all teams to send to  Organization their pilots available to run. After that, the Organization
        will add at maximum numbersPilotLimited for each team.
     */
    public void addPilots() {
        for (Team team : getTeamsOrganization()) {
            // sendPilotsTeam: metodo que solicita a las escuderias mandar pilotos que tengan disponibles con coches a la carrera de turno i.
            List<IPilot> lPilots = team.sendPilotsTeam();
            Iterator<IPilot> it = lPilots.iterator();
            int count = 0;
            while (it.hasNext() && count < getNumberPilotsLimited()) {
                getPilotsRace().add(it.next());
                count++;
            }
        }
    }

    /*
        This method will assign points to the pilots that have run a race depending on the time needed to finish the race.
        @param nameTrack The name of the track where the race will take place.
     */
    public void assignPoints(String nameTrack) {
        // First of all, I need to order the list of pilots that have competed about their times in a descendant way.
        Collections.sort(getPilotsRace(), new TimeComparatorPilotsRace());
        //showPilotsRaceOrganization();
        boolean stopNegativePoints = false;
        int index = 0;
        for(int i = 0; (i < getPilotsRace().size()) && (!stopNegativePoints); i++){ // Calculo la posicion del primer piloto al que hay que asignar 10 puntos.
            if(getPilotsRace().get(i).specificResultTrack(nameTrack).getTime() >= 0){
                stopNegativePoints = true;
                index = i;
            }
        }

        int indexPilots = 1;        //Indica la posición del piloto, según la cual se le asignará una cantidad de puntos
        if (stopNegativePoints) {
            for (int i = index; i < getPilotsRace().size(); i++) {
                IPilot pilot = getPilotsRace().get(i);
                switch (indexPilots) {
                    case 1:
                        pilot.assignPointsPilot(nameTrack, 10);
                        break;
                    case 2:
                        pilot.assignPointsPilot(nameTrack, 8);
                        break;
                    case 3:
                        pilot.assignPointsPilot(nameTrack, 6);
                        break;
                    case 4:
                        pilot.assignPointsPilot(nameTrack, 4);
                        break;
                    default:
                        pilot.assignPointsPilot(nameTrack, 2);
                        break;
                }
                indexPilots++;
                //System.out.println(pilot.specificResultTrack(nameTrack));
            }
        }
    }
    /*
        Show the classification of the track where the race took place.
        @param nameTrack The name of the track where the race have made.
     */
    public void showResultsRace(String nameTrack){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n" +
                            "+++++++++++++++++ Clasificación final de la carrera en " + nameTrack + " +++++++++++++++++\n" +
                            "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        int indexPilot = 1;
        Collections.sort(getPilotsRace(), new PointComparatorPilotSpecificRace());
        for(IPilot pilot: getPilotsRace()) {
            if(pilot.specificResultTrack(nameTrack).getPoints() != 0) {
                System.out.println("@@@ Posición(" + indexPilot + "): " + pilot.getNamePilot() + " - " + pilot.specificResultTrack(nameTrack).toString() + " @@@");
            }
            else{
                if(pilot.getDisqualifyPilot()){
                    System.out.println("!!! Ha abandonado " + pilot.getNamePilot() + " - " + pilot.specificResultTrack(nameTrack) + " - Además ha sido descalificado para el resto del Campeonato !!!");
                }
                else{
                    System.out.println("!!! Ha abandonado " + pilot.getNamePilot() + " - " + pilot.specificResultTrack(nameTrack) + " !!!");

                }
            }
            indexPilot++;
        }
    }
    /*
        Println in console the list of all pilots that are qualified sorted about their points, in case of equality about
        the total of races finished,in case of equality about the name of the pilot in a descendant way.
     */
    public void showQualifiedPilots() {
        List<IPilot> qualifiedPilots = new ArrayList<IPilot>();
        for(Team team: getTeamsOrganization()) {
            for (IPilot pilot : team.qualifiedPilotsTeam()) {
                qualifiedPilots.add(pilot);
            }
        }
        //Ordeno los pilotos no descalificados.
        Collections.sort(qualifiedPilots,Collections.reverseOrder(new PointComparatorPilotRace()));
        int index = 1;
        System.out.println("****************************************************\n" +
                            "**************** FIN DEL CAMPEONATO ****************\n" +
                            "****************************************************\n" +
                            "********** CLASIFICACIÓN FINAL DE PILOTOS **********\n" +
                            "****************************************************");
        for(IPilot pilot: qualifiedPilots){
            pilot.showResult(index);
            System.out.println("");
            index++;
        }
    }
    /*
        Println in console the list of all pilots that are disqualified sorted about their points, in case of equality about
        the total of races finished,in case of equality about the name of the pilot in a descendant way.
     */
    public void showDisqualifiedPilots(){
        List<IPilot> disqualifiedPilots = new ArrayList<IPilot>();
        for(Team team: getTeamsOrganization()) {
            for (IPilot pilot : team.disqualifiedPilotsTeam()) {
                disqualifiedPilots.add(pilot);
            }
        }
        //Ordeno los pilotos descalificados.
        Collections.sort(disqualifiedPilots,Collections.reverseOrder(new PointComparatorPilotRace()));
        System.out.println("****************************************************\n" +
                            "************** PILOTOS DESCALIFICADOS **************\n" +
                            "****************************************************");
        for(IPilot pilot: disqualifiedPilots){
            pilot.showResult(0);
            System.out.println("");
        }
    }
    /*
        Println in console the list of all teams that are qualified sorted about their points, in case of equality about
        the total of races finished,in case of equality about the name of the team in a descendant way.
     */

    public void showClasificationTeams(){
        System.out.println("****************************************************\n" +
                            "******** CLASIFICACIÓN FINAL DE ESCUDERÍAS *********\n" +
                            "****************************************************");
        List<Team> teamsQualified = new ArrayList<Team>();
        List<Team> teamsDisqualified = new ArrayList<Team>();
        for(Team team: getTeamsOrganization()){
            if(team.isQualifiedTeamEnd()){
                teamsQualified.add(team);
            }
            else{
                teamsDisqualified.add(team);
            }
        }
        Collections.sort(teamsQualified, Collections.reverseOrder(new PointsComparatorTeam()));
        Collections.sort(teamsQualified, Collections.reverseOrder(new PointsComparatorTeam()));
        int indexPosition = 1;

        if(teamsQualified.size() == 0){
            System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡\n" +
                                "¡¡¡ Campeonato de escuderías queda desierto por haber sido descalificados todos los pilotos !!!\n" +
                                "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        else{
            for(Team team: teamsQualified){
                team.sortPilots();
                team.sortCars();
                System.out.println("@@@ Posición(" + indexPosition + ") " + team.getNameTeam() + " con " + team.pointsTeam() + " puntos " + " @@@");
                System.out.println(team);
                indexPosition++;
            }
        }

        System.out.println("****************************************************\n" +
                            "************ ESCUDERIAS DESCALIFICADAS *************\n" +
                            "****************************************************");
        for(Team team: teamsDisqualified){
            team.sortPilots();
            team.sortCars();
            System.out.println("!!! Escudería descalificada: " + team.getNameTeam() + " con 0 puntos" + " !!!");
            System.out.println(team);
        }
    }
}
