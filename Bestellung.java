package src;

public class Bestellung {
	
	TShirt shirt;
	boolean best;

	public Bestellung(TShirt t, boolean b){
		shirt = t;
		best = b;
	}
	
	public TShirt getShirt(){
		return shirt;
	}
	
	public boolean getBest(){
		return best;
	}
}
