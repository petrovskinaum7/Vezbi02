package zadaca6;

public class MainClass {

	public static void main(String[] args) {
		Proizvod proizvod = new Proizvod();
		proizvod.imenaproizvodot = "Chokolado";
		proizvod.tezina = "100";
		proizvod.cena = "55";
		
		System.out.println("Cenata na " + proizvod.imenaproizvodot + "to so tezina od " + proizvod.tezina + "g iznesuva " + proizvod.cena + " denari.");
	}

}
