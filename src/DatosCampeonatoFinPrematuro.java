/**
 * Clase que inicializa la simulación con datos con los que 
 * el campeonato termina antes por tener un solo piloto sin descalificar
 * 
 * @author profesores DP 
 * @version 20/21
 */
public class DatosCampeonatoFinPrematuro {
	public DatosCampeonatoFinPrematuro() {
		System.out.println("*********************************************************************************************************");
		System.out.println("****ESTA SIMULACIÓN CONCLUYE ANTES DE FINALIZAR EL CAMPEONATO CON UN ÚNICO PILOTO SIN DESCALIFICAR****");
		System.out.println("*********************************************************************************************************\n");

		initData();
	}


	private void initData() {
		//organizador debe ser una instancia única con la siguiente configuración:
		//LimiteAbandonos=1, LimitePilotos=3, 
		// Circuitos ordenados de forma descendente de acuerdo a su complejidad
		Organization org = Organization.getInstance();
		org.setConfigOrganization(1,3,new ComplexityComparatorTrack(), false,new PointComparatorPilotRace());
			//Añadimos los circuitos a la organización.
			ITrack t1;
			t1 = new Track("PORTUGAL", ComplexityTrack.MEDIUM, DistanceTrack.INTERMEDIATE);
			t1 = new GravelDecorator(t1);
			t1 = new NightDecorator(t1);
			org.addTrack(t1);

			t1 = new Track("AUSTRALIA",ComplexityTrack.LOW,DistanceTrack.LONG);
			t1 = new GravelDecorator(t1);
			org.addTrack(t1);

			t1 = new Track("CERDEÑA",ComplexityTrack.HIGH,DistanceTrack.SHORT);
			t1 = new GravelDecorator(t1);
			t1 = new WetDecorator(t1);
			org.addTrack(t1);

			t1 = new Track("CÓRCEGA",ComplexityTrack.MEDIUM,DistanceTrack.INTERMEDIATE);
			t1 = new NightDecorator(t1);
			t1 = new GravelDecorator(t1);
			org.addTrack(t1);

			t1 = new Track("FINLANDIA",ComplexityTrack.HIGH,DistanceTrack.SHORT);
			t1 = new NightDecorator(t1);
			t1 = new ColdDecorator(t1);
			t1 = new WetDecorator(t1);
			org.addTrack(t1);

			t1 = new Track("ALEMANIA",ComplexityTrack.MEDIUM,DistanceTrack.INTERMEDIATE);
			t1 = new WetDecorator(t1);
			org.addTrack(t1);

			t1 = new Track("CHILE",ComplexityTrack.HIGH,DistanceTrack.SHORT);
			t1 = new GravelDecorator(t1);
			org.addTrack(t1);

		//Creamos las escuderías y se registran en la Organización.
		Team T1 = new Team("Peugeot",false,false,new PointComparatorPilot(),new FuelComparatorCar());
		T1.registerTeam();

		Team T2 = new Team("Citroen",true,true,new PointComparatorPilot(),new FuelComparatorCar());
		T2.registerTeam();

		Team T3 = new Team("Seat",false,false,new PointComparatorPilot(),new FuelComparatorCar());
		T3.registerTeam();
		// Pilotos y coches de citroen
		T2.addPilot(new ExperiencedPilot("Loeb",null,Concentration.NORMAL));
		T2.addPilot(new StarPilot("Makinen",null,Concentration.ZEN));
		T2.addPilot(new BeginnerPilot("Auriol",null,Concentration.NORMAL));
		T2.addCar(new ResistantCar("Citröen C5",Speed.FAST,Fuel.ELEPHANT));
		T2.addCar(new FastCar("Citröen C4",Speed.FAST,Fuel.RARE));
		T2.addCar(new NormalCar("Citröen C3",Speed.FAST,Fuel.RARE));
		T2.sortPilots();
		T2.sortCars();

		//creamos los pilotos y coches de seat
		T3.addPilot(new ExperiencedPilot("Ogier",null,Concentration.NORMAL));
		T3.addPilot(new StarPilot("McRae",null,Concentration.CONCENTRATED));
		T3.addPilot(new BeginnerPilot("Blomquist",null,Concentration.SCATTERBRAIN));
		T3.addCar(new ResistantCar("Seat Tarraco",Speed.TURTLE,Fuel.LARGE));
		T3.addCar(new FastCar("Seat Ateca",Speed.CHEETAH,Fuel.LARGE));
		T3.addCar(new NormalCar("Seat Arona",Speed.FAST,Fuel.RARE));
		T3.sortPilots();
		T3.sortCars();

		//coches y pilotos de peugeot
		T1.addPilot(new ExperiencedPilot("Kankunnen",null,Concentration.CONCENTRATED));
		T1.addPilot(new StarPilot("Sainz",null,Concentration.ZEN));
		T1.addPilot(new BeginnerPilot("Sordo",null,Concentration.SCATTERBRAIN));
		T1.addCar(new ResistantCar("Peugeot 5008",Speed.SLOW,Fuel.LARGE));
		T1.addCar(new FastCar("Peugeot 3008",Speed.CHEETAH,Fuel.NORMAL));
		T1.addCar(new NormalCar("Peugeot 2008",Speed.NORMAL,Fuel.RARE));
		T1.sortPilots();
		T1.sortCars();

	}

}
