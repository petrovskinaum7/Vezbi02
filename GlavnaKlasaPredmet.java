package Zadaca5;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predmet predmet1 = new Predmet ();
		predmet1.imenapredmetot = "Matematika 1";
		predmet1.profesor = "Pece Martinovski";
		predmet1.krediti = 6;
		predmet1.semestar = "Prv";
		
		Predmet predmet2 = new Predmet ("Angliski jazik");
	    predmet2.profesor = "Jovana Krstevska";
		predmet2.krediti = 5;
		predmet2.semestar = "Vtor";
		
		Predmet predmet3 = new Predmet ("Matematika 2", "Nikola Nikolovski", 6);
		predmet3.semestar = "Vtor";
		
		System.out.println(predmet1.imenapredmetot + " " + predmet1.profesor + " " + predmet1.krediti + " krediti " + predmet1.semestar + " semestar");
		System.out.println(predmet2.imenapredmetot + " " + predmet2.profesor + " " + predmet2.krediti + " krediti " + predmet2.semestar + " semestar");
		System.out.println(predmet3.imenapredmetot + " " + predmet3.profesor + " " + predmet3.krediti + " krediti " + predmet3.semestar + " semestar");
	}

}
