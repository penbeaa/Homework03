package abstractTest1Pack;

public abstract class ABC {
	ABC() {
		System.out.print("Initializing ABC Class");
		
	}
	
	void FOO() {
		System.out.println("\nFOO");
		
	}
	abstract String DAY(String greeting);

}
