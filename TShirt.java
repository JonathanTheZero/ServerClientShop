package src;

public class TShirt {
	String farbe;
	char groesse;
	
	public TShirt(String f, char g){
		farbe = f;
		groesse = g;
	}
	
	public String getFarbe(){
		return farbe;
	}
	
	public char getGroesse(){
		return groesse;
	}
}
