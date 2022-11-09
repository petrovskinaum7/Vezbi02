package Zadaca5;

public class Predmet {
 public String imenapredmetot;
 public String profesor;
 int krediti;
 public String semestar;
 
 public Predmet() {
	 
 }
 
 public Predmet(String imenapredmetot) {
	 this.imenapredmetot = imenapredmetot;
 }
 
 public Predmet(String imenapredmetot, String profesor,int krediti) {
	 this.imenapredmetot = imenapredmetot;
	 this.profesor = profesor;
	 this.krediti = krediti;
 }
 
}
