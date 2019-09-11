package src;

public class ShopClient extends Client {

	public ShopClient(String pServerIP, int pServerPort) {
		super(pServerIP, pServerPort);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processMessage(String pMessage) {
		// TODO Auto-generated method stub

	}
	
	public void groesseFarbeWaehlen(String pGroesse, String pFarbe){
		this.send("TSHIRT: " + pGroesse + ":" + pFarbe);
	}
	
	public void groesseFarbeWaehlen(TShirt p){
		this.send("TSHIRT: " + p.getGroesse() + ":" + p.getFarbe());
	}
	
	public void bestaetigen(String s){
		this.send("BESTAETIGUNG:" + s);
	}
	
	public void abmelden(){
		this.send("ABMELDEN");
	}
	
	public void bestellen(Bestellung b){
		groesseFarbeWaehlen(b.getShirt());
		this.send("BESTAETIGUNG:" + ((b.getBest()) ? "ja":"nein"));
	}

}
