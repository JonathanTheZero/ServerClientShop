package src;

public class ShopServer extends Server {

	public ShopServer(int pPort) {
		super(pPort);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processNewConnection(String pClientIP, int pClientPort) {
		this.send(pClientIP, pClientPort, "Willkommen! W�hlen Sie eine Gr��e und eine Farbe f�r ihr T-Shirt.");

	}

	@Override
	public void processMessage(String pClientIP, int pClientPort, String pMessage) {
		String[] nachrichtenTeil = pMessage.split(":");
		if(nachrichtenTeil[0].equals("TSHIRT")){
			this.send(pClientIP, pClientPort, "Die Gr��e ist " + nachrichtenTeil[1] + ", die Farbe ist "+nachrichtenTeil[2]+ " und es kostet 19,99�! Bitte Best�tigen sie diese Bestellung");
		}
		else if(nachrichtenTeil[0].equals("BESTAETIGUNG")){
			if(nachrichtenTeil[1].equals("ja")){
				this.send(pClientIP, pClientPort, "Vielen Dank f�r ihre Bestellung!");
				closeConnection(pClientIP, pClientPort);
			}
			else if(nachrichtenTeil[1].equals("nein")){
				closeConnection(pClientIP, pClientPort);
			}
			else{
				this.send(pClientIP, pClientPort, "Bitte geben Sie ja oder nein ein");
			}
		}
		else if(nachrichtenTeil[0].equals("ABMELDEN")){
			closeConnection(pClientIP, pClientPort);
		}
		else {
			this.send(pClientIP, pClientPort, "Bitte korrigieren Sie ihre Eingabe");
		}
	}

	@Override
	public void processClosingConnection(String pClientIP, int pClientPort) {
		// TODO Auto-generated method stub

	}

}
