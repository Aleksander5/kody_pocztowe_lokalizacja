package kody_pocztowe_lokalizacja;

public class Obieraczka {

		public String ObraneSzerokosc ( String wspolrzedne ){
			
			String szerokosc = null;
			
			int poczatekInt = wspolrzedne.indexOf("location")+24;
			String poczatek = wspolrzedne.substring(poczatekInt);
			
			int koniecInt = poczatek.indexOf(",");
			
			szerokosc = poczatek.substring(0, koniecInt);
			
			return szerokosc;
		}
		
		public String ObraneDlugosc ( String wspolrzedne ){
			
			String szerokosc = null;
			
			int poczatekInt = wspolrzedne.indexOf("location")+24;
			String poczatek = wspolrzedne.substring(poczatekInt);
			int koniecInt = poczatek.indexOf(",");
			
			String nowyPoczatek = poczatek.substring(koniecInt);
			int wsp1 = nowyPoczatek.indexOf("lng\": ")+6;
			int wsp2 = nowyPoczatek.indexOf("}");
			
			szerokosc = nowyPoczatek.substring(wsp1, wsp2);
			
			return szerokosc;
		}
}
