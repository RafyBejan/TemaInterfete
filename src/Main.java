
public class Main {

	public static void main(String[] args) {
		ContBancar cb1 = new Lei("7897890",12393);
		ContBancar cb2 = new Euro("780870",6890);
		
		Client c1 = new Client("Ionel","Stefan cel Mare",cb1,cb2);
		
		Banca b = new Banca("89790");
		
		b.addClient(c1);
		
		b.afisareClient("Ionel");
	}

}
