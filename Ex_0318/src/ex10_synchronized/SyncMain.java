package ex10_synchronized;

public class SyncMain {
	public static void main(String[] args) {
		
		SyncEx atm = new SyncEx();
		Thread mom = new Thread(atm, "엄마");
		Thread son = new Thread(atm, "아들");
		
		mom.start();
		son.start();
		
	}//main
}
