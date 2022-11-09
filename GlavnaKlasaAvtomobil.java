package zadaca4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Avtomobil avtomobil1 = new Avtomobil ();
        avtomobil1.marka = "Audi";
        avtomobil1.model = "A3";
        avtomobil1.pominatikm = 9000;
        
        
        System.out.println(avtomobil1.marka + " " + avtomobil1.model + " so pominati " + avtomobil1.pominatikm + "km");
        
        Avtomobil avtomobil2 = new Avtomobil ("Nissan","Note",100000);
        
        
        System.out.println(avtomobil2.marka + " " + avtomobil2.model + " so pominati " + avtomobil2.pominatikm + "km");
        
        		
	}

}
